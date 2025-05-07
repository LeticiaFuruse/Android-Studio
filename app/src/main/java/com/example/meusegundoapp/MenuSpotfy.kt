package com.example.meusegundoapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MenuSpotfy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_spotfy)

    }

    fun btnPlayMusic(view: View){
        var intent = Intent(this,play_spotfy()::class.java)
        startActivity(intent)
    }
}