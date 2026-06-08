package com.rustic.companionplanter.model

data class Companion(
    val name: String,
    val reason: String,
    val imageUrl: String,
    val sun: String = "Full sun",
    val water: String = "Moderate",
    val tip: String = ""
)

data class BadNeighbor(
    val name: String,
    val reason: String
)

data class PlantResult(
    val query: String,
    val companions: List<Companion>,
    val totalAvailable: Int,
    val badNeighbors: List<BadNeighbor> = emptyList()
)

data class SavedPlant(
    val name: String,
    val addedMs: Long = System.currentTimeMillis()
)

sealed interface UiState {
    data object Idle : UiState
    data object Loading : UiState
    data class Success(val result: PlantResult) : UiState
    data class Error(val message: String) : UiState
}
