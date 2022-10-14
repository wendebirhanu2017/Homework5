package com.example.homework5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import kotlinx.android.synthetic.main.activity_problem2.*


class Problem2 : AppCompatActivity() {
    var imgs = intArrayOf(
        R.drawable.coffee_pot,
        R.drawable.espresso,
        R.drawable.french_fries,
        R.drawable.honey,
        R.drawable.strawberry_ice_cream,
        R.drawable.sugar_cubes
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_problem2)

        var name = resources.getStringArray(R.array.name)
        var recipe = resources.getStringArray(R.array.recipe)

        rView.layoutManager = GridLayoutManager(this, 2)
        val adapter =MyAdapter(this, name, imgs, recipe)
        rView.adapter= adapter

    }

}