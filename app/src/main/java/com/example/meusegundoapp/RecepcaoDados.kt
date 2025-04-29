package com.example.meusegundoapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RecepcaoDados : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recepcao_dados)

        //variavel que guarda o GET do que ja foi gravado que no parametro espera
        // UMA STRING DE LIGAÇÂO
        val resultado = intent.getStringExtra("Retorno")

        //um toast convencional - espera 3 parametro: contexto, string, e uma duração
        Toast.makeText(this, "Dado: $resultado ", Toast.LENGTH_LONG).show()



    }
}