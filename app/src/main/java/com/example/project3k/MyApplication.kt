package com.example.project3k

import android.app.Application
import android.util.Log

// this class is the first class to run when the program is started
class MyApplication : Application() {

    private val TAG: String = MyApplication::class.java.simpleName.toString()

    override fun onCreate() {
        super.onCreate()
        Log.d(TAG, "onCreate: ")
    }
}

