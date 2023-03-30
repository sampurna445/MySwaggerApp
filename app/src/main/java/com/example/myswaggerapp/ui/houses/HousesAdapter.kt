package com.example.myswaggerapp.ui.houses

import android.view.LayoutInflater
import com.example.myswaggerapp.data.model.housesModel.HousesModelItemModel
import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.example.myswaggerapp.R
import com.example.myswaggerapp.databinding.ItemHousesBinding

class HousesAdapter(val houses: ArrayList<HousesModelItemModel>) :
    RecyclerView.Adapter<HousesAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val binding = ItemHousesBinding.bind(view)

        fun handleData(item: HousesModelItemModel?) {

            binding.houseName.text = item?.name
            binding.houseAnimal.text = item?.animal
            binding.houseColor.text = item?.houseColours

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_houses, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int = houses?.size ?: 0

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.handleData(houses?.get(position))
         //holder.itemView.setOnClickListener {
        //     houses?.get(position)?.let {
        //        onItemClick?.invoke(it)
        //    }
        // }
    }

}
