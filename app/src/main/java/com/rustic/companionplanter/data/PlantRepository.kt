package com.rustic.companionplanter.data

import com.rustic.companionplanter.model.BadNeighbor
import com.rustic.companionplanter.model.Companion

object PlantRepository {

    data class Entry(
        val keys: List<String>,
        val companions: List<Companion>,
        val badNeighbors: List<BadNeighbor> = emptyList()
    )

    private val db = listOf(
        Entry(
            keys = listOf("tomato", "tomatoes"),
            companions = listOf(
                Companion(
                    name = "Basil",
                    reason = "Repels aphids and hornworms; said to improve flavor.",
                    imageUrl = "https://upload.wikimedia.org/wikipedia/commons/9/9a/Basil-Basilico-Ocimum_basilicum-albahaca.jpg",
                    sun = "Full sun", water = "Moderate",
                    tip = "Pinch flowers to keep basil bushy and productive."
                ),
                Companion(
                    name = "Marigold",
                    reason = "Deters nematodes and whiteflies from the root zone.",
                    imageUrl = "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg",
                    sun = "Full sun", water = "Low",
                    tip = "French marigolds are the most effective nematode deterrent."
                ),
                Companion(
                    name = "Borage",
                    reason = "Attracts pollinators and deters tomato hornworm.",
                    imageUrl = "https://upload.wikimedia.org/wikipedia/commons/3/3c/Borage_flower.jpg",
                    sun = "Full sun", water = "Low",
                    tip = "Let a few plants self-seed for a steady supply each year."
                )
            ),
            badNeighbors = listOf(
                BadNeighbor("Fennel", "Releases chemicals that stunt tomato growth."),
                BadNeighbor("Brassicas", "Compete heavily and can suppress tomato plants."),
                BadNeighbor("Corn", "Both attract the same destructive worm pests.")
            )
        ),
        Entry(
            keys = listOf("rose", "roses"),
            companions = listOf(
                Companion(
                    name = "Lavender",
                    reason = "Its scent repels aphids and invites pollinators.",
                    imageUrl = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Blooming_Lavender_Field_-_panoramio_%281%29.jpg/1280px-Blooming_Lavender_Field_-_panoramio_%281%29.jpg",
                    sun = "Full sun", water = "Low",
                    tip = "Cut back by one-third after flowering to keep it compact."
                ),
                Companion(
                    name = "Garlic",
                    reason = "Wards off aphids, blackspot and many beetles.",
                    imageUrl = "https://upload.wikimedia.org/wikipedia/commons/4/4f/Garlic.jpg",
                    sun = "Full sun", water = "Low",
                    tip = "Plant cloves around rose bases in autumn for spring benefit."
                ),
                Companion(
                    name = "Catmint",
                    reason = "Long-blooming filler that deters several pests.",
                    imageUrl = "https://upload.wikimedia.org/wikipedia/commons/0/0b/Nepeta_cataria_-_harilik_kassinaeris.jpg",
                    sun = "Full sun", water = "Low",
                    tip = "Shear back after first bloom for a fresh flush of flowers."
                )
            ),
            badNeighbors = listOf(
                BadNeighbor("Boxwood", "Shares fungal diseases and competes for nutrients."),
                BadNeighbor("Impatiens", "Attracts downy mildew that spreads to roses.")
            )
        ),
        Entry(
            keys = listOf("carrot", "carrots"),
            companions = listOf(
                Companion(
                    name = "Onion",
                    reason = "Masks carrot scent, confusing the carrot fly.",
                    imageUrl = "https://upload.wikimedia.org/wikipedia/commons/2/25/Onion_on_White.JPG",
                    sun = "Full sun", water = "Moderate",
                    tip = "Interplant rows of onions and carrots for maximum effect."
                ),
                Companion(
                    name = "Rosemary",
                    reason = "Aromatic foliage deters the carrot fly.",
                    imageUrl = "https://upload.wikimedia.org/wikipedia/commons/9/9b/Rosmarinus_officinalis_133575799.jpg",
                    sun = "Full sun", water = "Low",
                    tip = "Plant as a border hedge to create a protective scent barrier."
                ),
                Companion(
                    name = "Chives",
                    reason = "Improves growth and helps repel aphids.",
                    imageUrl = "https://upload.wikimedia.org/wikipedia/commons/6/6c/Chives_inflorescence.jpg",
                    sun = "Full sun", water = "Moderate",
                    tip = "Allow some chive flowers to bloom — bees love them."
                )
            ),
            badNeighbors = listOf(
                BadNeighbor("Dill", "Stunts carrot growth when planted in close proximity."),
                BadNeighbor("Parsnip", "Same pests and diseases; planting together amplifies risk.")
            )
        ),
        Entry(
            keys = listOf("cucumber", "cucumbers"),
            companions = listOf(
                Companion(
                    name = "Nasturtium",
                    reason = "Trap crop for aphids; repels cucumber beetles.",
                    imageUrl = "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg",
                    sun = "Full sun", water = "Low",
                    tip = "Nasturtium flowers and leaves are edible — a bonus harvest."
                ),
                Companion(
                    name = "Dill",
                    reason = "Attracts predatory insects that hunt pests.",
                    imageUrl = "https://upload.wikimedia.org/wikipedia/commons/4/45/Anethum_graveolens_flowers.jpg",
                    sun = "Full sun", water = "Low",
                    tip = "Keep dill away from carrots but it thrives beside cucumbers."
                ),
                Companion(
                    name = "Sunflower",
                    reason = "Provides a natural trellis and draws pollinators.",
                    imageUrl = "https://upload.wikimedia.org/wikipedia/commons/4/40/Sunflower_sky_backdrop.jpg",
                    sun = "Full sun", water = "Low",
                    tip = "Tall varieties create welcome shade in midsummer heat."
                )
            ),
            badNeighbors = listOf(
                BadNeighbor("Sage", "Inhibits cucumber growth when planted nearby."),
                BadNeighbor("Melons", "Compete for the same nutrients and cross-pollinate.")
            )
        ),
        Entry(
            keys = listOf("lettuce", "lettuces"),
            companions = listOf(
                Companion(
                    name = "Radish",
                    reason = "Loosens soil and lures leaf miners away.",
                    imageUrl = "https://upload.wikimedia.org/wikipedia/commons/9/97/Radishes.jpg",
                    sun = "Partial shade", water = "Moderate",
                    tip = "Fast-maturing radishes can be harvested before lettuce fills in."
                ),
                Companion(
                    name = "Mint",
                    reason = "Repels slugs and aphids (keep it contained).",
                    imageUrl = "https://upload.wikimedia.org/wikipedia/commons/4/46/Mentha_spicata_var._crispa.jpg",
                    sun = "Partial shade", water = "Moderate",
                    tip = "Grow mint in a buried pot to stop it spreading everywhere."
                ),
                Companion(
                    name = "Chervil",
                    reason = "Light shade partner that deters aphids and slugs.",
                    imageUrl = "https://upload.wikimedia.org/wikipedia/commons/2/2a/Anthriscus_cerefolium_001.JPG",
                    sun = "Partial shade", water = "Moderate",
                    tip = "Chervil actually improves flavor of nearby lettuce in many tests."
                )
            ),
            badNeighbors = listOf(
                BadNeighbor("Celery", "Competes aggressively and can stunt lettuce heads."),
                BadNeighbor("Parsley", "Can inhibit lettuce germination when grown too close.")
            )
        )
    )

