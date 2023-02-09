package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.project1.R

class pro1 : AppCompatActivity() {
    lateinit var agree:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pro1)
        agree=findViewById(R.id.btnext)
        agree.setOnClickListener {
            startActivity(Intent(this,pro2::class.java))
        }
    }
}