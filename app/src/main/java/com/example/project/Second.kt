package com.example.project

import MusicService
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Second : AppCompatActivity() {
    private var counter = 0
    private var counter1 = 0
    private var counter2 = 0
    private var counter3= 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.second_activity)
        startService(Intent(this, MusicService::class.java))
        val counterTextView = findViewById<TextView>(R.id.counterTextView)
        val plusButton = findViewById<Button>(R.id.plusButton)
        val minusButton = findViewById<Button>(R.id.minusButton)

        plusButton.setOnClickListener {
            counter++
            counterTextView.text = counter.toString()
        }

        minusButton.setOnClickListener {
            if (counter > 0) {
                counter--
                counterTextView.text = counter.toString()
            }
        }










    }
}
