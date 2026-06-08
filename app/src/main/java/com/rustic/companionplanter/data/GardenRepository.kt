package com.rustic.companionplanter.data

import android.content.Context
import com.rustic.companionplanter.model.SavedPlant
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

object GardenRepository {

    private const val PREFS = "garden_prefs"
    private const val KEY   = "saved_plants"

    private val _plants = MutableStateFlow<List<SavedPlant>>(emptyList())
    val plants: StateFlow<List<SavedPlant>> = _plants

    fun init(context: Context) {
        _plants.value = load(context)
    }

    fun add(context: Context, name: String) {
        val trimmed = name.trim().replaceFirstChar { it.uppercase() }
        if (_plants.value.any { it.name.equals(trimmed, ignoreCase = true) }) return
        val updated = _plants.value + SavedPlant(trimmed)
        _plants.value = updated
        save(context, updated)
    }

    fun remove(context: Context, name: String) {
        val updated = _plants.value.filterNot { it.name.equals(name, ignoreCase = true) }
        _plants.value = updated
        save(context, updated)
    }

    fun contains(name: String) =
        _plants.value.any { it.name.equals(name, ignoreCase = true) }

    private fun save(context: Context, list: List<SavedPlant>) {
        context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .edit()
            .putString(KEY, list.joinToString("|") { it.name })
            .apply()
    }

    private fun load(context: Context): List<SavedPlant> {
        val raw = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
            .getString(KEY, "") ?: ""
        return if (raw.isBlank()) emptyList()
        else raw.split("|").filter { it.isNotBlank() }.map { SavedPlant(it) }
    }
}
