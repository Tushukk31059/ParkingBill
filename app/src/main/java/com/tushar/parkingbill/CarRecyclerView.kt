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
        array.add(CarDataClass(vehicle_num="1234", vehicle_name="Toyota", owner_name="John", owner_contact="9876543210", park_in_time="10:00 AM"))
        array.add(CarDataClass(vehicle_num="5678", vehicle_name="Honda", owner_name="Mike", owner_contact="8765432109", park_in_time="11:00 AM"))

        class GetCars : AsyncTask<Void, Void, Void>() {
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
        GetCars().execute()
    }
}