package com.example.mad_24012011028_practical_3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.provider.AlarmClock
import android.provider.CallLog
import android.provider.MediaStore
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.net.toUri
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ImplicitIntent()
        ExplicitIntent()
    }
    fun ImplicitIntent() {

        // Browse Website
        findViewById<Button>(R.id.btnBrowse).setOnClickListener {
            val url = findViewById<EditText>(R.id.etUrl).text.toString()

            Intent(Intent.ACTION_VIEW, Uri.parse(url)).also {
                startActivity(it)
            }
        }

        // Phone Call
        findViewById<Button>(R.id.btnCall).setOnClickListener {
            val number = findViewById<EditText>(R.id.etPhone).text.toString()

            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = "tel:$number".toUri()
            startActivity(intent)
        }

        // Call Log
        findViewById<Button>(R.id.btnCallLog).setOnClickListener {
            val intent = Intent(
                Intent.ACTION_VIEW,
                CallLog.Calls.CONTENT_URI
            )
            startActivity(intent)
        }

        // Gallery
        findViewById<Button>(R.id.btnGallery).setOnClickListener {
            val intent = Intent(
                Intent.ACTION_PICK,
                MediaStore.Images.Media.EXTERNAL_CONTENT_URI
            )
            startActivity(intent)
        }

        // Camera
        findViewById<Button>(R.id.btnCamera).setOnClickListener {
            val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivity(intent)
        }

        // Alarm
        findViewById<Button>(R.id.btnAlarm).setOnClickListener {
            val intent = Intent(AlarmClock.ACTION_SET_ALARM)
            intent.putExtra(AlarmClock.EXTRA_MESSAGE, "My Alarm")
            startActivity(intent)
        }
    }
    fun ExplicitIntent() {

        findViewById<Button>(R.id.btnLogin).setOnClickListener {

            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}