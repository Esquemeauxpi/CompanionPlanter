package com.rustic.companionplanter

import android.app.Application
import android.util.Log
import coil.Coil
import coil.ImageLoader
import okhttp3.Dispatcher
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

class CompanionPlanterApp : Application() {
    override fun onCreate() {
        super.onCreate()

        val logging = HttpLoggingInterceptor { message ->
            Log.d("CoilHTTP", message)
        }.apply { level = HttpLoggingInterceptor.Level.BASIC }

        // Limit to 2 concurrent image requests so Wikimedia
        // doesn't rate-limit us with 429s.
        val dispatcher = Dispatcher().apply {
            maxRequestsPerHost = 2
            maxRequests = 2
        }

        val okHttpClient = OkHttpClient.Builder()
            .dispatcher(dispatcher)
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .addInterceptor { chain ->
                val request = chain.request().newBuilder()
                    .header(
                        "User-Agent",
                        "Mozilla/5.0 (Linux; Android 13) CompanionPlanterApp/1.0"
                    )
                    .header("Accept", "image/webp,image/jpeg,image/png,*/*")
                    .build()
                chain.proceed(request)
            }
            .addInterceptor(logging)
            .build()

        Coil.setImageLoader(
            ImageLoader.Builder(this)
                .okHttpClient(okHttpClient)
                .crossfade(true)
                .respectCacheHeaders(false)
                .build()
        )
    }
}
