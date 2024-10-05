package com.tushar.parkingbill

import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.tushar.parkingbill.databinding.ActivityCarRegistrationBinding

class CarRegistrationActivity : AppCompatActivity() {

    lateinit var binding: ActivityCarRegistrationBinding
lateinit var carDb: CarDb

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCarRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnSubmitCar.setOnClickListener {
            val vehicleNum = binding.etVehicleNum.text.toString()
            val vehicleName = binding.etVehicleName.text.toString()
            val owner = binding.etOwner.text.toString()
            val ownerContact = binding.etOwnerContact.text.toString()
            val parkInTime = binding.etParkInTime.text.toString()
            if (vehicleNum.isEmpty() || vehicleName.isEmpty() || owner.isEmpty() || ownerContact.isEmpty() || parkInTime.isEmpty()) {
                Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show()
            }
            else {
                var vehicleNum=binding.etVehicleNum.text.toString()
                var vehicleName=binding.etVehicleName.text.toString()
                var owner=binding.etOwner.text.toString()
                var ownerContact=binding.etOwnerContact.text.toString()
                var parkInTime=binding.etParkInTime.text.toString()

                class insertVehicle: AsyncTask<Void, Void, Void>() {
                    override fun doInBackground(vararg params: Void?): Void? {
                        var carDataClass=CarDataClass(
                            vehicle_num=vehicleNum,
                            vehicle_name = vehicleName,
                            owner_name = owner,
                            owner_contact = ownerContact,
                        park_in_time = parkInTime
                        )
                        carDb.carDao().insert(carDataClass)
                        Log.d("CarRegistration", "Inserted car: $vehicleNum")

                        return null
                    }
                }

                binding.etVehicleNum.text.clear()
                binding.etVehicleName.text.clear()
                binding.etOwner.text.clear()
                binding.etOwnerContact.text.clear()
                binding.etParkInTime.text.clear()

                Toast.makeText(this, "Submitted Successfully", Toast.LENGTH_SHORT).show()

            }

        }


            }
    }
