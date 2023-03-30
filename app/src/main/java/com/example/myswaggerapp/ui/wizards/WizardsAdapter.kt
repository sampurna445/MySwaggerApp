package com.example.myswaggerapp.ui.wizards

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myswaggerapp.R
import com.example.myswaggerapp.data.model.ingredientsModel.IngredientsModelItemModel
import com.example.myswaggerapp.data.model.wizards.WizardsModelItemModel

import com.example.myswaggerapp.databinding.ItemWizardsBinding


class WizardsAdapter(val wizards: ArrayList<WizardsModelItemModel>) :
    RecyclerView.Adapter<WizardsAdapter.ViewHolder>() {


    var onItemClick:  ((WizardsModelItemModel) -> Unit)? = null

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemWizardsBinding.bind(view)

        fun handleData(item: WizardsModelItemModel?) {
            binding.wizardFname.text = item?.firstName
            binding.wizardLname.text = item?.lastName

            binding.wizardId.text = item?.id
        }

    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): WizardsAdapter.ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_wizards, parent, false)

        return WizardsAdapter.ViewHolder(view)
    }

    override fun getItemCount(): Int = wizards?.size ?: 0

    override fun onBindViewHolder(holder: WizardsAdapter.ViewHolder, position: Int) {
        holder.handleData(wizards?.get(position))
        holder.itemView.setOnClickListener {
            wizards?.get(position)?.let {
                onItemClick?.invoke(it)
            }
        }
    }


}
