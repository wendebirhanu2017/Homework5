package com.example.homework5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        problem1Btn.setOnClickListener {
            val intent = Intent(this,Problem1::class.java)
            startActivity(intent)
        }
        problem2Btn.setOnClickListener {
            val intent = Intent(this,Problem2::class.java)
            startActivity(intent)
        }
    }
}