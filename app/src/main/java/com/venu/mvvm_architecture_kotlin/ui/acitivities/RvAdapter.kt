package com.venu.mvvm_architecture_kotlin.ui.acitivities

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.venu.mvvm_architecture_kotlin.BR
import com.venu.mvvm_architecture_kotlin.MainActivity
import com.venu.mvvm_architecture_kotlin.R
import com.venu.mvvm_architecture_kotlin.data.room.entities.Versions
import com.venu.mvvm_architecture_kotlin.databinding.ItemBinding

open class RvAdapter() : RecyclerView.Adapter<ItemViewHolder>() {

     var items: MutableList<Versions> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val dataBinding : ItemBinding = DataBindingUtil.inflate(layoutInflater,
            R.layout.item, parent, false)
       // dataBinding.click= Clicks()
        return ItemViewHolder(dataBinding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(items[position])
        holder.itemView.setOnClickListener {
         //   itemClick(position,items[position])
        }
    }

    override fun getItemCount() = items.size

     fun setItems(newItems: ArrayList<Versions>) {
        if(items.size>0)
        items.clear()
        items = newItems
        notifyDataSetChanged()
    }
}
class Clicks{
    fun onClick(name: String){
        Log.e("data",name)
    }
}
class ItemViewHolder(private val binding : ItemBinding) : RecyclerView.ViewHolder(binding.root) {

    fun bind(data:Versions) {
        binding.setVariable(BR.version, data)
        binding.executePendingBindings()
    }
}