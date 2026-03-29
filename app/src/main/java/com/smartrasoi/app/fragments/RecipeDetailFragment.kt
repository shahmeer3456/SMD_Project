package com.smartrasoi.app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.smartrasoi.app.R
import com.smartrasoi.app.models.Recipe

class RecipeDetailFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_recipe_detail, container, false)

        // F2: Bundle Receiver logic - Extracting custom object (Serializable)
        val recipe = arguments?.getSerializable("RECIPE_OBJECT") as? Recipe

        if (recipe != null) {
            val title = root.findViewById<TextView>(R.id.recipeTitle)
            val desc = root.findViewById<TextView>(R.id.recipeDescription)
            val statRating = root.findViewById<TextView>(R.id.statRating)?.findViewById<TextView>(R.id.statRating) // Or specific child
            
            title.text = recipe.title
            desc.text = recipe.description
            // Additional view binding can go here
        }

        // Setup back button
        root.findViewById<FrameLayout>(R.id.btnBack).setOnClickListener {
            parentFragmentManager.popBackStack()
        }

        return root
    }
}
