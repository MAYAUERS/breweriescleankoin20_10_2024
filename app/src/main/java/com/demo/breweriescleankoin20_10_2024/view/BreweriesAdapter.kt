package com.demo.breweriescleankoin20_10_2024.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.demo.breweriescleankoin20_10_2024.R
import com.demo.breweriescleankoin20_10_2024.domain.model.Breweries

class BreweriesAdapter(private var breweries:ArrayList<Breweries>):RecyclerView.Adapter<BreweriesAdapter.MyViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int,
    ): BreweriesAdapter.MyViewHolder {
       val view  = LayoutInflater.from(parent.context).inflate(R.layout.breweries_list,parent,false)
        return MyViewHolder(view)
    }

    class MyViewHolder(view:View):RecyclerView.ViewHolder(view) {
        var name = view.findViewById<TextView>(R.id.text_name)
        var type = view.findViewById<TextView>(R.id.text_type)

        fun bindViews(breweries: Breweries){
            name.text = breweries.name
            type.text = breweries.brewery_type
        }
    }

    override fun onBindViewHolder(holder: BreweriesAdapter.MyViewHolder, position: Int) {
        holder.bindViews(breweries[position])
    }

    override fun getItemCount(): Int {
        return breweries.size
    }
}