package com.example.meusegundoapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.bumptech.glide.Glide

class Carregamento : AppCompatActivity() {
    lateinit var txtURL: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carregamento)

    }
    fun CarregarImagem(view:View){
        txtURL = findViewById(R.id.txtURL)
        var url = txtURL.text.toString()
        var imgDinamica = findViewById<ImageView>(R.id.imgDinamica)
        Glide.with(this).load(url).into(imgDinamica)
    }
}