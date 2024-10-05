package com.tushar.parkingbill

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tushar.parkingbill.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var array = arrayListOf<CarDataClass>()
    lateinit var carRecyclerAdapter: CarRecyclerAdapter
    lateinit var carDb: CarDb

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGuard.setOnClickListener{
            var intent=Intent(this,GuardRegistrationActivity::class.java)
            startActivity(intent)
        }
        binding.btnCar.setOnClickListener{
            var intent=Intent(this,CarRegistrationActivity::class.java)
            startActivity(intent)

        }
        binding.btnShowCar.setOnClickListener {
            var intent=Intent(this,CarRecyclerView::class.java)
            startActivity(intent)
        }
    }
    private fun getCarsData() {
        array.clear()
        class getCars : AsyncTask<Void, Void, Void>() {
            override fun doInBackground(vararg params: Void?):Void?{
                array.addAll(carDb.carDao().getAllVehicles())
                return null }
            override fun onPostExecute(result: Void?) {
                super.onPostExecute(result)
                carRecyclerAdapter.notifyDataSetChanged()
            }
        }
        getCars().execute()
    }
}