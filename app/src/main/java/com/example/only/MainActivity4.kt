package com.example.only

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main4.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        button11 .setOnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            intent.putExtra(n,"ผิดจ้าาาาาาาาา!!")
            startActivity(intent)
        }
        button12 .setOnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            intent.putExtra(n,"ผิดดดดด!!")
            startActivity(intent)
        }
        button13 .setOnClickListener {
            val intent = Intent(this,MainActivity4::class.java)
            intent.putExtra(n,"ผิดดดดด!!")
            startActivity(intent)
        }
        button14 .setOnClickListener {
            val intent = Intent(this,MainActivity5::class.java)
            intent.putExtra(n,"ถูกจ้า!!")
            startActivity(intent)
        }
        }
    }
