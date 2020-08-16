package com.venu.mvvm_architecture_kotlin.ui.acitivities

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.venu.mvvm_architecture_kotlin.BR
import com.venu.mvvm_architecture_kotlin.R
import com.venu.mvvm_architecture_kotlin.data.room.entities.Versions
import com.venu.mvvm_architecture_kotlin.databinding.ItemBinding

open class RvAdapter() : RecyclerView.Adapter<ItemViewHolder>() {

    //private var items : List<Versions> = listOf()
    private var items: List<Versions?>? = null


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val dataBinding : ItemBinding = DataBindingUtil.inflate(layoutInflater,
            R.layout.item, parent, false)
       // dataBinding.click= Clicks()
        return ItemViewHolder(dataBinding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        items?.get(position)?.let { holder.bind(it) }
        holder.itemView.setOnClickListener {
         //   itemClick(position,items[position])
        }
    }

    override fun getItemCount() = items!!.size

     fun setItems(newItems: List<Versions?>?) {
         items=newItems
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