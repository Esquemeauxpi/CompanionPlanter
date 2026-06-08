package com.rustic.companionplanter

import android.app.Application
import coil.Coil
import coil.ImageLoader
import okhttp3.OkHttpClient

class CompanionPlanterApp : Application() {
    override fun onCreate() {
        super.onCreate()

        // Wikimedia (and many CDNs) reject requests without a real User-Agent.
        // We build a custom OkHttpClient that sends one, then hand it to Coil.
        val okHttpClient = OkHttpClient.Builder()
            .addInterceptor { chain ->
                val request = chain.request().newBuilder()
                    .header(
                        "User-Agent",
                        "CompanionPlanterApp/1.0 (Android; contact@example.com)"
                    )
                    .build()
                chain.proceed(request)
            }
            .build()

        Coil.setImageLoader(
            ImageLoader.Builder(this)
                .okHttpClient(okHttpClient)
                .crossfade(true)
                .build()
        )
    }
}
