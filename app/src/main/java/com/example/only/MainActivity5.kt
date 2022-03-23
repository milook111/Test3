package com.example.only

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main5.*

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        button15.setOnClickListener {
            val intent = Intent(this,MainActivity5::class.java)
            intent.putExtra(n,"ผิดดดดด!!")
            startActivity(intent)
        }
        button16 .setOnClickListener {
            val intent = Intent(this,MainActivity5::class.java)
            intent.putExtra(n,"ผิดดดดด!!")
            startActivity(intent)
        }
        button17 .setOnClickListener {
            val intent = Intent(this,MainActivity6::class.java)
            intent.putExtra(n,"ถูกจ้าาา!!")
            startActivity(intent)
        }
        button18 .setOnClickListener {
            val intent = Intent(this,MainActivity5::class.java)
            intent.putExtra(n,"ผิดดดดด!!")
            startActivity(intent)
        }
    }
}