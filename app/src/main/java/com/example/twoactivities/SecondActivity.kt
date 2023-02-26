package com.example.twoactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        val message = intent.getStringExtra("SEND_KEY_VALUE")
        val textView:TextView = findViewById(R.id.text_message)
        textView.text=message
        val mMessageEditText: EditText = findViewById(R.id.editText_reply)
        val buttonReply: Button = findViewById(R.id.button_reply)
        buttonReply.setOnClickListener {
            val mainActivityIntent = Intent(this, MainActivity::class.java)
            val message = mMessageEditText.text.toString().trim()
            mainActivityIntent.putExtra("REPLY_KEY_VALUE",message)
            startActivity(mainActivityIntent)
        }
    }
}