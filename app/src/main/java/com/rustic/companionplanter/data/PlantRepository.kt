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
                    "https://cdn.pixabay.com/photo/2016/08/22/17/29/basil-1612787_640.jpg",
                    "Full sun", "Moderate", "Pinch flowers to keep basil bushy all season."),
                Companion("Marigold", "Deters nematodes and whiteflies from the root zone.",
                    "https://cdn.pixabay.com/photo/2014/09/08/10/09/marigold-438900_640.jpg",
                    "Full sun", "Low", "French marigolds are the most effective nematode deterrent."),
                Companion("Borage", "Attracts pollinators and deters tomato hornworm.",
                    "https://cdn.pixabay.com/photo/2018/04/29/20/26/borage-3361564_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/22/17/29/basil-1612787_640.jpg",
                    "Full sun", "Moderate", "Plant basil densely around pepper beds for best effect."),
                Companion("Marigold", "Repels nematodes and many flying pests.",
                    "https://cdn.pixabay.com/photo/2014/09/08/10/09/marigold-438900_640.jpg",
                    "Full sun", "Low", "Border your pepper bed with a solid row of marigolds."),
                Companion("Carrot", "Loosens soil around pepper roots and fills ground space.",
                    "https://cdn.pixabay.com/photo/2016/08/09/20/07/vegetables-1580658_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/09/10/17/47/onions-1659503_640.jpg",
                    "Full sun", "Moderate", "Interplant rows of onions and carrots for maximum effect."),
                Companion("Rosemary", "Aromatic foliage deters the carrot fly.",
                    "https://cdn.pixabay.com/photo/2014/12/11/12/15/rosemary-564718_640.jpg",
                    "Full sun", "Low", "Plant as a border hedge to create a protective scent barrier."),
                Companion("Chives", "Improves growth and helps repel aphids.",
                    "https://cdn.pixabay.com/photo/2016/09/08/18/44/chives-1655616_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/22/15/nasturtium-1581677_640.jpg",
                    "Full sun", "Low", "Nasturtium flowers and leaves are edible — a bonus harvest."),
                Companion("Dill", "Attracts predatory insects that hunt pests.",
                    "https://cdn.pixabay.com/photo/2015/07/02/21/02/dill-828762_640.jpg",
                    "Full sun", "Low", "Keep mature dill away from carrots but it thrives beside cucumbers."),
                Companion("Sunflower", "Provides a natural trellis and draws pollinators.",
                    "https://cdn.pixabay.com/photo/2016/07/26/11/14/sunflower-1543162_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/22/15/nasturtium-1581677_640.jpg",
                    "Full sun", "Low", "Let nasturtiums sprawl under zucchini to act as a living mulch."),
                Companion("Borage", "Deters squash vine borers and attracts bees.",
                    "https://cdn.pixabay.com/photo/2018/04/29/20/26/borage-3361564_640.jpg",
                    "Full sun", "Low", "Plant borage at the corners of your zucchini bed."),
                Companion("Marigold", "Repels beetles and nematodes from the root zone.",
                    "https://cdn.pixabay.com/photo/2014/09/08/10/09/marigold-438900_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2014/09/08/10/09/marigold-438900_640.jpg",
                    "Full sun", "Low", "Plant a border of marigolds around your bean rows."),
                Companion("Nasturtium", "Repels aphids and blackfly from bean plants.",
                    "https://cdn.pixabay.com/photo/2016/08/09/22/15/nasturtium-1581677_640.jpg",
                    "Full sun", "Low", "Grow nasturtiums at the ends of bean rows as a trap crop."),
                Companion("Carrot", "Beans fix nitrogen that feeds hungry carrots nearby.",
                    "https://cdn.pixabay.com/photo/2016/08/09/20/07/vegetables-1580658_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/20/07/vegetables-1580658_640.jpg",
                    "Full sun", "Moderate", "Sow peas and carrots together in early spring."),
                Companion("Mint", "Deters aphids and improves overall pea plant health.",
                    "https://cdn.pixabay.com/photo/2015/07/02/20/59/mint-828614_640.jpg",
                    "Partial shade", "Moderate", "Contain mint in a buried pot to prevent it taking over."),
                Companion("Radish", "Deters aphids and loosens soil for pea roots.",
                    "https://cdn.pixabay.com/photo/2016/03/05/19/22/radish-1238247_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/03/05/19/22/radish-1238247_640.jpg",
                    "Partial shade", "Moderate", "Fast-maturing radishes can be harvested before lettuce fills in."),
                Companion("Mint", "Repels slugs and aphids.",
                    "https://cdn.pixabay.com/photo/2015/07/02/20/59/mint-828614_640.jpg",
                    "Partial shade", "Moderate", "Grow mint in a buried pot to stop it spreading everywhere."),
                Companion("Chervil", "Light shade partner that deters aphids and slugs.",
                    "https://cdn.pixabay.com/photo/2019/06/01/07/35/herb-4243336_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/09/10/07/39/strawberries-1659000_640.jpg",
                    "Partial shade", "Moderate", "Interplant spinach between strawberry crowns in spring."),
                Companion("Radish", "Deters leaf miners that damage spinach leaves.",
                    "https://cdn.pixabay.com/photo/2016/03/05/19/22/radish-1238247_640.jpg",
                    "Partial shade", "Moderate", "Sow radish seeds in the same row as spinach."),
                Companion("Nasturtium", "Lures aphids away from spinach plants.",
                    "https://cdn.pixabay.com/photo/2016/08/09/22/15/nasturtium-1581677_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/22/15/nasturtium-1581677_640.jpg",
                    "Full sun", "Low", "Plant nasturtiums as a sacrificial border around kale."),
                Companion("Marigold", "Deters whiteflies and cabbage moths.",
                    "https://cdn.pixabay.com/photo/2014/09/08/10/09/marigold-438900_640.jpg",
                    "Full sun", "Low", "Interplant marigolds generously throughout your brassica beds."),
                Companion("Mint", "Strong scent confuses and deters cabbage white butterfly.",
                    "https://cdn.pixabay.com/photo/2015/07/02/20/59/mint-828614_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/07/18/12/37/chamomile-1525798_640.jpg",
                    "Full sun", "Low", "Allow chamomile to self-seed around your brassica beds."),
                Companion("Nasturtium", "Trap crop for aphids that would otherwise target broccoli.",
                    "https://cdn.pixabay.com/photo/2016/08/09/22/15/nasturtium-1581677_640.jpg",
                    "Full sun", "Low", "Let nasturtiums sprawl at the base of broccoli plants."),
                Companion("Rosemary", "Deters cabbage moths and bean beetles.",
                    "https://cdn.pixabay.com/photo/2014/12/11/12/15/rosemary-564718_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/20/07/vegetables-1580658_640.jpg",
                    "Full sun", "Moderate", "The classic pairing — alternate rows for best pest protection."),
                Companion("Chamomile", "Said to improve onion flavor and deter pests.",
                    "https://cdn.pixabay.com/photo/2016/07/18/12/37/chamomile-1525798_640.jpg",
                    "Full sun", "Low", "Plant chamomile sparingly — a little goes a long way."),
                Companion("Marigold", "Repels a wide range of insects harmful to onions.",
                    "https://cdn.pixabay.com/photo/2014/09/08/10/09/marigold-438900_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2015/07/13/08/06/lavender-843311_640.jpg",
                    "Full sun", "Low", "Plant garlic cloves at the base of rose bushes in autumn."),
                Companion("Tomato", "Deters spider mites and other tomato pests.",
                    "https://cdn.pixabay.com/photo/2016/08/09/21/54/tomatoes-1581280_640.jpg",
                    "Full sun", "Low", "Interplant garlic between tomato plants for season-long protection."),
                Companion("Chamomile", "Improves garlic's growth and flavor when planted nearby.",
                    "https://cdn.pixabay.com/photo/2016/07/18/12/37/chamomile-1525798_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/09/10/17/47/onions-1659503_640.jpg",
                    "Full sun", "Moderate", "Interrow onions and beets for mutual pest deterrence."),
                Companion("Lettuce", "Uses space efficiently and keeps beet soil moist.",
                    "https://cdn.pixabay.com/photo/2016/08/09/21/54/tomatoes-1581280_640.jpg",
                    "Partial shade", "Moderate", "Lettuce fills the space between beet rows nicely."),
                Companion("Nasturtium", "Deters aphids and blackfly from beet plants.",
                    "https://cdn.pixabay.com/photo/2016/08/09/22/15/nasturtium-1581677_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/22/15/nasturtium-1581677_640.jpg",
                    "Full sun", "Low", "Plant nasturtiums as a sacrificial border."),
                Companion("Lettuce", "Radishes mark rows and loosen soil for lettuce roots.",
                    "https://cdn.pixabay.com/photo/2016/08/09/21/54/tomatoes-1581280_640.jpg",
                    "Partial shade", "Moderate", "Sow radish seeds in lettuce rows as natural row markers."),
                Companion("Chervil", "Said to make radishes more tender and peppery.",
                    "https://cdn.pixabay.com/photo/2019/06/01/07/35/herb-4243336_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/22/17/29/basil-1612787_640.jpg",
                    "Full sun", "Moderate", "Plant basil densely around eggplant for best protection."),
                Companion("Marigold", "Deters nematodes and a wide range of flying pests.",
                    "https://cdn.pixabay.com/photo/2014/09/08/10/09/marigold-438900_640.jpg",
                    "Full sun", "Low", "French marigolds planted around the bed provide strong protection."),
                Companion("Tarragon", "Broadly improves growth of most vegetables including eggplant.",
                    "https://cdn.pixabay.com/photo/2016/09/01/08/26/tarragon-1636975_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/03/05/19/23/beans-1238244_640.jpg",
                    "Full sun", "Moderate", "Plant beans at the base of corn stalks once corn is 6 inches tall."),
                Companion("Squash", "Large leaves shade soil, retain moisture and deter weeds.",
                    "https://cdn.pixabay.com/photo/2016/09/09/22/09/pumpkin-1658887_640.jpg",
                    "Full sun", "Moderate", "Let squash sprawl between corn plants as a living mulch."),
                Companion("Borage", "Deters tomato hornworm and attracts pollinators.",
                    "https://cdn.pixabay.com/photo/2018/04/29/20/26/borage-3361564_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/22/15/nasturtium-1581677_640.jpg",
                    "Full sun", "Low", "Let nasturtiums sprawl among pumpkin vines."),
                Companion("Marigold", "Repels many pests that attack pumpkin plants.",
                    "https://cdn.pixabay.com/photo/2014/09/08/10/09/marigold-438900_640.jpg",
                    "Full sun", "Low", "Plant marigolds generously around the pumpkin patch perimeter."),
                Companion("Corn", "Provides wind protection and shade for pumpkin roots.",
                    "https://cdn.pixabay.com/photo/2016/07/18/18/54/corn-1526638_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/03/05/19/22/radish-1238247_640.jpg",
                    "Full sun", "Moderate", "Plant horseradish at the corners of your potato patch."),
                Companion("Nasturtium", "Repels aphids and acts as a trap crop for beetles.",
                    "https://cdn.pixabay.com/photo/2016/08/09/22/15/nasturtium-1581677_640.jpg",
                    "Full sun", "Low", "Let nasturtiums sprawl among potato plants."),
                Companion("Marigold", "Repels nematodes and many potato pests.",
                    "https://cdn.pixabay.com/photo/2014/09/08/10/09/marigold-438900_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/22/17/29/basil-1612787_640.jpg",
                    "Full sun", "Moderate", "Plant basil alongside established asparagus crowns."),
                Companion("Tomato", "Tomatoes repel asparagus beetles; asparagus deters nematodes.",
                    "https://cdn.pixabay.com/photo/2016/08/09/21/54/tomatoes-1581280_640.jpg",
                    "Full sun", "Moderate", "A rare mutual benefit — one of the best vegetable pairings."),
                Companion("Marigold", "Deters a wide range of pests from the asparagus bed.",
                    "https://cdn.pixabay.com/photo/2014/09/08/10/09/marigold-438900_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/21/54/tomatoes-1581280_640.jpg",
                    "Full sun", "Moderate", "Plant basil directly alongside your tomato plants."),
                Companion("Pepper", "Basil deters aphids and spider mites from pepper plants.",
                    "https://cdn.pixabay.com/photo/2016/08/23/08/52/pepper-1614602_640.jpg",
                    "Full sun", "Moderate", "Interplant basil densely between pepper plants."),
                Companion("Marigold", "Together they form a powerful pest-deterring combination.",
                    "https://cdn.pixabay.com/photo/2014/09/08/10/09/marigold-438900_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/21/54/tomatoes-1581280_640.jpg",
                    "Full sun", "Moderate", "Contain mint in a buried pot near tomatoes."),
                Companion("Brassicas", "Deters cabbage moth, aphids and flea beetles.",
                    "https://cdn.pixabay.com/photo/2016/03/05/19/02/broccoli-1238250_640.jpg",
                    "Partial shade", "Moderate", "Plant mint at the corners of brassica beds."),
                Companion("Pea", "Mint deters aphids that commonly attack pea plants.",
                    "https://cdn.pixabay.com/photo/2016/07/27/10/44/peas-1543723_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/20/07/vegetables-1580658_640.jpg",
                    "Full sun", "Low", "Plant a rosemary hedge around your carrot bed."),
                Companion("Sage", "Rosemary and sage are mutually beneficial and repel shared pests.",
                    "https://cdn.pixabay.com/photo/2016/09/01/09/25/sage-1637246_640.jpg",
                    "Full sun", "Low", "A classic Mediterranean herb pairing for any garden."),
                Companion("Bean", "Rosemary deters bean beetles when planted nearby.",
                    "https://cdn.pixabay.com/photo/2016/03/05/19/23/beans-1238244_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/11/08/04/cucumber-1585508_640.jpg",
                    "Full sun", "Low", "Plant dill near but not touching cucumber plants."),
                Companion("Lettuce", "Dill attracts aphid predators that protect lettuce.",
                    "https://cdn.pixabay.com/photo/2016/08/09/21/54/tomatoes-1581280_640.jpg",
                    "Full sun", "Low", "A few dill plants near lettuce beds attract beneficial wasps."),
                Companion("Onion", "Dill and onion are mutually beneficial growing companions.",
                    "https://cdn.pixabay.com/photo/2016/09/10/17/47/onions-1659503_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/20/07/vegetables-1580658_640.jpg",
                    "Full sun", "Moderate", "Interplant chives in rows between carrots."),
                Companion("Rose", "Chives help prevent blackspot and deter aphids from roses.",
                    "https://cdn.pixabay.com/photo/2015/07/13/08/06/lavender-843311_640.jpg",
                    "Full sun", "Moderate", "Plant chives as a border around rose beds."),
                Companion("Tomato", "Chives deter aphids and improve tomato plant vigor.",
                    "https://cdn.pixabay.com/photo/2016/08/09/21/54/tomatoes-1581280_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/21/54/tomatoes-1581280_640.jpg",
                    "Partial shade", "Moderate", "Plant parsley as a border around tomato beds."),
                Companion("Rose", "Parsley improves rose fragrance and deters rose beetles.",
                    "https://cdn.pixabay.com/photo/2015/07/13/08/06/lavender-843311_640.jpg",
                    "Partial shade", "Moderate", "Tuck parsley plants around the base of rose bushes."),
                Companion("Asparagus", "Parsley and asparagus are beneficial to each other.",
                    "https://cdn.pixabay.com/photo/2016/03/05/19/02/asparagus-1238252_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/03/05/19/02/broccoli-1238250_640.jpg",
                    "Full sun", "Low", "Plant thyme as a border around all brassica beds."),
                Companion("Eggplant", "Thyme repels the flea beetles that target eggplant.",
                    "https://cdn.pixabay.com/photo/2016/08/23/08/52/eggplant-1614601_640.jpg",
                    "Full sun", "Low", "Interplant thyme among eggplant for season-long protection."),
                Companion("Strawberry", "Thyme deters worms and boosts strawberry plant health.",
                    "https://cdn.pixabay.com/photo/2016/09/10/07/39/strawberries-1659000_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2014/12/11/12/15/rosemary-564718_640.jpg",
                    "Full sun", "Low", "Plant sage and rosemary together in a sunny dry border."),
                Companion("Brassicas", "Sage deters cabbage moth and imported cabbageworm.",
                    "https://cdn.pixabay.com/photo/2016/03/05/19/02/broccoli-1238250_640.jpg",
                    "Full sun", "Low", "Plant sage around the perimeter of brassica beds."),
                Companion("Carrot", "Sage confuses the carrot fly with its strong scent.",
                    "https://cdn.pixabay.com/photo/2016/08/09/20/07/vegetables-1580658_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2015/07/13/08/06/lavender-843311_640.jpg",
                    "Full sun", "Low", "Plant lavender in generous drifts around rose beds."),
                Companion("Brassicas", "Lavender deters whitefly and cabbage moth effectively.",
                    "https://cdn.pixabay.com/photo/2016/03/05/19/02/broccoli-1238250_640.jpg",
                    "Full sun", "Low", "A lavender border protects brassica beds all season."),
                Companion("Echinacea", "Both attract pollinators and create a stunning display together.",
                    "https://cdn.pixabay.com/photo/2014/07/09/10/55/echinacea-388989_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/09/10/17/47/onions-1659503_640.jpg",
                    "Full sun", "Low", "Plant chamomile sparingly in onion beds."),
                Companion("Brassicas", "Attracts hoverflies whose larvae eat aphids on brassicas.",
                    "https://cdn.pixabay.com/photo/2016/03/05/19/02/broccoli-1238250_640.jpg",
                    "Full sun", "Low", "Allow chamomile to self-seed around brassica beds."),
                Companion("Cucumber", "Chamomile attracts pollinators needed for cucumber fruiting.",
                    "https://cdn.pixabay.com/photo/2016/08/11/08/04/cucumber-1585508_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/21/54/tomatoes-1581280_640.jpg",
                    "Partial shade", "Moderate", "Plant lemon balm near tomatoes but contain it in a pot."),
                Companion("Squash", "Attracts pollinators essential for squash fruit set.",
                    "https://cdn.pixabay.com/photo/2016/09/09/22/09/pumpkin-1658887_640.jpg",
                    "Partial shade", "Moderate", "Let lemon balm grow freely at the edge of squash beds."),
                Companion("Echinacea", "Both attract beneficial insects and look beautiful together.",
                    "https://cdn.pixabay.com/photo/2014/07/09/10/55/echinacea-388989_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2015/07/13/08/06/lavender-843311_640.jpg",
                    "Full sun", "Low", "Cut back by one-third after flowering to keep it compact."),
                Companion("Garlic", "Wards off aphids, blackspot and many beetles.",
                    "https://cdn.pixabay.com/photo/2016/09/15/09/23/garlic-1673990_640.jpg",
                    "Full sun", "Low", "Plant cloves around rose bases in autumn for spring benefit."),
                Companion("Catmint", "Long-blooming filler that deters several pests.",
                    "https://cdn.pixabay.com/photo/2019/06/22/14/23/catnip-4291668_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/21/54/tomatoes-1581280_640.jpg",
                    "Full sun", "Low", "Plant French marigolds densely around the tomato bed."),
                Companion("Basil", "Together they form a powerful pest-deterring duo.",
                    "https://cdn.pixabay.com/photo/2016/08/22/17/29/basil-1612787_640.jpg",
                    "Full sun", "Moderate", "Interplant basil and marigolds as a pest-repelling border."),
                Companion("Pepper", "Deters aphids and beetles that target pepper plants.",
                    "https://cdn.pixabay.com/photo/2016/08/23/08/52/pepper-1614602_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/21/54/tomatoes-1581280_640.jpg",
                    "Full sun", "Low", "Let nasturtiums sprawl at the base of tomato plants."),
                Companion("Cucumber", "Repels cucumber beetles and aphids effectively.",
                    "https://cdn.pixabay.com/photo/2016/08/11/08/04/cucumber-1585508_640.jpg",
                    "Full sun", "Low", "Plant nasturtiums as a companion border to cucumber rows."),
                Companion("Brassicas", "A sacrificial trap crop that lures caterpillars away.",
                    "https://cdn.pixabay.com/photo/2016/03/05/19/02/broccoli-1238250_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/11/08/04/cucumber-1585508_640.jpg",
                    "Full sun", "Low", "Plant cucumbers at the base of sunflower stems."),
                Companion("Squash", "Sunflowers attract pollinators needed by squash plants.",
                    "https://cdn.pixabay.com/photo/2016/09/09/22/09/pumpkin-1658887_640.jpg",
                    "Full sun", "Low", "Plant sunflowers at the edge of squash patches."),
                Companion("Corn", "Both are tall heavy feeders that shade soil and deter pests.",
                    "https://cdn.pixabay.com/photo/2016/07/18/18/54/corn-1526638_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/21/54/tomatoes-1581280_640.jpg",
                    "Full sun", "Low", "Plant zinnias in bold clusters near tomato beds."),
                Companion("Cabbage", "Attracts predatory wasps that control cabbage caterpillars.",
                    "https://cdn.pixabay.com/photo/2016/03/05/19/02/broccoli-1238250_640.jpg",
                    "Full sun", "Low", "Interplant zinnias throughout brassica beds."),
                Companion("Cucumber", "Attracts pollinators and predatory insects to the bed.",
                    "https://cdn.pixabay.com/photo/2016/08/11/08/04/cucumber-1585508_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/21/54/tomatoes-1581280_640.jpg",
                    "Full sun", "Low", "Let cosmos self-seed around vegetable beds."),
                Companion("Brassicas", "Beneficial insect magnet that protects nearby brassicas.",
                    "https://cdn.pixabay.com/photo/2016/03/05/19/02/broccoli-1238250_640.jpg",
                    "Full sun", "Low", "Allow cosmos to grow freely at the edge of vegetable beds."),
                Companion("Squash", "Attracts pollinators that squash plants depend on.",
                    "https://cdn.pixabay.com/photo/2016/09/09/22/09/pumpkin-1658887_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/21/54/tomatoes-1581280_640.jpg",
                    "Full sun", "Low", "Plant calendula in clusters around the tomato bed."),
                Companion("Asparagus", "Repels asparagus beetles — one of the best pairings.",
                    "https://cdn.pixabay.com/photo/2016/03/05/19/02/asparagus-1238252_640.jpg",
                    "Full sun", "Low", "Plant calendula throughout the asparagus bed each year."),
                Companion("Carrot", "Attracts the hoverflies that control carrot aphids.",
                    "https://cdn.pixabay.com/photo/2016/08/09/20/07/vegetables-1580658_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2015/07/13/08/06/lavender-843311_640.jpg",
                    "Full sun", "Low", "A classic low-maintenance wildflower border pairing."),
                Companion("Black-eyed Susan", "Long blooming seasons complement each other perfectly.",
                    "https://cdn.pixabay.com/photo/2015/08/01/18/22/rudbeckia-870244_640.jpg",
                    "Full sun", "Low", "Plant in drifts together for a naturalistic prairie look."),
                Companion("Lemon Balm", "Both attract beneficial insects and look beautiful together.",
                    "https://cdn.pixabay.com/photo/2017/07/12/21/12/balm-2498892_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2014/07/09/10/55/echinacea-388989_640.jpg",
                    "Full sun", "Low", "Plant in alternating drifts for a stunning prairie display."),
                Companion("Lavender", "Lavender and rudbeckia attract pollinators all season.",
                    "https://cdn.pixabay.com/photo/2015/07/13/08/06/lavender-843311_640.jpg",
                    "Full sun", "Low", "A drought-tolerant pairing perfect for sunny borders."),
                Companion("Salvia", "Both are drought-tolerant and attract hummingbirds.",
                    "https://cdn.pixabay.com/photo/2016/09/01/09/25/sage-1637246_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/21/54/tomatoes-1581280_640.jpg",
                    "Full sun", "Low", "Let alyssum self-seed as a living mulch under tomatoes."),
                Companion("Brassicas", "Attracts parasitic wasps that control caterpillar pests.",
                    "https://cdn.pixabay.com/photo/2016/03/05/19/02/broccoli-1238250_640.jpg",
                    "Full sun", "Low", "Plant alyssum thickly between brassica plants."),
                Companion("Carrot", "Hoverflies attracted by alyssum also eat carrot aphids.",
                    "https://cdn.pixabay.com/photo/2016/08/09/20/07/vegetables-1580658_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/09/10/17/47/onions-1659503_640.jpg",
                    "Full sun", "Moderate", "Plant allium bulbs around peony crowns in autumn."),
                Companion("Salvia", "Salvia fills gaps and attracts pollinators around peonies.",
                    "https://cdn.pixabay.com/photo/2016/09/01/09/25/sage-1637246_640.jpg",
                    "Full sun", "Low", "Plant salvia in drifts in front of peony clumps."),
                Companion("Iris", "Irises and peonies bloom in sequence extending the display.",
                    "https://cdn.pixabay.com/photo/2017/03/15/22/16/iris-2148501_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2014/09/08/10/09/marigold-438900_640.jpg",
                    "Full sun", "Moderate", "Plant marigolds densely around dahlia beds."),
                Companion("Cosmos", "Attracts beneficial insects and provides a long blooming season.",
                    "https://cdn.pixabay.com/photo/2017/09/14/23/06/cosmos-2750994_640.jpg",
                    "Full sun", "Low", "Let cosmos self-seed freely among dahlia plants."),
                Companion("Zinnia", "Zinnias attract hoverflies that eat aphids on dahlias.",
                    "https://cdn.pixabay.com/photo/2016/08/02/16/12/zinnia-1564851_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/21/54/tomatoes-1581280_640.jpg",
                    "Full sun", "Low", "Plant borage freely around tomato plants."),
                Companion("Strawberry", "Borage is the classic strawberry companion plant.",
                    "https://cdn.pixabay.com/photo/2016/09/10/07/39/strawberries-1659000_640.jpg",
                    "Full sun", "Low", "Let borage self-seed through strawberry beds."),
                Companion("Squash", "Deters squash vine borers and attracts pollinators.",
                    "https://cdn.pixabay.com/photo/2016/09/09/22/09/pumpkin-1658887_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2018/04/29/20/26/borage-3361564_640.jpg",
                    "Full sun", "Moderate", "Let borage self-seed freely through strawberry beds."),
                Companion("Thyme", "Deters worms and boosts strawberry plant health.",
                    "https://cdn.pixabay.com/photo/2015/07/02/21/11/thyme-828908_640.jpg",
                    "Full sun", "Low", "Use thyme as a fragrant ground cover around strawberry plants."),
                Companion("Spinach", "Spinach shades the soil and keeps strawberry roots cool.",
                    "https://cdn.pixabay.com/photo/2016/03/26/18/24/spinach-1280621_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2015/07/02/21/11/thyme-828908_640.jpg",
                    "Full sun", "Low", "Plant thyme as ground cover under blueberry bushes."),
                Companion("Nasturtium", "Lures aphids away from blueberry bushes.",
                    "https://cdn.pixabay.com/photo/2016/08/09/22/15/nasturtium-1581677_640.jpg",
                    "Full sun", "Low", "Plant nasturtiums as a trap crop around blueberry beds."),
                Companion("Borage", "Attracts pollinators essential for blueberry fruit set.",
                    "https://cdn.pixabay.com/photo/2018/04/29/20/26/borage-3361564_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2014/09/08/10/09/marigold-438900_640.jpg",
                    "Full sun", "Moderate", "Plant marigolds along the base of raspberry canes."),
                Companion("Garlic", "Deters Japanese beetles and aphids from raspberry canes.",
                    "https://cdn.pixabay.com/photo/2016/09/15/09/23/garlic-1673990_640.jpg",
                    "Full sun", "Low", "Plant garlic bulbs alongside raspberry canes each autumn."),
                Companion("Chamomile", "Attracts beneficial insects that protect raspberry canes.",
                    "https://cdn.pixabay.com/photo/2016/07/18/12/37/chamomile-1525798_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/22/15/nasturtium-1581677_640.jpg",
                    "Full sun", "Low", "Let nasturtiums sprawl among watermelon vines."),
                Companion("Marigold", "Repels nematodes and beetles from watermelon roots.",
                    "https://cdn.pixabay.com/photo/2014/09/08/10/09/marigold-438900_640.jpg",
                    "Full sun", "Low", "Plant marigolds along the perimeter of the watermelon patch."),
                Companion("Borage", "Attracts pollinators needed for watermelon fruit set.",
                    "https://cdn.pixabay.com/photo/2018/04/29/20/26/borage-3361564_640.jpg",
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
                    "https://cdn.pixabay.com/photo/2016/08/09/22/15/nasturtium-1581677_640.jpg",
                    "Full sun", "Low", "Let nasturtiums sprawl through the squash patch."),
                Companion("Corn", "Corn provides shade and wind protection for squash.",
                    "https://cdn.pixabay.com/photo/2016/07/18/18/54/corn-1526638_640.jpg",
                    "Full sun", "Moderate", "The Three Sisters — corn, bean and squash together."),
                Companion("Borage", "Deters squash vine borers and attracts pollinators.",
                    "https://cdn.pixabay.com/photo/2018/04/29/20/26/borage-3361564_640.jpg",
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
            "https://cdn.pixabay.com/photo/2014/09/08/10/09/marigold-438900_640.jpg",
            "Full sun", "Low", "French marigolds are the most effective nematode deterrent."),
        Companion("Nasturtium", "A reliable trap crop that pulls aphids off your plants.",
            "https://cdn.pixabay.com/photo/2016/08/09/22/15/nasturtium-1581677_640.jpg",
            "Full sun", "Low", "Flowers and leaves are edible — a bonus harvest."),
        Companion("Borage", "Brings in pollinators and benefits most neighbours.",
            "https://cdn.pixabay.com/photo/2018/04/29/20/26/borage-3361564_640.jpg",
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
