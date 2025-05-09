package com.example.meusegundoapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class lista_spotfy : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lista_spotfy)

        //variavel que triplica um componente
        val arrayAdapter:ArrayAdapter<*>

        //variavel que receve uma funcao que popula um array
        val cantores = arrayOf("teste1," ,
            "teste2 e o Leonardo",
            "teste3 di camargo e lucieno",
            "teste4 e gilmar")
        //conexao do front com o back
        var lista_spotfy = findViewById<ListView>(R.id.lista_spotfy) // <-- id do botao listview em activity list

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,cantores)

        lista_spotfy.adapter = arrayAdapter

    }
}