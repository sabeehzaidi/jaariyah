package com.sabeeh.jaariyah.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sabeeh.jaariyah.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainer, HomeFragment())
                .commit()
        }
    }
}