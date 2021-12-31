package com.example.terminal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class newAdapter(val name: ArrayList<String>, val phone: ArrayList<Int>): RecyclerView.Adapter<myViewHolder>()
{
    private lateinit var listen:onItemClickListener

    interface onItemClickListener{
        fun onItemClick(position: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val inflator =  LayoutInflater.from(parent.context)
        var view = inflator.inflate(R.layout.sendsms,parent,false)
        return myViewHolder(view,listen)
    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {
        holder.name.text =  name[position]
        holder.phone.text = phone[position].toString()
    }

    override fun getItemCount(): Int {
        return name.size
    }

    fun setOnItemClickListener(listener:onItemClickListener){
        listen = listener
    }


}