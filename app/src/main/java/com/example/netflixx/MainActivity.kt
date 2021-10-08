package com.example.netflixx

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn:Button = findViewById(R.id.btn1)
        btn.setOnClickListener{
        val intent= Intent(this,RelativeLayout::class.java)
            startActivity(intent)

        }
        val btn1:Button = findViewById(R.id.btn2)
        btn1.setOnClickListener{
            val intent= Intent(this,LinearLayout::class.java)
            startActivity(intent)
        }
        val btn2:Button = findViewById(R.id.btn3)
        btn2.setOnClickListener{
            val intent= Intent(this,ConstraintLayout::class.java)
            startActivity(intent)
        }

    }

}