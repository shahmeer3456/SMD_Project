# SmartRasoi - Data Driven Android Application

SmartRasoi is a modular, data-driven Android application designed to help users discover and filter recipes. This project demonstrates modern Android development practices, including Activity-Fragment navigation, data communication via Intents and Bundles, and dynamic list presentation using RecyclerView.

## 🚀 Objective
Develop an application where information flows seamlessly between components while maintaining a clean, decoupled architecture.

## ✨ Key Features
- **F1: Intent Navigation**: Smooth transition from the Onboarding/Splash screen to the Main Dashboard with data persistence.
- **F2: Bundle Data Transfer**: Secure transfer of custom `Recipe` objects from the list view to the detail screen.
- **F3: Vertical RecyclerView**: Dynamic display of recipes using personalizable row layouts, ViewHolders, and high-performance Adapters.
- **F4: Fragment Coordination**: A single-activity architecture where screens are swapped as fragments without activity restarts.
- **F5: Dynamic Search & Filter**: Real-time filtering system that narrows down recipes as the user types in the search bar.

## 🏗 Project Architecture
The project follows **Clean Architecture** principles with a strict separation of concerns across the following packages:
- `activities/`: Contians navigation coordinators (e.g., `MainActivity`, `OnboardingActivity`).
- `fragments/`: Houses primary UI content and logic.
- `adapters/`: Manages data-to-view binding for RecyclerViews.
- `models/`: Defines the data schema (e.g., `Recipe.kt`).

## 🛠 Tech Stack
- **Language**: Kotlin
- **UI Components**: Material Design, ConstraintLayout, CoordinatorLayout.
- **Navigation**: SupportFragmentManager & FragmentTransactions.
- **Data Persistence**: Parcelable/Serializable communication via Intents and Bundles.

## 📝 Assignment Requirements & Mapping
Detailed implementation logic can be found in the `logic_map_doc.md`.

| ID | Component | Requirement Description |
|---|---|---|
| **F1** | Intent | Navigate from Onboarding to Dashboard with data. |
| **F2** | Bundle | Transfer a custom object from RecyclerView to Detail Fragment. |
| **F3** | RecyclerView | Display a vertical list with custom row layout. |
| **F4** | Fragments | Switch between 2+ fragments without restarting activity. |
| **F5** | Search/Filter | Real-time RecyclerView filtering. |

## 📦 How to Run
1. Open the project in **Android Studio**.
2. Sync Project with Gradle Files.
3. Build and Run on an Emulator or Physical Device (API 24+).
4. Start from the **OnboardingActivity** to experience the full data flow.
