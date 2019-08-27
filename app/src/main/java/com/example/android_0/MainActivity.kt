package com.example.android_0

import _Action.Operation
import _URL.NetworkUnits
import _URL.Prob
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.GridView
import android.widget.TextView

class MainActivity : AppCompatActivity(){

    private val _Operation: Operation = Operation()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun _Show(view: View) {
        val _intent = Intent(this, Show::class.java)
/*        var _name: Array<Element> = emptyArray()
        var _Element: Element = Element("Cupcake", 3.0, 30.0, 300.0, "Gingerbread")
        _name += _Element
        _name += _Element
        _name += _Element
        _name += _Element
        _name += _Element*/
        // name += _name.size.toString()
        var name: Array<String> = emptyArray<String>()
        name = _Operation._Convert_String(_Operation.info_SQLite())
        _intent.putExtra("name", name)
        startActivity(_intent)
    }
    fun _Parse(view: View){
 /*       var prodd : Prob = Prob()
        val _intent = Intent(this, Show::class.java)
        var name: Array<String> = emptyArray<String>()
//        name = _Operation._Convert_String( prodd.getService())
        name = _Operation._Convert_String(_Operation.info_SQLite())
        _intent.putExtra("name", name)
        startActivity(_intent)*/
        var _URL:NetworkUnits = NetworkUnits()
        var Str:TextView = findViewById(R.id.textView2)
        Str.text = _URL.sendGet().toString()

    }
}




