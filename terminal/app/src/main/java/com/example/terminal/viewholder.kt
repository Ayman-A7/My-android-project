package com.example.terminal


import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.terminal.databinding.ActivityMainBinding

class myViewHolder(itemView: View, listener:newAdapter.onItemClickListener): RecyclerView.ViewHolder(itemView) {

    var name = itemView.findViewById<TextView>(R.id.title)
    var phone = itemView.findViewById<TextView>(R.id.quantity)
    var btn = itemView.findViewById<Button>(R.id.buyButton)

    init {
        btn.setOnClickListener(){
            listener.onItemClick(adapterPosition)
        }
    }
}
