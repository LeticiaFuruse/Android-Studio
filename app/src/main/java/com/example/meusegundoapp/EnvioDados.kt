package com.example.meusegundoapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EnvioDados : AppCompatActivity() {
    lateinit var recepcao: EditText
    //cria uma variavel vazia do tipo caixa texto


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_envio_dados)

        //toast para receber resultado
        //variavel do tipo botao que recebe a função FVBI que por parametro aponta para o id do botao
        val botaoEnviar: Button = findViewById(R.id.botaoEnviar)
        botaoEnviar.setOnClickListener{

            //variavel existente, que recebe a função FVBI que por parametro aponta o id da caixa de texto
            recepcao = findViewById(R.id.caixaTexto)


            //contexto, nome da tela, java
            val intent = Intent(this, RecepcaoDados::class.java)

            intent.putExtra("Retorno",recepcao.text.toString())

            //starta a variavel intent
            startActivity(intent)
        }
    }
}