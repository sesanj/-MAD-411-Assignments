package com.zybooks.assignment6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val enteredName: EditText = findViewById(R.id.enteredName)
        val output: TextView = findViewById(R.id.output_name)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener{
            output.text = "Hello, ${enteredName.text}!"
        }
    }
}