package com.example.contact_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contact_list.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val nomeDoContato = intent.extras?.getString("nomeDoNovoContato")
        val numeroDoContato = intent.extras?.getString("numeroDoNovoContato")

//Desenvolver uma condicional para cada item Atulização -> 0.4

        binding.textViewContato1.setText("Contato: $nomeDoContato Número: $numeroDoContato")

        binding.buttonAdicionarContatos.setOnClickListener{
            startActivity(Intent(this,NovoContatoActivity::class.java))
        }
    }






}