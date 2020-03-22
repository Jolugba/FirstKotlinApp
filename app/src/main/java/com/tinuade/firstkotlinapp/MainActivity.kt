package com.tinuade.firstkotlinapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.bProceed)

        button.setOnClickListener{
            val intent=Intent(this,DetailsActivity::class.java)
            startActivity(intent)
        }
    }
}
