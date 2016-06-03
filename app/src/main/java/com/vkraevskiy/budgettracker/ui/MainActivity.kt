package com.vkraevskiy.budgettracker.ui

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.vkraevskiy.budgettracker.R
import com.vkraevskiy.budgettracker.core.BTApplication

class MainActivity : AppCompatActivity() {

    val application: BTApplication
        get() {
            return getApplication() as BTApplication
        }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
}
