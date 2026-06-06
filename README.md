# Companion Planter (Android · Kotlin · Jetpack Compose)

A rustic-styled app that suggests companion flowers/plants for a given plant.
Search by typing a name **or** by picking a photo. Results always include an
image of each companion. Free users see up to **2** companions; subscribing
unlocks the rest.

## Open & run
1. Open the `CompanionPlanter` folder in **Android Studio** (Hedgehog or newer).
2. Let Gradle sync (it downloads Compose, Coil, Retrofit, etc.).
3. Run on an emulator or device (Android 7.0 / API 24+). Internet permission is
   included so companion images load.

## How it works
- **UI** – Jetpack Compose, Material 3, a warm earthy "rustic" palette and a
  serif typeface (`ui/Theme.kt`, `ui/MainScreen.kt`).
- **Logic** – `ui/MainViewModel.kt` applies the free/paid limit.
  `data/SubscriptionManager.kt` holds entitlement; `FREE_LIMIT = 2`.
- **Data** – `data/PlantRepository.kt` is a local companion-planting knowledge
  base with public-domain image URLs (Wikimedia), so the app runs offline with
  no API keys. Unknown plants fall back to universally helpful companions.
- **Images** – loaded with Coil's `AsyncImage`.

## The two requirements you asked about
- **Max 2 free results:** enforced in `MainViewModel.search()` via
  `SubscriptionManager.FREE_LIMIT`. Subscribers get `all.size`.
- **Images for everyone:** every `CompanionCard` renders an image regardless of
  plan — the limit only affects *how many* cards show.

## Wiring real features (optional next steps)
- **Billing:** replace the demo `toggleSubscription()` and
  `SubscriptionManager` with Google Play Billing (`BillingClient`) and persist
  the entitlement.
- **Photo identification:** the photo picker currently asks the user to confirm
  the plant name. To auto-identify, send the chosen image to an ID service/model
  and feed the detected name into `search()`. See `network/PlantApi.kt` for the
  Retrofit seam.
- **Bigger plant database / live data:** point `MainViewModel` at a backend
  instead of the local `PlantRepository`.

## Note on demo subscription
The "Subscribe (demo)" button just flips the in-memory flag so you can see the
unlock behavior. Swap it for real billing before shipping.
