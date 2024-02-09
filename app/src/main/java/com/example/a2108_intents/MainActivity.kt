package com.example.a2108_intents

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnExplicit = findViewById<Button>(R.id.button1)
        btnExplicit.setOnClickListener {
            val intent = Intent(this, SecondScreen::class.java)
            startActivity(intent)
        }


        val btnImplicit = findViewById<Button>(R.id.button2)
        btnImplicit.setOnClickListener {
            val webAddress = Intent(Intent.ACTION_VIEW)
            webAddress.data = Uri.parse("https://github.com/yelnar0112")
            startActivity(webAddress)
        }

        val btnExplicit2 = findViewById<Button>(R.id.button3)
        btnExplicit2.setOnClickListener {
            val startCamera = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(startCamera)
        }
    }
}