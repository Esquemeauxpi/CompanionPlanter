package com.rustic.companionplanter.network

/**
 * Seam for a real backend. The app ships working against the local
 * [com.rustic.companionplanter.data.PlantRepository], but when you have a
 * server (companion lookup + image identification), define a Retrofit
 * interface here and call it from the ViewModel instead.
 *
 * Example:
 *
 * interface PlantApi {
 *     @GET("companions")
 *     suspend fun byName(@Query("name") name: String): CompanionResponse
 *
 *     @Multipart
 *     @POST("identify")
 *     suspend fun byImage(@Part image: MultipartBody.Part): CompanionResponse
 * }
 *
 * For photo identification you would upload the selected image bytes to your
 * endpoint, receive the detected plant name, then resolve its companions.
 */
object PlantApi