package com.example.wetherrr

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.wetherrr.fragments.MainFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportFragmentManager.beginTransaction().replace(R.id.palceHolder, MainFragment.newInstance()).commit()
    }
}