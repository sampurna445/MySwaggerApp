package com.example.myswaggerapp.ui.ingredients

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myswaggerapp.R
import com.example.myswaggerapp.data.model.housesModel.HousesModelItemModel
import com.example.myswaggerapp.data.model.ingredientsModel.IngredientsModelItemModel
import com.example.myswaggerapp.databinding.ItemIngredientsBinding

class IngredientsAdapter(val ingredients: ArrayList<IngredientsModelItemModel>) :
    RecyclerView.Adapter<IngredientsAdapter.ViewHolder>() {

    var onItemClick:  ((IngredientsModelItemModel) -> Unit)? = null

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemIngredientsBinding.bind(view)

        fun handleData(item: IngredientsModelItemModel?) {
            binding.ingredientName.text = item?.name
            binding.ingredientId.text = item?.id
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_ingredients, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = ingredients?.size ?: 0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.handleData(ingredients?.get(position))
        holder.itemView.setOnClickListener {
             ingredients?.get(position)?.let {
                onItemClick?.invoke(it)
            }
         }
    }

}
