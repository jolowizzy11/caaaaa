package com.example.mobileapps1

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val educationButton = findViewById<Button>(R.id.education_button)
        educationButton.setOnClickListener {
            val intent = Intent(this, BlankActivity::class.java)
            startActivity(intent)
        }

        val skillsButton = findViewById<Button>(R.id.skills_button)
        skillsButton.setOnClickListener {
            val intent = Intent(this, BlankActivity::class.java)
            startActivity(intent)
        }

        val achievementsButton = findViewById<Button>(R.id.achievements_button)
        achievementsButton.setOnClickListener {
            val intent = Intent(this, BlankActivity::class.java)
            startActivity(intent)
        }

        val exitButton = findViewById<Button>(R.id.exit_button)
        exitButton.setOnClickListener {
            finishAffinity()
        }
    }
}

class BlankActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.google.android.material.R.layout.abc_popup_menu_item_layout)
    }
}
