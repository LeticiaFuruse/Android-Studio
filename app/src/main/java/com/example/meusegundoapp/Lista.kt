package com.example.meusegundoapp

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Lista : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_lista)

        //variavel que triplica um componente
        val arrayAdapter:ArrayAdapter<*>
        //variavel que receve uma funcao que popula um array
        val cantores = arrayOf("Tão carreio," ,
                                "Leandro e o Leonardo",
                                "zeze di camargo e lucieno",
                                "icaro e gilmar")
        //conexao do front com o back
        var lista = findViewById<ListView>(R.id.lista) // <-- id do botao listview em activity list

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,cantores)

        lista.adapter = arrayAdapter
    }
}