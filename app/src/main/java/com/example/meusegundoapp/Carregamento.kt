package com.example.meusegundoapp

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class Carregamento : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carregamento)

    }
    fun CarregarImagem(view:View){
        var imagemCarregada = findViewById<ImageView>(R.id.imagemCarregada)
        Glide.with(this).load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQzZk8UDlzG3EZdIkYxz7XS53vvQqJNdU7cYQ&s").into(imagemCarregada)
    }
}