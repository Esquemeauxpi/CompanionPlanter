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

        // ── VEGETABLES ──────────────────────────────────────────────────────────

        Entry(
            keys = listOf("tomato", "tomatoes"),
            companions = listOf(
                Companion("Basil", "Repels aphids and hornworms; said to improve flavor.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/9a/Basil-Basilico-Ocimum_basilicum-albahaca.jpg",
                    "Full sun", "Moderate", "Pinch flowers to keep basil bushy all season."),
                Companion("Marigold", "Deters nematodes and whiteflies from the root zone.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg",
                    "Full sun", "Low", "French marigolds are the most effective nematode deterrent."),
                Companion("Borage", "Attracts pollinators and deters tomato hornworm.",
                    "https://upload.wikimedia.org/wikipedia/commons/3/3c/Borage_flower.jpg",
                    "Full sun", "Low", "Let a few plants self-seed for a steady supply each year.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Fennel", "Releases chemicals that stunt tomato growth."),
                BadNeighbor("Brassicas", "Compete heavily and can suppress tomato plants."),
                BadNeighbor("Corn", "Both attract the same destructive worm pests.")
            )
        ),

        Entry(
            keys = listOf("pepper", "peppers", "bell pepper", "chilli", "chili"),
            companions = listOf(
                Companion("Basil", "Improves flavor and repels aphids and spider mites.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/9a/Basil-Basilico-Ocimum_basilicum-albahaca.jpg",
                    "Full sun", "Moderate", "Plant basil densely around pepper beds for best effect."),
                Companion("Marigold", "Repels nematodes and many flying pests.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg",
                    "Full sun", "Low", "Border your pepper bed with a solid row of marigolds."),
                Companion("Carrot", "Loosens soil around pepper roots and fills ground space.",
                    "https://upload.wikimedia.org/wikipedia/commons/a/a2/Carrots_with_stems.jpg",
                    "Full sun", "Moderate", "Interplant carrots between pepper plants to maximise bed use.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Fennel", "Inhibits pepper growth and attracts shared pests."),
                BadNeighbor("Apricot", "Carries viruses harmful to peppers.")
            )
        ),

        Entry(
            keys = listOf("carrot", "carrots"),
            companions = listOf(
                Companion("Onion", "Masks carrot scent, confusing the carrot fly.",
                    "https://upload.wikimedia.org/wikipedia/commons/2/25/Onion_on_White.JPG",
                    "Full sun", "Moderate", "Interplant rows of onions and carrots for maximum effect."),
                Companion("Rosemary", "Aromatic foliage deters the carrot fly.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/9b/Rosmarinus_officinalis_133575799.jpg",
                    "Full sun", "Low", "Plant as a border hedge to create a protective scent barrier."),
                Companion("Chives", "Improves growth and helps repel aphids.",
                    "https://upload.wikimedia.org/wikipedia/commons/6/6c/Chives_inflorescence.jpg",
                    "Full sun", "Moderate", "Allow some chive flowers to bloom — bees love them.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Dill", "Stunts carrot growth when planted in close proximity."),
                BadNeighbor("Parsnip", "Same pests and diseases; planting together amplifies risk.")
            )
        ),

        Entry(
            keys = listOf("cucumber", "cucumbers"),
            companions = listOf(
                Companion("Nasturtium", "Trap crop for aphids; repels cucumber beetles.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg",
                    "Full sun", "Low", "Nasturtium flowers and leaves are edible — a bonus harvest."),
                Companion("Dill", "Attracts predatory insects that hunt pests.",
                    "https://upload.wikimedia.org/wikipedia/commons/4/45/Anethum_graveolens_flowers.jpg",
                    "Full sun", "Low", "Keep mature dill away from carrots but it thrives beside cucumbers."),
                Companion("Sunflower", "Provides a natural trellis and draws pollinators.",
                    "https://upload.wikimedia.org/wikipedia/commons/4/40/Sunflower_sky_backdrop.jpg",
                    "Full sun", "Low", "Tall varieties create welcome shade in midsummer heat.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Sage", "Inhibits cucumber growth when planted nearby."),
                BadNeighbor("Melons", "Compete for the same nutrients and cross-pollinate.")
            )
        ),

        Entry(
            keys = listOf("zucchini", "courgette", "zucchinis"),
            companions = listOf(
                Companion("Nasturtium", "Lures aphids away and attracts pollinating insects.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg",
                    "Full sun", "Low", "Let nasturtiums sprawl under zucchini to act as a living mulch."),
                Companion("Borage", "Deters squash vine borers and attracts bees.",
                    "https://upload.wikimedia.org/wikipedia/commons/3/3c/Borage_flower.jpg",
                    "Full sun", "Low", "Plant borage at the corners of your zucchini bed."),
                Companion("Marigold", "Repels beetles and nematodes from the root zone.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg",
                    "Full sun", "Low", "French marigolds work best — plant densely around the bed edge.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Pumpkin", "Cross-pollinates and competes for space aggressively."),
                BadNeighbor("Potato", "Both susceptible to blight — don't plant together.")
            )
        ),

        Entry(
            keys = listOf("bean", "beans", "green bean", "runner bean", "french bean"),
            companions = listOf(
                Companion("Marigold", "Deters Mexican bean beetles effectively.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg",
                    "Full sun", "Low", "Plant a border of marigolds around your bean rows."),
                Companion("Nasturtium", "Repels aphids and blackfly from bean plants.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg",
                    "Full sun", "Low", "Grow nasturtiums at the ends of bean rows as a trap crop."),
                Companion("Carrot", "Beans fix nitrogen that feeds hungry carrots nearby.",
                    "https://upload.wikimedia.org/wikipedia/commons/a/a2/Carrots_with_stems.jpg",
                    "Full sun", "Moderate", "An ideal pairing — beans give, carrots take nitrogen.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Onion", "Onions and garlic stunt bean growth significantly."),
                BadNeighbor("Fennel", "Allelopathic — inhibits bean germination and growth.")
            )
        ),

        Entry(
            keys = listOf("pea", "peas", "sweet pea"),
            companions = listOf(
                Companion("Carrot", "Classic combination — peas fix nitrogen, carrots use it.",
                    "https://upload.wikimedia.org/wikipedia/commons/a/a2/Carrots_with_stems.jpg",
                    "Full sun", "Moderate", "Sow peas and carrots together in early spring."),
                Companion("Mint", "Deters aphids and improves overall pea plant health.",
                    "https://upload.wikimedia.org/wikipedia/commons/4/46/Mentha_spicata_var._crispa.jpg",
                    "Partial shade", "Moderate", "Contain mint in a buried pot to prevent it taking over."),
                Companion("Radish", "Deters aphids and loosens soil for pea roots.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/97/Radishes.jpg",
                    "Full sun", "Moderate", "Fast-maturing radishes come up before peas shade them out.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Onion", "Inhibits pea growth — keep all alliums away."),
                BadNeighbor("Garlic", "Same family as onions — stunts pea plants.")
            )
        ),

        Entry(
            keys = listOf("lettuce", "lettuces"),
            companions = listOf(
                Companion("Radish", "Loosens soil and lures leaf miners away.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/97/Radishes.jpg",
                    "Partial shade", "Moderate", "Fast-maturing radishes can be harvested before lettuce fills in."),
                Companion("Mint", "Repels slugs and aphids.",
                    "https://upload.wikimedia.org/wikipedia/commons/4/46/Mentha_spicata_var._crispa.jpg",
                    "Partial shade", "Moderate", "Grow mint in a buried pot to stop it spreading everywhere."),
                Companion("Chervil", "Light shade partner that deters aphids and slugs.",
                    "https://upload.wikimedia.org/wikipedia/commons/2/2a/Anthriscus_cerefolium_001.JPG",
                    "Partial shade", "Moderate", "Chervil can actually improve the flavor of nearby lettuce.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Celery", "Competes aggressively and can stunt lettuce heads."),
                BadNeighbor("Parsley", "Can inhibit lettuce germination when grown too close.")
            )
        ),

        Entry(
            keys = listOf("spinach"),
            companions = listOf(
                Companion("Strawberry", "Spinach acts as ground cover keeping strawberry roots cool.",
                    "https://upload.wikimedia.org/wikipedia/commons/2/29/PerfectStrawberry.jpg",
                    "Partial shade", "Moderate", "Interplant spinach between strawberry crowns in spring."),
                Companion("Radish", "Deters leaf miners that damage spinach leaves.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/97/Radishes.jpg",
                    "Partial shade", "Moderate", "Sow radish seeds in the same row as spinach."),
                Companion("Nasturtium", "Lures aphids away from spinach plants.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg",
                    "Partial shade", "Low", "Plant nasturtiums at the border of your spinach bed.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Fennel", "Inhibits spinach growth with allelopathic root chemicals."),
                BadNeighbor("Beet", "Compete heavily for the same nutrients in the soil.")
            )
        ),

        Entry(
            keys = listOf("kale"),
            companions = listOf(
                Companion("Nasturtium", "Trap crop that draws caterpillars away from kale.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg",
                    "Full sun", "Low", "Plant nasturtiums as a sacrificial border around kale."),
                Companion("Marigold", "Deters whiteflies and cabbage moths.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg",
                    "Full sun", "Low", "Interplant marigolds generously throughout your brassica beds."),
                Companion("Mint", "Strong scent confuses and deters cabbage white butterfly.",
                    "https://upload.wikimedia.org/wikipedia/commons/4/46/Mentha_spicata_var._crispa.jpg",
                    "Partial shade", "Moderate", "Place potted mint at the corners of your kale bed.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Tomato", "Compete for nutrients and share some diseases."),
                BadNeighbor("Strawberry", "Kale inhibits strawberry growth when planted closely.")
            )
        ),

        Entry(
            keys = listOf("broccoli"),
            companions = listOf(
                Companion("Chamomile", "Attracts beneficial insects and improves broccoli flavor.",
                    "https://upload.wikimedia.org/wikipedia/commons/e/e4/Chamomile%40original_size.jpg",
                    "Full sun", "Low", "Allow chamomile to self-seed around your brassica beds."),
                Companion("Nasturtium", "Trap crop for aphids that would otherwise target broccoli.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg",
                    "Full sun", "Low", "Let nasturtiums sprawl at the base of broccoli plants."),
                Companion("Rosemary", "Deters cabbage moths and bean beetles.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/9b/Rosmarinus_officinalis_133575799.jpg",
                    "Full sun", "Low", "A permanent rosemary border protects brassica beds year-round.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Tomato", "Both heavy feeders that compete aggressively."),
                BadNeighbor("Mustard", "Attracts the same pests and diseases as broccoli.")
            )
        ),

        Entry(
            keys = listOf("onion", "onions"),
            companions = listOf(
                Companion("Carrot", "Onion scent deters carrot fly; carrot scent deters onion fly.",
                    "https://upload.wikimedia.org/wikipedia/commons/a/a2/Carrots_with_stems.jpg",
                    "Full sun", "Moderate", "The classic pairing — alternate rows for best pest protection."),
                Companion("Chamomile", "Said to improve onion flavor and deter pests.",
                    "https://upload.wikimedia.org/wikipedia/commons/e/e4/Chamomile%40original_size.jpg",
                    "Full sun", "Low", "Plant chamomile sparingly — a little goes a long way."),
                Companion("Marigold", "Repels a wide range of insects harmful to onions.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg",
                    "Full sun", "Low", "Border your onion rows with French marigolds.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Bean", "Onions significantly stunt bean growth."),
                BadNeighbor("Pea", "Alliums inhibit pea plants — keep them well apart.")
            )
        ),

        Entry(
            keys = listOf("garlic"),
            companions = listOf(
                Companion("Rose", "Garlic is the classic rose companion — deters aphids and blackspot.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Blooming_Lavender_Field_-_panoramio_%281%29.jpg/1280px-Blooming_Lavender_Field_-_panoramio_%281%29.jpg",
                    "Full sun", "Low", "Plant garlic cloves at the base of rose bushes in autumn."),
                Companion("Tomato", "Deters spider mites and other tomato pests.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/88/Salad_garden.jpg",
                    "Full sun", "Low", "Interplant garlic between tomato plants for season-long protection."),
                Companion("Chamomile", "Improves garlic's growth and flavor when planted nearby.",
                    "https://upload.wikimedia.org/wikipedia/commons/e/e4/Chamomile%40original_size.jpg",
                    "Full sun", "Low", "Allow chamomile to self-seed freely around your garlic bed.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Bean", "Garlic stunts bean and pea growth significantly."),
                BadNeighbor("Asparagus", "Garlic inhibits asparagus root development.")
            )
        ),

        Entry(
            keys = listOf("beet", "beets", "beetroot"),
            companions = listOf(
                Companion("Onion", "Onions deter pests that damage beet leaves.",
                    "https://upload.wikimedia.org/wikipedia/commons/2/25/Onion_on_White.JPG",
                    "Full sun", "Moderate", "Interrow onions and beets for mutual pest deterrence."),
                Companion("Lettuce", "Uses space efficiently and keeps beet soil moist.",
                    "https://upload.wikimedia.org/wikipedia/commons/7/7a/Salad_garden.jpg",
                    "Partial shade", "Moderate", "Lettuce fills the space between beet rows nicely."),
                Companion("Nasturtium", "Deters aphids and blackfly from beet plants.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg",
                    "Full sun", "Low", "A nasturtium border protects the whole bed.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Pole Bean", "Pole beans and beets inhibit each other's growth."),
                BadNeighbor("Mustard", "Competes heavily and can spread shared diseases.")
            )
        ),

        Entry(
            keys = listOf("radish", "radishes"),
            companions = listOf(
                Companion("Nasturtium", "Nasturtiums lure flea beetles away from radishes.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg",
                    "Full sun", "Low", "Plant nasturtiums as a sacrificial border."),
                Companion("Lettuce", "Radishes mark rows and loosen soil for lettuce roots.",
                    "https://upload.wikimedia.org/wikipedia/commons/7/7a/Salad_garden.jpg",
                    "Partial shade", "Moderate", "Sow radish seeds in lettuce rows as natural row markers."),
                Companion("Chervil", "Said to make radishes more tender and peppery.",
                    "https://upload.wikimedia.org/wikipedia/commons/2/2a/Anthriscus_cerefolium_001.JPG",
                    "Partial shade", "Moderate", "Interplant chervil freely throughout your radish bed.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Hyssop", "Inhibits radish growth noticeably."),
                BadNeighbor("Agastache", "Can stunt radish development when planted nearby.")
            )
        ),

        Entry(
            keys = listOf("eggplant", "aubergine"),
            companions = listOf(
                Companion("Basil", "Repels aphids, spider mites and thrips from eggplant.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/9a/Basil-Basilico-Ocimum_basilicum-albahaca.jpg",
                    "Full sun", "Moderate", "Plant basil densely around eggplant for best protection."),
                Companion("Marigold", "Deters nematodes and a wide range of flying pests.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg",
                    "Full sun", "Low", "French marigolds planted around the bed provide strong protection."),
                Companion("Tarragon", "Broadly improves growth of most vegetables including eggplant.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/8a/Estragon.jpg",
                    "Full sun", "Low", "French tarragon is more flavorful; Russian tarragon is more vigorous.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Fennel", "Allelopathic — inhibits eggplant growth."),
                BadNeighbor("Corn", "Both attract corn earworm and compete for nutrients.")
            )
        ),

        Entry(
            keys = listOf("corn", "sweetcorn", "maize"),
            companions = listOf(
                Companion("Bean", "The Three Sisters classic — beans fix nitrogen for corn.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/5e/Hopniss.jpg",
                    "Full sun", "Moderate", "Plant beans at the base of corn stalks once corn is 6 inches tall."),
                Companion("Squash", "Large leaves shade soil, retain moisture and deter weeds.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/82/Squash_and_pumpkins.jpg",
                    "Full sun", "Moderate", "Let squash sprawl between corn plants as a living mulch."),
                Companion("Borage", "Deters tomato hornworm and attracts pollinators.",
                    "https://upload.wikimedia.org/wikipedia/commons/3/3c/Borage_flower.jpg",
                    "Full sun", "Low", "Plant borage at the corners of your corn patch.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Tomato", "Both attract the same destructive earworm pests."),
                BadNeighbor("Fennel", "Fennel is allelopathic and stunts corn growth.")
            )
        ),

        Entry(
            keys = listOf("pumpkin", "pumpkins"),
            companions = listOf(
                Companion("Nasturtium", "Deters squash beetles and aphids from pumpkin vines.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg",
                    "Full sun", "Low", "Let nasturtiums sprawl among pumpkin vines."),
                Companion("Marigold", "Repels many pests that attack pumpkin plants.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg",
                    "Full sun", "Low", "Plant marigolds generously around the pumpkin patch perimeter."),
                Companion("Corn", "Provides wind protection and shade for pumpkin roots.",
                    "https://upload.wikimedia.org/wikipedia/commons/7/7d/Sweet_corn_closeup.jpg",
                    "Full sun", "Moderate", "The Three Sisters combination — corn, bean and squash.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Zucchini", "Cross-pollinates and competes aggressively for space."),
                BadNeighbor("Potato", "Compete for nutrients and share blight diseases.")
            )
        ),

        Entry(
            keys = listOf("potato", "potatoes"),
            companions = listOf(
                Companion("Horseradish", "Deters Colorado potato beetles effectively.",
                    "https://upload.wikimedia.org/wikipedia/commons/b/b8/Horseradish_plant.jpg",
                    "Full sun", "Moderate", "Plant horseradish at the corners of your potato patch."),
                Companion("Nasturtium", "Repels aphids and acts as a trap crop for beetles.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg",
                    "Full sun", "Low", "Let nasturtiums sprawl among potato plants."),
                Companion("Marigold", "Repels nematodes and many potato pests.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg",
                    "Full sun", "Low", "Plant a border of French marigolds around the whole potato bed.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Tomato", "Share blight — never plant together or near each other."),
                BadNeighbor("Cucumber", "Cucumber and potato share several soilborne diseases.")
            )
        ),

        Entry(
            keys = listOf("asparagus"),
            companions = listOf(
                Companion("Basil", "Repels asparagus beetles and attracts beneficial insects.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/9a/Basil-Basilico-Ocimum_basilicum-albahaca.jpg",
                    "Full sun", "Moderate", "Plant basil alongside established asparagus crowns."),
                Companion("Tomato", "Tomatoes repel asparagus beetles; asparagus deters nematodes.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/88/Salad_garden.jpg",
                    "Full sun", "Moderate", "A rare mutual benefit — one of the best vegetable pairings."),
                Companion("Marigold", "Deters a wide range of pests from the asparagus bed.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg",
                    "Full sun", "Low", "Plant marigolds at the border of permanent asparagus beds.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Garlic", "Inhibits asparagus root development significantly."),
                BadNeighbor("Onion", "All alliums stunt asparagus growth — keep them separate.")
            )
        ),

        // ── HERBS ───────────────────────────────────────────────────────────────

        Entry(
            keys = listOf("basil"),
            companions = listOf(
                Companion("Tomato", "The classic pairing — basil improves tomato flavor and repels pests.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/88/Salad_garden.jpg",
                    "Full sun", "Moderate", "Plant basil directly alongside your tomato plants."),
                Companion("Pepper", "Basil deters aphids and spider mites from pepper plants.",
                    "https://upload.wikimedia.org/wikipedia/commons/a/a3/Bell_pepper_and_cross_section.jpg",
                    "Full sun", "Moderate", "Interplant basil densely between pepper plants."),
                Companion("Marigold", "Together they form a powerful pest-deterring combination.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg",
                    "Full sun", "Low", "Plant basil and marigolds together as a pest-repelling border.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Sage", "These herbs inhibit each other's growth when too close."),
                BadNeighbor("Common Rue", "Rue and basil are strongly antagonistic to each other.")
            )
        ),

        Entry(
            keys = listOf("mint"),
            companions = listOf(
                Companion("Tomato", "Mint repels aphids, flea beetles and other tomato pests.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/88/Salad_garden.jpg",
                    "Full sun", "Moderate", "Contain mint in a buried pot near tomatoes."),
                Companion("Brassicas", "Deters cabbage moth, aphids and flea beetles.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/5e/Broccoli_bunches.jpg",
                    "Partial shade", "Moderate", "Plant mint at the corners of brassica beds."),
                Companion("Pea", "Mint deters aphids that commonly attack pea plants.",
                    "https://upload.wikimedia.org/wikipedia/commons/6/6e/Peas_in_pods_-_Studio.jpg",
                    "Partial shade", "Moderate", "A pot of mint near peas is enough to deter most aphids.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Parsley", "Mint can inhibit parsley growth when planted too close."),
                BadNeighbor("Chamomile", "Compete for space — mint will typically take over.")
            )
        ),

        Entry(
            keys = listOf("rosemary"),
            companions = listOf(
                Companion("Carrot", "Rosemary's scent deters carrot fly effectively.",
                    "https://upload.wikimedia.org/wikipedia/commons/a/a2/Carrots_with_stems.jpg",
                    "Full sun", "Low", "Plant a rosemary hedge around your carrot bed."),
                Companion("Sage", "Rosemary and sage are mutually beneficial and repel shared pests.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/96/Salvia_officinalis_%28Sage%29.jpg",
                    "Full sun", "Low", "A classic Mediterranean herb pairing for any garden."),
                Companion("Bean", "Rosemary deters bean beetles when planted nearby.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/5e/Hopniss.jpg",
                    "Full sun", "Low", "Plant rosemary at the ends of bean rows.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Mint", "Mint competes aggressively and will crowd out rosemary."),
                BadNeighbor("Basil", "Prefer different moisture levels — basil needs more water.")
            )
        ),

        Entry(
            keys = listOf("dill"),
            companions = listOf(
                Companion("Cucumber", "Dill attracts predatory insects that control cucumber pests.",
                    "https://upload.wikimedia.org/wikipedia/commons/4/45/Cucumber_on_white.jpg",
                    "Full sun", "Low", "Plant dill near but not touching cucumber plants."),
                Companion("Lettuce", "Dill attracts aphid predators that protect lettuce.",
                    "https://upload.wikimedia.org/wikipedia/commons/7/7a/Salad_garden.jpg",
                    "Full sun", "Low", "A few dill plants near lettuce beds attract beneficial wasps."),
                Companion("Onion", "Dill and onion are mutually beneficial growing companions.",
                    "https://upload.wikimedia.org/wikipedia/commons/2/25/Onion_on_White.JPG",
                    "Full sun", "Low", "Interplant dill with onion rows for mutual benefit.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Carrot", "Dill stunts carrot growth — keep them well apart."),
                BadNeighbor("Tomato", "Mature dill inhibits tomato plant growth significantly.")
            )
        ),

        Entry(
            keys = listOf("chives"),
            companions = listOf(
                Companion("Carrot", "Chives repel carrot fly and aphids very effectively.",
                    "https://upload.wikimedia.org/wikipedia/commons/a/a2/Carrots_with_stems.jpg",
                    "Full sun", "Moderate", "Interplant chives in rows between carrots."),
                Companion("Rose", "Chives help prevent blackspot and deter aphids from roses.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Blooming_Lavender_Field_-_panoramio_%281%29.jpg/1280px-Blooming_Lavender_Field_-_panoramio_%281%29.jpg",
                    "Full sun", "Moderate", "Plant chives as a border around rose beds."),
                Companion("Tomato", "Chives deter aphids and improve tomato plant vigor.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/88/Salad_garden.jpg",
                    "Full sun", "Moderate", "Scatter chive plants throughout your tomato bed.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Bean", "All alliums including chives inhibit bean growth."),
                BadNeighbor("Pea", "Chives stunt pea plants — keep them well separated.")
            )
        ),

        Entry(
            keys = listOf("parsley"),
            companions = listOf(
                Companion("Tomato", "Parsley attracts predatory insects that protect tomatoes.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/88/Salad_garden.jpg",
                    "Partial shade", "Moderate", "Plant parsley as a border around tomato beds."),
                Companion("Rose", "Parsley improves rose fragrance and deters rose beetles.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Blooming_Lavender_Field_-_panoramio_%281%29.jpg/1280px-Blooming_Lavender_Field_-_panoramio_%281%29.jpg",
                    "Partial shade", "Moderate", "Tuck parsley plants around the base of rose bushes."),
                Companion("Asparagus", "Parsley and asparagus are beneficial to each other.",
                    "https://upload.wikimedia.org/wikipedia/commons/1/1c/Asparagus_officinalis1.jpg",
                    "Partial shade", "Moderate", "A long-lived pairing — both are perennials in mild climates.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Lettuce", "Parsley can inhibit lettuce germination nearby."),
                BadNeighbor("Mint", "Mint aggressively outcompetes and crowds parsley.")
            )
        ),

        Entry(
            keys = listOf("thyme"),
            companions = listOf(
                Companion("Cabbage", "Thyme deters cabbage worm and whitefly.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/5e/Broccoli_bunches.jpg",
                    "Full sun", "Low", "Plant thyme as a border around all brassica beds."),
                Companion("Eggplant", "Thyme repels the flea beetles that target eggplant.",
                    "https://upload.wikimedia.org/wikipedia/commons/6/60/Aubergine.jpg",
                    "Full sun", "Low", "Interplant thyme among eggplant for season-long protection."),
                Companion("Strawberry", "Thyme deters worms and boosts strawberry plant health.",
                    "https://upload.wikimedia.org/wikipedia/commons/2/29/PerfectStrawberry.jpg",
                    "Full sun", "Low", "Use thyme as a fragrant ground cover around strawberry plants.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Chamomile", "Can compete for space and resources in confined beds."),
                BadNeighbor("Cilantro", "Different moisture requirements cause one to suffer.")
            )
        ),

        Entry(
            keys = listOf("sage"),
            companions = listOf(
                Companion("Rosemary", "A classic Mediterranean pairing — mutually beneficial.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/9b/Rosmarinus_officinalis_133575799.jpg",
                    "Full sun", "Low", "Plant sage and rosemary together in a sunny dry border."),
                Companion("Brassicas", "Sage deters cabbage moth and imported cabbageworm.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/5e/Broccoli_bunches.jpg",
                    "Full sun", "Low", "Plant sage around the perimeter of brassica beds."),
                Companion("Carrot", "Sage confuses the carrot fly with its strong scent.",
                    "https://upload.wikimedia.org/wikipedia/commons/a/a2/Carrots_with_stems.jpg",
                    "Full sun", "Low", "Plant sage as a border alongside carrot rows.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Cucumber", "Sage inhibits cucumber growth significantly."),
                BadNeighbor("Basil", "Sage and basil inhibit each other when too close.")
            )
        ),

        Entry(
            keys = listOf("lavender"),
            companions = listOf(
                Companion("Rose", "Lavender's scent repels aphids and invites pollinators to roses.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Blooming_Lavender_Field_-_panoramio_%281%29.jpg/1280px-Blooming_Lavender_Field_-_panoramio_%281%29.jpg",
                    "Full sun", "Low", "Plant lavender in generous drifts around rose beds."),
                Companion("Brassicas", "Lavender deters whitefly and cabbage moth effectively.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/5e/Broccoli_bunches.jpg",
                    "Full sun", "Low", "A lavender border protects brassica beds all season."),
                Companion("Echinacea", "Both attract pollinators and create a stunning display together.",
                    "https://upload.wikimedia.org/wikipedia/commons/7/70/Echinacea_purpurea.jpg",
                    "Full sun", "Low", "A low-maintenance pairing for a wildlife-friendly garden.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Mint", "Mint's aggressive roots will crowd out lavender."),
                BadNeighbor("Chamomile", "Chamomile can outcompete lavender in moist conditions.")
            )
        ),

        Entry(
            keys = listOf("chamomile"),
            companions = listOf(
                Companion("Onion", "Chamomile improves onion flavor — a well-proven pairing.",
                    "https://upload.wikimedia.org/wikipedia/commons/2/25/Onion_on_White.JPG",
                    "Full sun", "Low", "Plant chamomile sparingly in onion beds."),
                Companion("Brassicas", "Attracts hoverflies whose larvae eat aphids on brassicas.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/5e/Broccoli_bunches.jpg",
                    "Full sun", "Low", "Allow chamomile to self-seed around brassica beds."),
                Companion("Cucumber", "Chamomile attracts pollinators needed for cucumber fruiting.",
                    "https://upload.wikimedia.org/wikipedia/commons/4/45/Cucumber_on_white.jpg",
                    "Full sun", "Low", "A few chamomile plants near cucumbers boost pollination rates.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Mint", "Mint will aggressively crowd out chamomile plants."),
                BadNeighbor("Lavender", "Can outcompete lavender in moist soil conditions.")
            )
        ),

        Entry(
            keys = listOf("lemon balm"),
            companions = listOf(
                Companion("Tomato", "Lemon balm attracts pollinators and deters tomato pests.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/88/Salad_garden.jpg",
                    "Partial shade", "Moderate", "Plant lemon balm near tomatoes but contain it in a pot."),
                Companion("Squash", "Attracts pollinators essential for squash fruit set.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/82/Squash_and_pumpkins.jpg",
                    "Partial shade", "Moderate", "Let lemon balm grow freely at the edge of squash beds."),
                Companion("Echinacea", "Both attract beneficial insects and look beautiful together.",
                    "https://upload.wikimedia.org/wikipedia/commons/7/70/Echinacea_purpurea.jpg",
                    "Partial shade", "Moderate", "A lovely wildflower-style pairing for any garden border.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Mint", "Mint will outcompete lemon balm — keep them separated."),
                BadNeighbor("Fennel", "Fennel inhibits most herb growth including lemon balm.")
            )
        ),

        // ── FLOWERS ─────────────────────────────────────────────────────────────

        Entry(
            keys = listOf("rose", "roses"),
            companions = listOf(
                Companion("Lavender", "Its scent repels aphids and invites pollinators.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Blooming_Lavender_Field_-_panoramio_%281%29.jpg/1280px-Blooming_Lavender_Field_-_panoramio_%281%29.jpg",
                    "Full sun", "Low", "Cut back by one-third after flowering to keep it compact."),
                Companion("Garlic", "Wards off aphids, blackspot and many beetles.",
                    "https://upload.wikimedia.org/wikipedia/commons/4/4f/Garlic.jpg",
                    "Full sun", "Low", "Plant cloves around rose bases in autumn for spring benefit."),
                Companion("Catmint", "Long-blooming filler that deters several pests.",
                    "https://upload.wikimedia.org/wikipedia/commons/0/0b/Nepeta_cataria_-_harilik_kassinaeris.jpg",
                    "Full sun", "Low", "Shear back after first bloom for a fresh flush of flowers.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Boxwood", "Shares fungal diseases and competes for nutrients."),
                BadNeighbor("Impatiens", "Attracts downy mildew that spreads to roses.")
            )
        ),

        Entry(
            keys = listOf("marigold", "marigolds"),
            companions = listOf(
                Companion("Tomato", "Marigolds deter nematodes and whiteflies around tomatoes.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/88/Salad_garden.jpg",
                    "Full sun", "Low", "Plant French marigolds densely around the tomato bed."),
                Companion("Basil", "Together they form a powerful pest-deterring duo.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/9a/Basil-Basilico-Ocimum_basilicum-albahaca.jpg",
                    "Full sun", "Moderate", "Interplant basil and marigolds as a pest-repelling border."),
                Companion("Pepper", "Deters aphids and beetles that target pepper plants.",
                    "https://upload.wikimedia.org/wikipedia/commons/a/a3/Bell_pepper_and_cross_section.jpg",
                    "Full sun", "Low", "Border your pepper bed with a solid row of marigolds.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Bean", "Marigolds can inhibit bean germination in some studies."),
                BadNeighbor("Fennel", "Fennel is allelopathic and harms marigold plants.")
            )
        ),

        Entry(
            keys = listOf("nasturtium", "nasturtiums"),
            companions = listOf(
                Companion("Tomato", "Acts as a trap crop pulling aphids away from tomatoes.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/88/Salad_garden.jpg",
                    "Full sun", "Low", "Let nasturtiums sprawl at the base of tomato plants."),
                Companion("Cucumber", "Repels cucumber beetles and aphids effectively.",
                    "https://upload.wikimedia.org/wikipedia/commons/4/45/Cucumber_on_white.jpg",
                    "Full sun", "Low", "Plant nasturtiums as a companion border to cucumber rows."),
                Companion("Brassicas", "A sacrificial trap crop that lures caterpillars away.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/5e/Broccoli_bunches.jpg",
                    "Full sun", "Low", "Nasturtiums lure cabbage white caterpillars off brassicas.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Cauliflower", "Can attract the same pests in very large numbers."),
                BadNeighbor("Radish", "Competition for space can reduce both plants' yields.")
            )
        ),

        Entry(
            keys = listOf("sunflower", "sunflowers"),
            companions = listOf(
                Companion("Cucumber", "Provides a natural trellis and attracts pollinators.",
                    "https://upload.wikimedia.org/wikipedia/commons/4/45/Cucumber_on_white.jpg",
                    "Full sun", "Low", "Plant cucumbers at the base of sunflower stems."),
                Companion("Squash", "Sunflowers attract pollinators needed by squash plants.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/82/Squash_and_pumpkins.jpg",
                    "Full sun", "Low", "Plant sunflowers at the edge of squash patches."),
                Companion("Corn", "Both are tall heavy feeders that shade soil and deter pests.",
                    "https://upload.wikimedia.org/wikipedia/commons/7/7d/Sweet_corn_closeup.jpg",
                    "Full sun", "Low", "Plant sunflowers at the north end of corn rows.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Potato", "Sunflowers produce allelopathic chemicals harmful to potatoes."),
                BadNeighbor("Pole Bean", "Sunflowers inhibit bean growth with root chemicals.")
            )
        ),

        Entry(
            keys = listOf("zinnia", "zinnias"),
            companions = listOf(
                Companion("Tomato", "Zinnias attract hoverflies whose larvae eat aphids.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/88/Salad_garden.jpg",
                    "Full sun", "Low", "Plant zinnias in bold clusters near tomato beds."),
                Companion("Cabbage", "Attracts predatory wasps that control cabbage caterpillars.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/5e/Broccoli_bunches.jpg",
                    "Full sun", "Low", "Interplant zinnias throughout brassica beds."),
                Companion("Cucumber", "Attracts pollinators and predatory insects to the bed.",
                    "https://upload.wikimedia.org/wikipedia/commons/4/45/Cucumber_on_white.jpg",
                    "Full sun", "Low", "A row of zinnias beside cucumbers boosts pollination.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Fennel", "Fennel inhibits most flowering plants including zinnias."),
                BadNeighbor("Sage", "Competition for dry conditions can stress both plants.")
            )
        ),

        Entry(
            keys = listOf("cosmos"),
            companions = listOf(
                Companion("Tomato", "Attracts hoverflies and parasitic wasps that protect tomatoes.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/88/Salad_garden.jpg",
                    "Full sun", "Low", "Let cosmos self-seed around vegetable beds."),
                Companion("Brassicas", "Beneficial insect magnet that protects nearby brassicas.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/5e/Broccoli_bunches.jpg",
                    "Full sun", "Low", "Allow cosmos to grow freely at the edge of vegetable beds."),
                Companion("Squash", "Attracts pollinators that squash plants depend on.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/82/Squash_and_pumpkins.jpg",
                    "Full sun", "Low", "Plant cosmos generously near squash for better fruit set.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Fennel", "Fennel's allelopathic chemicals stunt cosmos growth."),
                BadNeighbor("Mint", "Mint will aggressively crowd out cosmos plants.")
            )
        ),

        Entry(
            keys = listOf("calendula"),
            companions = listOf(
                Companion("Tomato", "Calendula deters tomato hornworm and whitefly.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/88/Salad_garden.jpg",
                    "Full sun", "Low", "Plant calendula in clusters around the tomato bed."),
                Companion("Asparagus", "Repels asparagus beetles — one of the best pairings.",
                    "https://upload.wikimedia.org/wikipedia/commons/1/1c/Asparagus_officinalis1.jpg",
                    "Full sun", "Low", "Plant calendula throughout the asparagus bed each year."),
                Companion("Carrot", "Attracts the hoverflies that control carrot aphids.",
                    "https://upload.wikimedia.org/wikipedia/commons/a/a2/Carrots_with_stems.jpg",
                    "Full sun", "Low", "Dot calendula plants along carrot rows.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Fennel", "Fennel is broadly allelopathic and stunts calendula."),
                BadNeighbor("Wormwood", "Wormwood secretions inhibit most nearby plants.")
            )
        ),

        Entry(
            keys = listOf("echinacea", "coneflower"),
            companions = listOf(
                Companion("Lavender", "Both attract pollinators and look stunning together.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Blooming_Lavender_Field_-_panoramio_%281%29.jpg/1280px-Blooming_Lavender_Field_-_panoramio_%281%29.jpg",
                    "Full sun", "Low", "A classic low-maintenance wildflower border pairing."),
                Companion("Black-eyed Susan", "Long blooming seasons complement each other perfectly.",
                    "https://upload.wikimedia.org/wikipedia/commons/b/b7/Rudbeckia_hirta.jpg",
                    "Full sun", "Low", "Plant in drifts together for a naturalistic prairie look."),
                Companion("Lemon Balm", "Both attract beneficial insects and look beautiful together.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/8e/Melissa_officinalis_-_K%C3%B6hler%E2%80%93s_Medizinal-Pflanzen-097.jpg",
                    "Full sun", "Low", "A lovely wildflower pairing for a wildlife-friendly garden.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Fennel", "Fennel inhibits echinacea growth and attracts competing pests."),
                BadNeighbor("Wormwood", "Wormwood's secretions harm most nearby plants.")
            )
        ),

        Entry(
            keys = listOf("black-eyed susan", "rudbeckia"),
            companions = listOf(
                Companion("Echinacea", "Bloom at the same time and attract the same pollinators.",
                    "https://upload.wikimedia.org/wikipedia/commons/7/70/Echinacea_purpurea.jpg",
                    "Full sun", "Low", "Plant in alternating drifts for a stunning prairie display."),
                Companion("Lavender", "Lavender and rudbeckia attract pollinators all season.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/9/90/Blooming_Lavender_Field_-_panoramio_%281%29.jpg/1280px-Blooming_Lavender_Field_-_panoramio_%281%29.jpg",
                    "Full sun", "Low", "A drought-tolerant pairing perfect for sunny borders."),
                Companion("Salvia", "Both are drought-tolerant and attract hummingbirds.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/96/Salvia_officinalis_%28Sage%29.jpg",
                    "Full sun", "Low", "A classic summer border combination.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Fennel", "Allelopathic chemicals stunt black-eyed susan growth."),
                BadNeighbor("Invasive grasses", "Will crowd out black-eyed susans over time.")
            )
        ),

        Entry(
            keys = listOf("sweet alyssum", "alyssum"),
            companions = listOf(
                Companion("Tomato", "Alyssum attracts hoverflies that eat aphids on tomatoes.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/88/Salad_garden.jpg",
                    "Full sun", "Low", "Let alyssum self-seed as a living mulch under tomatoes."),
                Companion("Brassicas", "Attracts parasitic wasps that control caterpillar pests.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/5e/Broccoli_bunches.jpg",
                    "Full sun", "Low", "Plant alyssum thickly between brassica plants."),
                Companion("Carrot", "Hoverflies attracted by alyssum also eat carrot aphids.",
                    "https://upload.wikimedia.org/wikipedia/commons/a/a2/Carrots_with_stems.jpg",
                    "Full sun", "Low", "Scatter alyssum seed along carrot rows in spring.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Fennel", "Allelopathic — stunts alyssum growth noticeably."),
                BadNeighbor("Mint", "Mint will outcompete and smother low-growing alyssum.")
            )
        ),

        Entry(
            keys = listOf("peony", "peonies"),
            companions = listOf(
                Companion("Alliums", "Ornamental alliums extend the flowering season beside peonies.",
                    "https://upload.wikimedia.org/wikipedia/commons/2/25/Onion_on_White.JPG",
                    "Full sun", "Moderate", "Plant allium bulbs around peony crowns in autumn."),
                Companion("Salvia", "Salvia fills gaps and attracts pollinators around peonies.",
                    "https://upload.wikimedia.org/wikipedia/commons/9/96/Salvia_officinalis_%28Sage%29.jpg",
                    "Full sun", "Low", "Plant salvia in drifts in front of peony clumps."),
                Companion("Iris", "Irises and peonies bloom in sequence extending the display.",
                    "https://upload.wikimedia.org/wikipedia/commons/4/41/Iris_germanica_%28Purple_bearded_Iris%29%2C_Wakehurst_Place%2C_UK_-_Diliff.jpg",
                    "Full sun", "Moderate", "Plant bearded irises alongside peonies for a classic pairing.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Fennel", "Fennel is allelopathic and inhibits peony root development."),
                BadNeighbor("Trees", "Tree roots compete heavily and deprive peonies of water.")
            )
        ),

        Entry(
            keys = listOf("dahlia", "dahlias"),
            companions = listOf(
                Companion("Marigold", "Deters pests that attack dahlia tubers and foliage.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg",
                    "Full sun", "Moderate", "Plant marigolds densely around dahlia beds."),
                Companion("Cosmos", "Attracts beneficial insects and provides a long blooming season.",
                    "https://upload.wikimedia.org/wikipedia/commons/d/dd/Cosmos_bipinnatus_-_Cosmea_-_panoramio_%283%29.jpg",
                    "Full sun", "Low", "Let cosmos self-seed freely among dahlia plants."),
                Companion("Zinnia", "Zinnias attract hoverflies that eat aphids on dahlias.",
                    "https://upload.wikimedia.org/wikipedia/commons/6/6e/Zinnia_elegans_flowers.jpg",
                    "Full sun", "Low", "Plant zinnias in bold drifts beside dahlias.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Fennel", "Allelopathic chemicals stunt dahlia tuber development."),
                BadNeighbor("Gladiolus", "Share the same thrip pests — avoid planting together.")
            )
        ),

        Entry(
            keys = listOf("borage"),
            companions = listOf(
                Companion("Tomato", "Deters hornworms and attracts pollinators to tomatoes.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/88/Salad_garden.jpg",
                    "Full sun", "Low", "Plant borage freely around tomato plants."),
                Companion("Strawberry", "Borage is the classic strawberry companion plant.",
                    "https://upload.wikimedia.org/wikipedia/commons/2/29/PerfectStrawberry.jpg",
                    "Full sun", "Low", "Let borage self-seed through strawberry beds."),
                Companion("Squash", "Deters squash vine borers and attracts pollinators.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/82/Squash_and_pumpkins.jpg",
                    "Full sun", "Low", "Plant borage at the corners of squash beds.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Fennel", "Fennel inhibits borage growth when planted nearby."),
                BadNeighbor("Wormwood", "Wormwood secretions inhibit borage germination.")
            )
        ),

        // ── FRUITS ──────────────────────────────────────────────────────────────

        Entry(
            keys = listOf("strawberry", "strawberries"),
            companions = listOf(
                Companion("Borage", "The classic strawberry companion — improves flavor and fruit set.",
                    "https://upload.wikimedia.org/wikipedia/commons/3/3c/Borage_flower.jpg",
                    "Full sun", "Moderate", "Let borage self-seed freely through strawberry beds."),
                Companion("Thyme", "Deters worms and boosts strawberry plant health.",
                    "https://upload.wikimedia.org/wikipedia/commons/c/cb/Thymus_vulgaris_-_thyme.jpg",
                    "Full sun", "Low", "Use thyme as a fragrant ground cover around strawberry plants."),
                Companion("Spinach", "Spinach shades the soil and keeps strawberry roots cool.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/5e/Spinach_leaves.jpg",
                    "Partial shade", "Moderate", "Interplant spinach between strawberry crowns in spring.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Brassicas", "Brassicas inhibit strawberry plant growth noticeably."),
                BadNeighbor("Fennel", "Fennel is broadly harmful to strawberry plants.")
            )
        ),

        Entry(
            keys = listOf("blueberry", "blueberries"),
            companions = listOf(
                Companion("Thyme", "Thyme thrives in the acidic soil blueberries prefer.",
                    "https://upload.wikimedia.org/wikipedia/commons/c/cb/Thymus_vulgaris_-_thyme.jpg",
                    "Full sun", "Low", "Plant thyme as ground cover under blueberry bushes."),
                Companion("Nasturtium", "Lures aphids away from blueberry bushes.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg",
                    "Full sun", "Low", "Plant nasturtiums as a trap crop around blueberry beds."),
                Companion("Borage", "Attracts pollinators essential for blueberry fruit set.",
                    "https://upload.wikimedia.org/wikipedia/commons/3/3c/Borage_flower.jpg",
                    "Full sun", "Low", "Plant borage near blueberry bushes to boost pollination.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Nightshades", "Compete for nutrients and may share diseases."),
                BadNeighbor("Lily of the Valley", "Thrives in similar conditions but allelopathic.")
            )
        ),

        Entry(
            keys = listOf("raspberry", "raspberries"),
            companions = listOf(
                Companion("Marigold", "Deters beetles and nematodes from raspberry roots.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg",
                    "Full sun", "Moderate", "Plant marigolds along the base of raspberry canes."),
                Companion("Garlic", "Deters Japanese beetles and aphids from raspberry canes.",
                    "https://upload.wikimedia.org/wikipedia/commons/4/4f/Garlic.jpg",
                    "Full sun", "Low", "Plant garlic bulbs alongside raspberry canes each autumn."),
                Companion("Chamomile", "Attracts beneficial insects that protect raspberry canes.",
                    "https://upload.wikimedia.org/wikipedia/commons/e/e4/Chamomile%40original_size.jpg",
                    "Full sun", "Low", "Allow chamomile to grow freely around the raspberry patch.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Blackberry", "Cross-pollinates and spreads shared cane diseases."),
                BadNeighbor("Potato", "Share verticillium wilt — keep well separated.")
            )
        ),

        Entry(
            keys = listOf("watermelon"),
            companions = listOf(
                Companion("Nasturtium", "Deters beetles and aphids from watermelon vines.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg",
                    "Full sun", "Low", "Let nasturtiums sprawl among watermelon vines."),
                Companion("Marigold", "Repels nematodes and beetles from watermelon roots.",
                    "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg",
                    "Full sun", "Low", "Plant marigolds along the perimeter of the watermelon patch."),
                Companion("Borage", "Attracts pollinators needed for watermelon fruit set.",
                    "https://upload.wikimedia.org/wikipedia/commons/3/3c/Borage_flower.jpg",
                    "Full sun", "Low", "Plant borage at the edges of your watermelon patch.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Cucumber", "Compete for the same nutrients and share diseases."),
                BadNeighbor("Potato", "Share several soilborne diseases — keep apart.")
            )
        ),

        Entry(
            keys = listOf("squash"),
            companions = listOf(
                Companion("Nasturtium", "Deters squash beetles and aphids from the vines.",
                    "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg",
                    "Full sun", "Low", "Let nasturtiums sprawl through the squash patch."),
                Companion("Corn", "Corn provides shade and wind protection for squash.",
                    "https://upload.wikimedia.org/wikipedia/commons/7/7d/Sweet_corn_closeup.jpg",
                    "Full sun", "Moderate", "The Three Sisters — corn, bean and squash together."),
                Companion("Borage", "Deters squash vine borers and attracts pollinators.",
                    "https://upload.wikimedia.org/wikipedia/commons/3/3c/Borage_flower.jpg",
                    "Full sun", "Low", "Plant borage at the four corners of your squash patch.")
            ),
            badNeighbors = listOf(
                BadNeighbor("Pumpkin", "Cross-pollinates aggressively and competes for space."),
                BadNeighbor("Potato", "Both susceptible to blight — never plant near each other.")
            )
        )
    )

    private val fallbackCompanions = listOf(
        Companion("Marigold", "A near-universal companion that deters many soil pests.",
            "https://upload.wikimedia.org/wikipedia/commons/5/53/Marigold_or_Tagetes_erecta.jpg",
            "Full sun", "Low", "French marigolds are the most effective nematode deterrent."),
        Companion("Nasturtium", "A reliable trap crop that pulls aphids off your plants.",
            "https://upload.wikimedia.org/wikipedia/commons/8/87/Tropaeolum_majus_2.jpg",
            "Full sun", "Low", "Flowers and leaves are edible — a bonus harvest."),
        Companion("Borage", "Brings in pollinators and benefits most neighbours.",
            "https://upload.wikimedia.org/wikipedia/commons/3/3c/Borage_flower.jpg",
            "Full sun", "Low", "Let a few plants self-seed for a steady supply each year.")
    )

    private val fallbackBadNeighbors = listOf(
        BadNeighbor("Fennel", "Generally allelopathic — inhibits most garden plants."),
        BadNeighbor("Wormwood", "Secretions can inhibit growth of many nearby plants.")
    )

    fun lookup(query: String): Pair<List<Companion>, List<BadNeighbor>> {
        val q = query.trim().lowercase()
        if (q.isEmpty()) return Pair(emptyList(), emptyList())
        val match = db.firstOrNull { e -> e.keys.any { k -> q == k || q.contains(k) || k.contains(q) } }
        return if (match != null) Pair(match.companions, match.badNeighbors)
        else Pair(fallbackCompanions, fallbackBadNeighbors)
    }
}
