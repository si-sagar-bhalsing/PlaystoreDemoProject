package com.example.demoproject.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.demoproject.R
import com.example.demoproject.databinding.HorizontalItemBinding
import com.example.demoproject.model.GameModel

class GameAdapter (private val gameModel: List<GameModel>) : RecyclerView.Adapter<GameAdapter.GameViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GameViewHolder {
        val view =LayoutInflater.from(parent.context).inflate(R.layout.horizontal_item,parent,false)
        return GameViewHolder(view)
    }

    override fun onBindViewHolder(holder: GameViewHolder, position: Int) {
        holder.binding.apply {
            imgGame.load(gameModel[position].imageUrl)
        }
    }

    override fun getItemCount() =gameModel.size


     class GameViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val binding = HorizontalItemBinding.bind(itemView)

    }

}