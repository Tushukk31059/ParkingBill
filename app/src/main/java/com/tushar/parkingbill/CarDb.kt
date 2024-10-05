package com.tushar.parkingbill

import android.content.Context
import android.os.AsyncTask
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(entities = [CarDataClass::class], version = 1)
abstract class CarDb : RoomDatabase() {
    abstract fun carDao(): CarDao

    companion object {
        private var carDb:CarDb?=null
        fun createDatabase(context: Context):CarDb {
           if (carDb==null){
               carDb=Room.databaseBuilder(context,CarDb::class.java,context.resources.getString(R.string.app_name))
                   .fallbackToDestructiveMigration()
                   .addCallback(object :Callback(){
                       override fun onCreate(db: SupportSQLiteDatabase) {
                           super.onCreate(db)
                       }
               }).build()
           }
return carDb!!

        }
    }
}