    private val fallbackCompanions = listOf(
        Companion(
            name = "Marigold",
            reason = "A near-universal companion that deters many soil pests.",
            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg",
            sun = "Full sun", water = "Low",
            tip = "French marigolds are the most effective nematode deterrent."
        ),
        Companion(
            name = "Nasturtium",
            reason = "A reliable trap crop that pulls aphids off your plants.",
            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg",
            sun = "Full sun", water = "Low",
            tip = "Flowers and leaves are edible — a bonus harvest."
        ),
        Companion(
            name = "Borage",
            reason = "Brings in pollinators and benefits most neighbours.",
            imageUrl = "https://upload.wikimedia.org/wikipedia/commons/3/3c/Borage_flower.jpg",
            sun = "Full sun", water = "Low",
            tip = "Let a few plants self-seed for a steady supply each year."
        )
    )

    private val fallbackBadNeighbors = listOf(
        BadNeighbor("Fennel", "Generally allelopathic — inhibits most garden plants."),
        BadNeighbor("Wormwood", "Secretions can inhibit growth of nearby plants.")
    )

    fun lookup(query: String): Pair<List<Companion>, List<BadNeighbor>> {
        val q = query.trim().lowercase()
        if (q.isEmpty()) return Pair(emptyList(), emptyList())
        val match = db.firstOrNull { e -> e.keys.any { it == q || q.contains(it) } }
        return if (match != null)
            Pair(match.companions, match.badNeighbors)
        else
            Pair(fallbackCompanions, fallbackBadNeighbors)
    }
}
