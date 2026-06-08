package com.rustic.companionplanter.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.rustic.companionplanter.data.GardenRepository
import com.rustic.companionplanter.data.PlantRepository
import com.rustic.companionplanter.data.SeasonalTip
import com.rustic.companionplanter.data.SeasonalTips
import com.rustic.companionplanter.data.SubscriptionManager
import com.rustic.companionplanter.model.PlantResult
import com.rustic.companionplanter.model.SavedPlant
import com.rustic.companionplanter.model.UiState
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel(app: Application) : AndroidViewModel(app) {

    private val ctx get() = getApplication<Application>().applicationContext

    private val _uiState = MutableStateFlow<UiState>(UiState.Idle)
    val uiState: StateFlow<UiState> = _uiState.asStateFlow()

    val isSubscribed: StateFlow<Boolean> = SubscriptionManager.isSubscribed
    val gardenPlants: StateFlow<List<SavedPlant>> = GardenRepository.plants
    val seasonalTip: SeasonalTip = SeasonalTips.current()

    init {
        GardenRepository.init(ctx)
    }

    fun search(query: String) {
        if (query.isBlank()) {
            _uiState.value = UiState.Error("Type a plant name or pick a photo first.")
            return
        }
        viewModelScope.launch {
            _uiState.value = UiState.Loading
            delay(400)
            val (allCompanions, badNeighbors) = PlantRepository.lookup(query)
            if (allCompanions.isEmpty()) {
                _uiState.value = UiState.Error("No companions found for \"$query\".")
                return@launch
            }
            val limit = if (SubscriptionManager.isSubscribed.value) allCompanions.size
                        else SubscriptionManager.FREE_LIMIT
            _uiState.value = UiState.Success(
                PlantResult(
                    query        = query.trim(),
                    companions   = allCompanions.take(limit),
                    totalAvailable = allCompanions.size,
                    badNeighbors = badNeighbors
                )
            )
        }
    }

    fun addToGarden(name: String)    = GardenRepository.add(ctx, name)
    fun removeFromGarden(name: String) = GardenRepository.remove(ctx, name)
    fun isInGarden(name: String)     = GardenRepository.contains(name)

    fun toggleSubscription() {
        SubscriptionManager.setSubscribed(!SubscriptionManager.isSubscribed.value)
        (_uiState.value as? UiState.Success)?.let { search(it.result.query) }
    }

    fun reset() { _uiState.value = UiState.Idle }
}
