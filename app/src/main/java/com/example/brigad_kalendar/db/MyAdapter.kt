package com.example.brigad_kalendar.db

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.brigad_kalendar.R

class MyAdapter(listMain: ArrayList<String>) : RecyclerView.Adapter<MyAdapter.MyHolder>() {

    var listArray = listMain

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val txData: TextView = itemView.findViewById(R.id.txData)
        fun setData(data: String) {
            txData.text = data
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val inflater = LayoutInflater.from(parent.context)
        return MyHolder(inflater.inflate(R.layout.rc_list_layout, parent, false))
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.setData(listArray.get(position))
    }

    override fun getItemCount(): Int {
        return listArray.size
    }

    fun updateAdapter(listItems: List<String>) {
        listArray.clear()
        listArray.addAll(listItems)
        notifyDataSetChanged()
    }
}