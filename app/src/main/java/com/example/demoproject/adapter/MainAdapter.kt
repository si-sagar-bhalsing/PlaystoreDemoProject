package com.example.demoproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.demoproject.R
import com.example.demoproject.databinding.VerticalItemBinding
import com.example.demoproject.model.MainModel

class MainAdapter(private val collection : List<MainModel>) : RecyclerView.Adapter<MainAdapter.CollectionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CollectionViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.vertical_item,parent,false)
        return CollectionViewHolder(view)
    }

    override fun onBindViewHolder(holder: CollectionViewHolder, position: Int) {
        holder.binding.apply {
            val collection = collection[position]
            gameType.text =collection.title
            val gameAdapter = GameAdapter(collection.gameModels)
            verticalRv.adapter = gameAdapter
        }
    }

    override fun getItemCount() =collection.size

    class CollectionViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val binding = VerticalItemBinding.bind(itemView)
    }


}