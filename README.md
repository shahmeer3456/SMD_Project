# SmartRasoi - Data Driven Android Application

SmartRasoi is a sophisticated, data-driven Android application designed to streamline recipe discovery and meal planning. This project serves as a comprehensive implementation of modern Android development's core pillars: modular UI design, dynamic list handling, and seamless multi-component data communication.

---

## 🎯 Project Objective
The goal of this application is to demonstrate a robust architecture where information flows securely and efficiently between Activities and Fragments using standard Android patterns (Intents, Bundles, and Serialization) while maintaining a clean, scalable codebase.

---

## 🚀 Key Functional Requirements (F1 - F5)

| ID | Title | Implementation Description |
| :--- | :--- | :--- |
| **F1** | **Intent Navigation** | Securely transitions from the `OnboardingActivity` to the `MainActivity` while passing user initialization data (e.g., username) via Intent Extras. |
| **F2** | **Bundle Object Transfer** | Efficiently transfers a custom `Recipe` object between fragments using Bundles. The object is passed from the list to the detailed view for a seamless user experience. |
| **F3** | **Dynamic RecyclerView** | Implements a high-performance vertical `RecyclerView` list using a custom `RecipeAdapter` and the `ViewHolder` pattern to display recipe information with pre-built UI components. |
| **F4** | **Fragment Transaction** | Built on a single-activity architecture where screens (Home, Cook, Detail) are intelligently swapped using `FragmentTransaction` to optimize memory and performance. |
| **F5** | **Smart Search & Filter** | Features a real-time filtering system integrated directly into the `RecipeAdapter`, allowing users to search through the entire recipe list instantly. |

---

## 🔧 Project Architecture & Clean Practice
The application is organized into a modular folder structure to ensure **Separation of Concerns**:

- 📂 **Activities**: Navigation coordinators and container handlers (`OnboardingActivity`, `MainActivity`).
- 📂 **Fragments**: Specialized UI controllers for specific application features (`HomeFragment`, `CookFragment`, `RecipeDetailFragment`).
- 📂 **Adapters**: Robust logic for data-to-view mapping in complex UI lists (`RecipeAdapter`).
- 📂 **Models**: Strongly-typed data entities that encapsulate the application's core logic (`Recipe.kt`).

---

## 🛠 Tech Stack & Tools
- **Language**: Kotlin
- **Base Components**: CoordinatorLayout, CollapsingToolbarLayout, RecyclerView.
- **Communication Protocols**: Intent Extras, Bundles, Serializable.
- **Navigation System**: Manual Fragment Management for high-level control.

---

## 📝 Submission Checklist
- ✅ Complete Android Studio Project (Integrated logic)
- ✅ logic_map.pdf / logic_map_doc.md (Full mapping documentation)
- ✅ Modern UI/UX implementation following design standards.

---

## ⚙️ How to Run
1. Clone the repository and open in **Android Studio Hedgehog** or later.
2. Ensure you have **API 24 or above** (Android 7.0+) as the minimum SDK.
3. Sync Gradle and build the project.
4. Launch the application; the flow begins with the **OnboardingActivity**.
