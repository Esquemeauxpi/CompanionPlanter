package com.rustic.companionplanter.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rustic.companionplanter.data.PlantRepository
import com.rustic.companionplanter.data.SubscriptionManager
import com.rustic.companionplanter.model.PlantResult
import com.rustic.companionplanter.model.UiState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {

    private val _uiState = MutableStateFlow<UiState>(UiState.Idle)
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    val isSubscribed: StateFlow<Boolean> = SubscriptionManager.isSubscribed

    /** Search by typed name, or by a label derived from a chosen photo. */
    fun search(query: String) {
        if (query.isBlank()) {
            _uiState.value = UiState.Error("Type a plant name or pick a photo first.")
            return
        }
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            delay(500) // simulate work; replace with a real call when available
            val all = PlantRepository.lookup(query)
            if (all.isEmpty()) {
                _uiState.value = UiState.Error("No companions found for \"$query\".")
                return@launch
            }
            val limit = if (SubscriptionManager.isSubscribed.value) all.size
                        else SubscriptionManager.FREE_LIMIT
            _uiState.value = UiState.Success(
                PlantResult(
                    query = query.trim(),
                    companions = all.take(limit),
                    totalAvailable = all.size
                )
            )
        }
    }

    /** Demo toggle — replace with Google Play Billing in production. */
    fun toggleSubscription() {
        SubscriptionManager.setSubscribed(!SubscriptionManager.isSubscribed.value)
        // Re-run last query so the new limit takes effect immediately.
        (_uiState.value as? UiState.Success)?.let { search(it.result.query) }
    }

    fun reset() { _uiState.value = UiState.Idle }
}