package com.example.only

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main6.*

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)
        button19 .setOnClickListener {
            val intent = Intent(this,MainActivity6::class.java)
            intent.putExtra(n,"ผิดดดดด!!")
            startActivity(intent)
        }
        button20 .setOnClickListener {
            val intent = Intent(this,MainActivity6::class.java)
            intent.putExtra(n,"ผิดดดดด!!")
            startActivity(intent)
        }
        button21 .setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra(n,"ถูกหมดทุกข้อจ้าาาา!!")
            startActivity(intent)
        }
        button22 .setOnClickListener {
            val intent = Intent(this,MainActivity6::class.java)
            intent.putExtra(n,"ผิดดดดด!!")
            startActivity(intent)
        }
    }
}