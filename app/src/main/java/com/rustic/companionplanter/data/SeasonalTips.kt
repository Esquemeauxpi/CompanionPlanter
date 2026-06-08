package com.rustic.companionplanter.data

import java.util.Calendar

data class SeasonalTip(val season: String, val emoji: String, val tip: String)

object SeasonalTips {

    private val spring = listOf(
        SeasonalTip("Spring", "🌱", "Start tomatoes, peppers and basil indoors 6-8 weeks before your last frost date."),
        SeasonalTip("Spring", "🌱", "Direct-sow carrots and lettuce as soon as soil can be worked."),
        SeasonalTip("Spring", "🌱", "Plant marigold seeds now — they'll be ready to companion-plant by early summer.")
    )

    private val summer = listOf(
        SeasonalTip("Summer", "☀️", "Watch for aphids in the heat — interplanted nasturtiums act as a natural trap crop."),
        SeasonalTip("Summer", "☀️", "Succession-sow lettuce every 2 weeks in a shaded spot to avoid bolting."),
        SeasonalTip("Summer", "☀️", "Keep basil well-watered and pinch flowers to extend the season alongside your tomatoes.")
    )

    private val autumn = listOf(
        SeasonalTip("Autumn", "🍂", "Plant garlic now to overwinter — it's a great companion for roses next year."),
        SeasonalTip("Autumn", "🍂", "Sow a cover crop like clover to fix nitrogen and prepare beds for spring companions."),
        SeasonalTip("Autumn", "🍂", "Cut back lavender and catmint by a third before first frost to keep them healthy.")
    )

    private val winter = listOf(
        SeasonalTip("Winter", "❄️", "Plan next year's companion combinations now while seed catalogues are fresh."),
        SeasonalTip("Winter", "❄️", "Order seeds early — popular companion plants like borage sell out fast."),
        SeasonalTip("Winter", "❄️", "Sketch out your beds now — good companion placement starts with good planning.")
    )

    fun current(): SeasonalTip {
        val month = Calendar.getInstance().get(Calendar.MONTH) // 0-based
        val pool = when (month) {
            in 2..4  -> spring   // Mar-May
            in 5..7  -> summer   // Jun-Aug
            in 8..10 -> autumn   // Sep-Nov
            else     -> winter   // Dec-Feb
        }
        val day = Calendar.getInstance().get(Calendar.DAY_OF_YEAR)
        return pool[day % pool.size]
    }
}
