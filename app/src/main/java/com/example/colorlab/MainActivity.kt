package com.example.colorlab

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rButton: Button = findViewById(R.id.red_button)
        val yButton: Button = findViewById(R.id.yellow_button)
        val gButton: Button = findViewById(R.id.green_button)
        val textView: TextView = findViewById(R.id.textView)
        val rLayout: ConstraintLayout = findViewById(R.id.root_layout)

        rButton.setOnClickListener{
            textView.text="RED"
            rLayout.setBackgroundColor(resources.getColor(R.color.redColor, null))
        }
        yButton.setOnClickListener{
            textView.text="YELLOW"
            rLayout.setBackgroundColor(resources.getColor(R.color.yellowColor, null))
        }
        gButton.setOnClickListener{
            textView.text="GREEN"
            rLayout.setBackgroundColor(resources.getColor(R.color.greenColor, null))
        }
    }
}