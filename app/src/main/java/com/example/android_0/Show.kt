package com.example.android_0

import _Action.CustomAdapter
import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import android.widget.Toast


class Show : AppCompatActivity() {

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_show)

        val gridView = findViewById<GridView>(R.id._GridView) as GridView
        var arguments = intent.extras
        var name: Array<String> = arguments?.get("name") as Array<String>
        val customAdapter = CustomAdapter(this@Show, name)
        gridView.adapter = customAdapter
    }
}
