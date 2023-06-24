package com.jamal.toest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val button = findViewById<Button>(R.id.btnShowToast)
        button.setOnClickListener {
            Log.i("MainActivity", "Button was clicked!")
            Toast.makeText(this, "Button was clicked!", Toast.LENGTH_SHORT).show()
        }

        val sendmsgbutton = findViewById<Button>(R.id.sendmsgbtn)
        sendmsgbutton.setOnClickListener {
            callActivity()
        }
        }

    private fun callActivity() {
        val editText = findViewById<EditText>(R.id.usermsg)
        val message = editText.text.toString()

        val intent = Intent(this, MainActivity2::class.java).also {
            it.putExtra("user_message",message)
            startActivity(it)
        }
    }


}



