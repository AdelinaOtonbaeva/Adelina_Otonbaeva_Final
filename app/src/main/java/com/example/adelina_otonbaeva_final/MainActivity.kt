package com.example.adelina_otonbaeva_final

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val constraintLayout =
            findViewById<ConstraintLayout>(R.id.constraintLayout9)
        constraintLayout.setOnClickListener{
            startActivity(Intent(this,SecondActivity::class.java))
        }
    }
}