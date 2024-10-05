package com.tushar.parkingbill

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class CarDataClass (
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo
    var vehicle_num: String?="",
    @ColumnInfo
    var vehicle_name: String?="",
    @ColumnInfo
    var owner_name: String?="",
    @ColumnInfo
    var owner_contact: String?="",
    @ColumnInfo
    var park_in_time: String?=""
)
{
    companion object {
        fun addCars(): List<CarDataClass> {
            return mutableListOf(
               CarDataClass(
                   vehicle_num ="2026",
                   vehicle_name ="honda",
                   owner_name = "Deepak",
                   owner_contact = "7575647575",
                   park_in_time = "2:34 pm"
               ))}}

@Entity
data class GuardDataClass(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo
    var guard_name: String?="",
    @ColumnInfo
    var guard_mail: String?="",
    @ColumnInfo
    var guard_contact: String?="",

) {
    companion object {
        fun addGuards(): List<GuardDataClass> {
            return mutableListOf(
                GuardDataClass(
                    guard_name = "Arpit",
                    guard_contact = "8364738394",
                    guard_mail = "123@mail.com"

                )
            )
        }
    }
}
}