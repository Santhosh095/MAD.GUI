package com.example.gui

import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        supportActionBar?.hide()

        val tvTxt: TextView = findViewById(R.id.tvTxt)
        val btFontSize: Button = findViewById(R.id.btFontSize)
        val btFontColor:Button = findViewById(R.id.btFontColor)
        val btBgColor:Button = findViewById(R.id.btBgColor)
        val linearLayout: LinearLayout = findViewById(R.id.linearLayout)
        var fontSize = 5f
        var fontColor = 0
        var backGroundColor = 0
        btFontSize.setOnClickListener {
            tvTxt.textSize = fontSize
            fontSize=(fontSize+5)%30
        }
        btFontColor.setOnClickListener {
            when(fontColor%5){
                0-> tvTxt.setTextColor( Color.RED)
                1-> tvTxt.setTextColor( Color.GREEN)
                2-> tvTxt.setTextColor( Color.BLUE)
                3-> tvTxt.setTextColor( Color.WHITE)
                4-> tvTxt.setTextColor( Color.BLACK)
            }
            fontColor++
        }
        btBgColor.setOnClickListener {
            when(backGroundColor%5){
                0-> linearLayout.setBackgroundColor( Color.RED)
                1-> linearLayout.setBackgroundColor( Color.GREEN)
                2-> linearLayout.setBackgroundColor( Color.BLUE)
                3-> linearLayout.setBackgroundColor( Color.WHITE)
                4-> linearLayout.setBackgroundColor( Color.BLACK)
            }
            backGroundColor++
        }

    }
}