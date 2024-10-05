package com.tushar.parkingbill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tushar.parkingbill.databinding.ActivityCarRecyclerViewBinding
import com.tushar.parkingbill.databinding.ActivityGuardRecyclerViewBinding

class GuardRecyclerView : AppCompatActivity() {
    lateinit var binding: ActivityGuardRecyclerViewBinding
    lateinit var guardRecyclerAdapter: GuardRecyclerAdapter
    lateinit var carDb: CarDb
    var array= arrayListOf<CarDataClass.GuardDataClass>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGuardRecyclerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        guardRecyclerAdapter=GuardRecyclerAdapter()
    }
}