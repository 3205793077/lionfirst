package com.example.lionfirst

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val message = TextView(this).apply {
            text = "Hello, LionFirst!\n\n我的第一个 Android App"
            textSize = 24f
            setTextColor(Color.rgb(35, 45, 65))
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
        }
        setContentView(message)
    }
}
