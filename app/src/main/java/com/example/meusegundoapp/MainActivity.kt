package com.example.meusegundoapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)


        //botao da tela da calculadora: variavel
        val botaoCalculadora: Button = findViewById(R.id.TelaCalculadora)
        botaoCalculadora.setOnClickListener {
            var intent = Intent(this, Calculator::class.java)
            startActivity(intent)
        }
        //botao da tela de login
        val botaoTelaLogin: Button = findViewById(R.id.TelaDeLogin)
        botaoTelaLogin.setOnClickListener {
            var intent = Intent(this, ExercicioTelaLogin::class.java)
            startActivity(intent)
        }
        // botao da tela de enviar dados
        val botaoEnvioDados: Button = findViewById(R.id.TelaEnvioDados)
        botaoEnvioDados.setOnClickListener {
            var intent = Intent(this,EnvioDados::class.java)
            startActivity(intent)
        }

        // botao da tela de enviar dados
        val botaoCLone: Button = findViewById(R.id.TelaClone)
        botaoCLone.setOnClickListener {
            var intent = Intent(this,Clone::class.java)
            startActivity(intent)
        }


//        // BOTAO
//        val VARIAVEL-GENERICA: Button = findViewById(R.id.ID-DO-FRONT)
//        VARIAVEL-GENERICA.setOnClickListener {
//            var intent = Intent(this,NOME-DA-ACTIVITY::class.java)
//            startActivity(intent)
//        }
    }
    fun Lista(view: View){
        var intent = Intent(this,Lista::class.java)
        startActivity(intent)
    }

    fun ListaFixa(view: View){
        var intent = Intent(this,ListaFixa::class.java)
        startActivity(intent)
    }

    fun Carregamento(view: View){
        var intent = Intent(this,Carregamento()::class.java)
        startActivity(intent)
    }
    fun btnAppMusic(view: View){
        var intent = Intent(this,MenuSpotfy()::class.java)
        startActivity(intent)
    }


}