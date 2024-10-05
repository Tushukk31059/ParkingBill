package com.tushar.parkingbill

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
@Dao
interface CarDao {
    @Insert
    fun insert(carDataClass: CarDataClass)

    @Query("SELECT * FROM CarDataClass")
    fun getAllVehicles(): List<CarDataClass>
    @Insert
    fun insertAllVehicles(vehicle: List<CarDataClass>)
}