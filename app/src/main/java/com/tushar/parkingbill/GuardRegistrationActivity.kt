package com.tushar.parkingbill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tushar.parkingbill.databinding.ActivityGuardRegistrationBinding

class GuardRegistrationActivity : AppCompatActivity() {
    lateinit var binding: ActivityGuardRegistrationBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGuardRegistrationBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnSubmitGuard.setOnClickListener {

        }
    }
}