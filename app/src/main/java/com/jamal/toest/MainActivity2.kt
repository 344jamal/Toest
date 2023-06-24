package com.jamal.toest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
      val message = intent.getStringExtra("user_message")
        val textView = findViewById<TextView>(R.id.txtusermsg).apply {
            text = message
        }
        Toast.makeText(this, message,Toast.LENGTH_SHORT).show()

    }
}