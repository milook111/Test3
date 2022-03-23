package com.example.only

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main3.*

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        button5.setOnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            intent.putExtra(n,"ถูกจ้าาา!!")
            startActivity(intent)
        }
        button6 .setOnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            intent.putExtra(n,"ผิดดดดด!!")
            startActivity(intent)
        }
        button7 .setOnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            intent.putExtra(n,"ผิดดดดด!!")
            startActivity(intent)
        }
        button8 .setOnClickListener {
            val intent = Intent(this,MainActivity3::class.java)
            intent.putExtra(n,"ผิดดดดด!!")
            startActivity(intent)
        }
        }
    }
