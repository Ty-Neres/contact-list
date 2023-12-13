package com.example.contact_list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(
    private val myList: List<String>
) : RecyclerView.Adapter<Adapter.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_contact,parent,false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount() = myList.size
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val nome = myList[position]
        val numero = myList[position]
        holder.textName.text = nome
        holder.textNumero.text = numero
    }
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textName : TextView = itemView.findViewById(R.id.textViewNomeContato)
        val textNumero : TextView = itemView.findViewById(R.id.textViewNumeroContato)
    }

}