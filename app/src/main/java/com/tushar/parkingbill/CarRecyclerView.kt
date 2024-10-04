package com.tushar.parkingbill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tushar.parkingbill.databinding.ActivityCarRecyclerViewBinding

class CarRecyclerView : AppCompatActivity() {
    lateinit var binding: ActivityCarRecyclerViewBinding
    lateinit var adapter:CarRecyclerAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCarRecyclerViewBinding.inflate(layoutInflater)

        setContentView(binding.root)
        adapter=CarRecyclerAdapter()

    }
}