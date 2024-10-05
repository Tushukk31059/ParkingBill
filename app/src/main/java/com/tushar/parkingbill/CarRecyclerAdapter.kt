package com.tushar.parkingbill

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarRecyclerAdapter(
    private val items: MutableList<CarDataClass>
    ):
    RecyclerView.Adapter<CarRecyclerAdapter.ViewHolder>(){

    class ViewHolder(var view: View):RecyclerView.ViewHolder(view){
        val tvVehicleNum= view.findViewById<TextView>(R.id.tvVehicleNum)
        val tvVehicleName = view.findViewById<TextView>(R.id.tvVehicleName)
        val tvOwner= view.findViewById<TextView>(R.id.tvOwner)
        val tvOwnerContact= view.findViewById<TextView>(R.id.tvOwnerContact)
        val tvParkInTime= view.findViewById<TextView>(R.id.tvParkInTime)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.car_item_view, parent, false)
        return ViewHolder(view)

    }
    override fun getItemCount(): Int {
        return items.size
    }
    override fun onBindViewHolder(holder:ViewHolder, position: Int) {
        holder.tvVehicleNum.setText("${items[position].vehicle_num}")
        holder.tvVehicleName.setText("${items[position].vehicle_name}")
        holder.tvOwner.setText("${items[position].owner_name}")
        holder.tvOwnerContact.setText("${items[position].owner_contact}")
        holder.tvParkInTime.setText("${items[position].park_in_time}")
    }


    }
