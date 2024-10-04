package com.tushar.parkingbill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tushar.parkingbill.databinding.ActivityCarRegistrationBinding

class CarRegistrationActivity : AppCompatActivity() {
    lateinit var binding: ActivityCarRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCarRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSubmitCar.setOnClickListener {

        }
    }
}