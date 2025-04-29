package com.example.meusegundoapp

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Clone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_clone)

        // busca pela toolbar tem que iniciar junto com a activity
        setSupportActionBar(findViewById(R.id.toolbar))
    }

        // função que infla as opções na barra da toolbar
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item?.itemId){

            R.id.btn1 ->{
                Toast.makeText(this, "Eu sou botao 1", Toast.LENGTH_LONG).show()
            }
            R.id.btn2 ->{
                Toast.makeText(this, "Eu sou botao 2", Toast.LENGTH_LONG).show()
            }
            R.id.btn3 ->{
                Toast.makeText(this, "Eu sou botao 3", Toast.LENGTH_LONG).show()
            }
            R.id.btn4 ->{
                Toast.makeText(this, "Eu sou botao 4", Toast.LENGTH_LONG).show()
            }
            R.id.btn5 ->{
                Toast.makeText(this, "Eu sou botao 5", Toast.LENGTH_LONG).show()
            }
        }

        return super.onOptionsItemSelected(item)
    }
}