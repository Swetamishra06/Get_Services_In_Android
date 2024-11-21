package com.example.getservicesinandroid

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var startbtn : Button
    lateinit var stopbtn : Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        startbtn = findViewById(R.id.start)
        stopbtn = findViewById(R.id.stop)


        startbtn.setOnClickListener {

            startService(Intent(this@MainActivity,Music_Service::class.java))
                //you need to give service class

        }
        stopbtn.setOnClickListener {
            stopService(Intent(this@MainActivity,Music_Service::class.java))
        }

    }
}