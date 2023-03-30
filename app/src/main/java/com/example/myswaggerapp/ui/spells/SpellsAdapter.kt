package com.example.myswaggerapp.ui.spells

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myswaggerapp.R
import com.example.myswaggerapp.data.model.ingredientsModel.IngredientsModelItemModel
import com.example.myswaggerapp.data.model.spells.SpellsModelItemModel
import com.example.myswaggerapp.databinding.ItemSpellsBinding

class SpellsAdapter(val spells: ArrayList<SpellsModelItemModel>) :
    RecyclerView.Adapter<SpellsAdapter.ViewHolder>() {

    var onItemClick: ((SpellsModelItemModel) -> Unit)? = null


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemSpellsBinding.bind(view)

        fun handleData(item: SpellsModelItemModel?) {
            binding.spellName.text = item?.name
            binding.spellId.text = item?.id
            binding.spellType.text = item?.type

        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): SpellsAdapter.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_spells, parent, false)

        return SpellsAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int = spells?.size ?: 0
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.handleData(spells?.get(position))
        holder.itemView.setOnClickListener {
            spells?.get(position)?.let {
                onItemClick?.invoke(it)
            }
        }
    }

}
