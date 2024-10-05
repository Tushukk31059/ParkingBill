package com.tushar.parkingbill

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.LinearLayoutManager
import com.tushar.parkingbill.databinding.ActivityCarRecyclerViewBinding

class CarRecyclerView : AppCompatActivity() {
    lateinit var binding: ActivityCarRecyclerViewBinding
    lateinit var carRecyclerAdapter: CarRecyclerAdapter
    lateinit var carDb: CarDb
    var array = arrayListOf<CarDataClass>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCarRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        carRecyclerAdapter= CarRecyclerAdapter(array)
        carDb= CarDb.createDatabase(this)
        binding.carRecycler.layoutManager=LinearLayoutManager(this)
        binding.carRecycler.adapter=carRecyclerAdapter
        getCarsData()
    }

    private fun getCarsData() {
        array.clear()
        class getCars : AsyncTask<Void, Void, Void>() {
            override fun doInBackground(vararg params: Void?):Void?{
                array.addAll(carDb.carDao().getAllVehicles())
                val cars = carDb.carDao().getAllVehicles()
                for (car in cars) {
                    Log.d("CarRecyclerView", "Car: ${car.vehicle_num}, ${car.vehicle_name}")
                }

                return null
            }
            override fun onPostExecute(result: Void?) {
super.onPostExecute(result)
                carRecyclerAdapter.notifyDataSetChanged()
            }
        }
        getCars().execute()
    }
}