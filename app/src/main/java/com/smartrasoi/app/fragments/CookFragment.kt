package com.smartrasoi.app.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.smartrasoi.app.R
import com.smartrasoi.app.adapters.RecipeAdapter
import com.smartrasoi.app.models.Recipe

class CookFragment : Fragment() {

    private lateinit var adapter: RecipeAdapter
    private val recipes = listOf(
        Recipe("1", "Chicken Biryani", "Classic layered rice with chicken", "45 min", "4.8"),
        Recipe("2", "Aloo Paratha", "Indian flatbread with spicy potatoes", "20 min", "4.6"),
        Recipe("3", "Daal Chawal", "Lentil stew with steam rice", "30 min", "4.5"),
        Recipe("4", "Haleem", "Slow-cooked meat and grains porridge", "2 hrs", "4.9"),
        Recipe("5", "Chana Chaat", "Tangy chickpea salad", "10 min", "4.3")
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_cook, container, false)

        // F3: RecyclerView Display vertical list using custom row layout and ViewHolder
        val recyclerView = root.findViewById<RecyclerView>(R.id.recyclerViewRecipes)
        recyclerView.layoutManager = LinearLayoutManager(context)
        
        adapter = RecipeAdapter(recipes) { recipe ->
            // F2: Bundle Transfer - Navigate to DetailFragment with custom object (Serializable)
            val bundle = Bundle()
            bundle.putSerializable("RECIPE_OBJECT", recipe)
            
            val detailFragment = RecipeDetailFragment()
            detailFragment.arguments = bundle
            
            // F4: Fragment Transaction - Switch to Detail
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, detailFragment)
                .addToBackStack(null) // Support back button
                .commit()
        }
        
        recyclerView.adapter = adapter

        // F5: Search / Filter Provide a search or filter feature for RecyclerView items
        val searchInput = root.findViewById<EditText>(R.id.editSearch)
        searchInput.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable?) {
                adapter.filter.filter(s.toString())
            }
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
        })

        return root
    }
}
