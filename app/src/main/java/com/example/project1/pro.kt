package com.example.project1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project1.R

class pro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        android.os.Handler().postDelayed({display()},3000)
    }
    private fun display(){
        startActivity(Intent(this,pro1::class.java))
        finish()
    }
}