package com.tushar.parkingbill

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tushar.parkingbill.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
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
    }

}