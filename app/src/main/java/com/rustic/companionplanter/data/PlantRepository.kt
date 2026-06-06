package com.rustic.companionplanter.data

import com.rustic.companionplanter.model.Companion

/**
 * A curated companion-planting knowledge base.
 *
 * Image URLs point to Wikimedia Commons public-domain / CC files so the
 * app works out of the box. Swap [lookup] for a network call (see
 * network/PlantApi.kt) when you wire a real backend or an image-ID model.
 */
object PlantRepository {

    private data class Entry(val keys: List<String>, val companions: List<Companion>)

    private val db = listOf(
        Entry(
            listOf("tomato", "tomatoes"),
            listOf(
                Companion("Basil", "Repels aphids and hornworms; said to improve flavor.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/9a/Basil-Basilico-Ocimum_basilicum-albahaca.jpg"),
                Companion("Marigold", "Deters nematodes and whiteflies from the root zone.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg"),
                Companion("Borage", "Attracts pollinators and deters tomato hornworm.",
                    "https://upload.wikimedia.org/wikipedia/commons/3/3c/Borage_flower.jpg")
            )
        ),
        Entry(
            listOf("rose", "roses"),
            listOf(
                Companion("Lavender", "Its scent repels aphids and invites pollinators.",
                    "https://upload.wikimedia.org/wikipedia/commons/1/1e/Lavandula_angustifolia_-_Köhler–s_Medizinal-Pflanzen-179.jpg"),
                Companion("Garlic", "Wards off aphids, blackspot and many beetles.",
                    "https://upload.wikimedia.org/wikipedia/commons/4/4f/Garlic.jpg"),
                Companion("Catmint", "Long-blooming filler that deters several pests.",
                    "https://upload.wikimedia.org/wikipedia/commons/0/0b/Nepeta_cataria_-_harilik_kassinaeris.jpg")
            )
        ),
        Entry(
            listOf("carrot", "carrots"),
            listOf(
                Companion("Onion", "Masks carrot scent, confusing the carrot fly.",
                    "https://upload.wikimedia.org/wikipedia/commons/2/25/Onion_on_White.JPG"),
                Companion("Rosemary", "Aromatic foliage deters the carrot fly.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/9b/Rosmarinus_officinalis_133575799.jpg"),
                Companion("Chives", "Improves growth and helps repel aphids.",
                    "https://upload.wikimedia.org/wikipedia/commons/6/6c/Chives_inflorescence.jpg")
            )
        ),
        Entry(
            listOf("cucumber", "cucumbers"),
            listOf(
                Companion("Nasturtium", "Trap crop for aphids; repels cucumber beetles.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg"),
                Companion("Dill", "Attracts predatory insects that hunt pests.",
                    "https://upload.wikimedia.org/wikipedia/commons/4/45/Anethum_graveolens_flowers.jpg"),
                Companion("Sunflower", "Provides a natural trellis and draws pollinators.",
                    "https://upload.wikimedia.org/wikipedia/commons/4/40/Sunflower_sky_backdrop.jpg")
            )
        ),
        Entry(
            listOf("lettuce", "lettuces"),
            listOf(
                Companion("Radish", "Loosens soil and lures leaf miners away.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/97/Radishes.jpg"),
                Companion("Mint", "Repels slugs and aphids (keep it contained).",
                    "https://upload.wikimedia.org/wikipedia/commons/4/46/Mentha_spicata_var._crispa.jpg"),
                Companion("Chervil", "Light shade partner that deters aphids and slugs.",
                    "https://upload.wikimedia.org/wikipedia/commons/2/2a/Anthriscus_cerefolium_001.JPG")
            )
        )
    )

    private val fallback = listOf(
        Companion("Marigold", "A near-universal companion that deters many soil pests.",
            "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg"),
        Companion("Nasturtium", "A reliable trap crop that pulls aphids off your plants.",
            "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg"),
        Companion("Borage", "Brings in pollinators and benefits most neighbours.",
            "https://upload.wikimedia.org/wikipedia/commons/3/3c/Borage_flower.jpg")
    )

    /** Returns all known companions for a query (caller applies free/paid limit). */
    fun lookup(query: String): List<Companion> {
        val q = query.trim().lowercase()
        if (q.isEmpty()) return emptyList()
        val match = db.firstOrNull { e -> e.keys.any { it == q || q.contains(it) } }
        return match?.companions ?: fallback
    }
}