package com.rustic.companionplanter

import android.app.Application
import android.util.Log
import coil.Coil
import coil.ImageLoader
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit

class CompanionPlanterApp : Application() {
    override fun onCreate() {
        super.onCreate()

        val logging = HttpLoggingInterceptor { message ->
            Log.d("CoilHTTP", message)
        }.apply { level = HttpLoggingInterceptor.Level.BASIC }

        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(30, TimeUnit.SECONDS)
            .readTimeout(30, TimeUnit.SECONDS)
            .writeTimeout(30, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .addInterceptor { chain ->
                val request = chain.request().newBuilder()
                    .header("User-Agent",
                        "Mozilla/5.0 (Android 13; Mobile) CompanionPlanterApp/1.0")
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
