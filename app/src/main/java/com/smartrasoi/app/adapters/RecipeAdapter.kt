package com.smartrasoi.app.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Filter
import android.widget.Filterable
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.smartrasoi.app.R
import com.smartrasoi.app.models.Recipe

class RecipeAdapter(
    private var recipes: List<Recipe>,
    private val onRecipeClick: (Recipe) -> Unit
) : RecyclerView.Adapter<RecipeAdapter.RecipeViewHolder>(), Filterable {

    private var filteredRecipes: List<Recipe> = recipes

    inner class RecipeViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title: TextView = itemView.findViewById(R.id.textRecipeTitle)
        val stats: TextView = itemView.findViewById(R.id.textRecipeDesc)
        val time: TextView = itemView.findViewById(R.id.textRecipeTime)
        val rating: TextView = itemView.findViewById(R.id.textRecipeRating)

        fun bind(recipe: Recipe) {
            title.text = recipe.title
            stats.text = recipe.description
            time.text = recipe.time
            rating.text = recipe.rating
            itemView.setOnClickListener { onRecipeClick(recipe) }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipeViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_recipe_card, parent, false)
        return RecipeViewHolder(view)
    }

    override fun getItemCount(): Int = filteredRecipes.size

    override fun onBindViewHolder(holder: RecipeViewHolder, position: Int) {
        holder.bind(filteredRecipes[position])
    }

    fun updateData(newRecipes: List<Recipe>) {
        recipes = newRecipes
        filteredRecipes = newRecipes
        notifyDataSetChanged()
    }

    override fun getFilter(): Filter {
        return object : Filter() {
            override fun performFiltering(constraint: CharSequence?): FilterResults {
                val charString = constraint?.toString() ?: ""
                filteredRecipes = if (charString.isEmpty()) {
                    recipes
                } else {
                    val filteredList = mutableListOf<Recipe>()
                    for (row in recipes) {
                        if (row.title.toLowerCase().contains(charString.toLowerCase()) || 
                            row.description.toLowerCase().contains(charString.toLowerCase())) {
                            filteredList.add(row)
                        }
                    }
                    filteredList
                }
                val filterResults = FilterResults()
                filterResults.values = filteredRecipes
                return filterResults
            }

            @Suppress("UNCHECKED_CAST")
            override fun publishResults(constraint: CharSequence?, results: FilterResults?) {
                filteredRecipes = results?.values as List<Recipe>
                notifyDataSetChanged()
            }
        }
    }
}
