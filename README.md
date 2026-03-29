# Smart Rasoi — High-Fidelity Android XML Prototype

## Design Map (Layout Mapping Document)

**Roll No:** 21F-9432,21F-9659 | **Project:** Smart Rasoi (AI Kitchen Companion)

| Requirement ID | Screen Filename | Function in My App |
|---|---|---|
| L1 (CoordinatorLayout) | `activity_main.xml` | The main dashboard. The hero banner with greeting "Good Evening, Chef!" and tagline collapses when scrolling the recipe carousel, category grid, and tag cloud content below. |
| L2 (ConstraintLayout) | `layout_recipe_detail_card.xml` | The recipe detail header card. I use a Guideline at 30% to split image and text, a Barrier to prevent the prep-time/servings row from overlapping the variable-length recipe description, and a Chain (spread) to distribute Rating, Prep Time, and Servings evenly. |
| L3 (LinearLayout Weighted) | `layout_bottom_nav.xml` | Bottom navigation bar with 5 tabs: Home, Search, Meal Plan, Cook, Profile. Each tab uses `layout_weight="1"` to ensure equal width distribution. |
| L4 (RelativeLayout) | `activity_settings.xml` | The settings preference rows (Notifications, Language, Dark Mode, Meal Times). Each row uses `layout_toRightOf` (title next to icon), `layout_below` (description under title), and `layout_alignParentEnd` (toggle switch at the end). |
| L5 (FrameLayout) | `layout_notification_bell.xml` | The notification hub in the toolbar. A bell icon with a red circular badge showing "3" stacked on top using `layout_gravity="top\|end"`. |
| L6 (GridLayout) | `layout_category_grid.xml` | Grid of meal categories (Breakfast, Lunch, Dinner, Snacks, Iftar Special). The "Quick Meals" card spans 2 columns at the bottom using `layout_columnSpan="2"`. |
| L7 (TableLayout) | `layout_meal_plan_table.xml` | The 7-day meal plan schedule showing Day, Lunch, and Dinner columns (Monday–Sunday). Uses `stretchColumns="1,2"` to make the Lunch and Dinner columns expand to fill the screen width. |
| L8 (HorizontalScrollView) | `layout_recipe_carousel.xml` | The "Recipe of the Day" carousel. 5 recipe cards (Biryani, Aloo Paratha, Daal Chawal, Haleem, Chana Chaat) scroll left-to-right, independent of the main vertical scroll. |
| L9 (RadioGroup) | `layout_filter_group.xml` | Meal preference filter with 5 options: All, Vegetarian, Mixed, Quick, Balanced. Only one can be selected at a time. Used on the home screen and meal plan screen. |
| L10 (ConstraintLayout Flow) | `layout_tag_cloud.xml` | A tag cloud of 12 recipe categories (Quick, Budget, Vegetarian, Iftar, Spicy, Desi, Healthy, Breakfast, Comfort Food, Party, Street Food, Low Cal). Uses the Flow helper widget to auto-wrap chips to the next line. |
