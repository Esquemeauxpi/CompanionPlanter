package com.rustic.companionplanter.model

data class Companion(
    val name: String,
    val reason: String,
    val imageUrl: String
)

data class PlantResult(
    val query: String,
    val companions: List<Companion>,
    val totalAvailable: Int
)

sealed interface UiState {
    data object Idle : UiState
    data object Loading : UiState
    data class Success(val result: PlantResult) : UiState
    data class Error(val message: String) : UiState
}