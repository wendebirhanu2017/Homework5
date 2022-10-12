package com.example.homework5

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_problem1.*
import java.time.LocalDate

class Problem1 : AppCompatActivity() {
    var percentage = 0.0
    var counter = 0
    var flag = false
    @RequiresApi(Build.VERSION_CODES.O)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problem1)

        radioButton.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                if(!flag){
                    percentage += 50.0
                    flag = true
                }
            }

        }
        radioButton2.setOnCheckedChangeListener { compoundButton, b ->
            if (b){
                if(flag){
                    percentage -= 50.0
                    flag = false
                }
            }

        }
        radioButton3.setOnCheckedChangeListener { compoundButton, b ->
            if (b)
                if(flag){
                    percentage -= 50.0
                    flag = false
                }
        }

        checkBox.setOnCheckedChangeListener { compoundButton, isChecked ->
            if (isChecked && counter >= 2) {
                checkBox.isChecked = false
                Toast.makeText(applicationContext, "Yoh can chose only two", Toast.LENGTH_LONG)
                    .show()
            } else {
                if (isChecked) {
                    percentage += 25
                    counter++
                } else {
                    percentage -= 25
                    counter--
                }
            }

        }

        checkBox2.setOnCheckedChangeListener { compoundButton, isChecked ->
            if (isChecked && counter >= 2) {
                checkBox2.isChecked = false
                Toast.makeText(applicationContext, "You can chose only two", Toast.LENGTH_LONG)
                    .show()
            } else {
                if (isChecked) {
                    percentage += 25
                    counter++
                } else {
                    percentage -= 25
                    counter--
                }
            }
        }

            checkBox3.setOnCheckedChangeListener { compoundButton, isChecked ->

                if (isChecked && counter >= 2) {
                    checkBox3.isChecked = false
                    Toast.makeText(applicationContext, "You can chose only two", Toast.LENGTH_LONG)
                        .show()
                } else {
                    if (isChecked) {
                        Toast.makeText(applicationContext, "else if $counter", Toast.LENGTH_LONG)
                        counter++
                    } else {
                        Toast.makeText(applicationContext, "else else $counter", Toast.LENGTH_LONG)
                        counter--
                    }
                }
            }

            submitBtn.setOnClickListener {
                Toast.makeText(
                    applicationContext,
                    "Congratulations! You submitted on ${LocalDate.now()}, You achieved $percentage",
                    Toast.LENGTH_LONG
                ).show()
                finish();
                startActivity(getIntent());
            }

            resetBtn.setOnClickListener {
                finish();
                startActivity(getIntent());
            }
        }
    }