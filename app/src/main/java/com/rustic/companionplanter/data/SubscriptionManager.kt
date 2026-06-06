package com.rustic.companionplanter.data

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

/**
 * Tracks whether the user has an active paid subscription.
 *
 * In production, replace [setSubscribed] with a Google Play Billing flow
 * (BillingClient) and persist the entitlement. The rest of the app only
 * reads [isSubscribed], so swapping the implementation is isolated here.
 */
object SubscriptionManager {

    const val FREE_LIMIT = 2

    private val _isSubscribed = MutableStateFlow(false)
    val isSubscribed: StateFlow<Boolean> = _isSubscribed

    fun setSubscribed(value: Boolean) {
        _isSubscribed.value = value
    }
}