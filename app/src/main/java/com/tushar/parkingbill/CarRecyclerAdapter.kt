package com.tushar.parkingbill

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class CarRecyclerAdapter():RecyclerView.Adapter<CarRecyclerAdapter.ViewHolder>() {
    class ViewHolder(var view: View):RecyclerView.ViewHolder(view){

    }
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CarRecyclerAdapter.ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: CarRecyclerAdapter.ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }
}