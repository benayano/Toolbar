package com.example.toolbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val thisId =findViewById<TextView>(R.id.this_Id)
        thisId.setOnClickListener {
            Toast.makeText(this,"kjjjjjjjjjjjjjjjjj",Toast.LENGTH_LONG).show()
        }
    }
}