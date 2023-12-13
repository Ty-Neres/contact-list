package com.example.contact_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.contact_list.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initRecyclerView()
        binding.buttonAdicionarContatos.setOnClickListener{
            startActivity(Intent(this,NovoContatoActivity::class.java))
        }
    }

    private fun initRecyclerView() {

        binding.recyclerViewContatos.layoutManager = LinearLayoutManager(this)

        binding.recyclerViewContatos.setHasFixedSize(true)

        binding.recyclerViewContatos.adapter = RecyclerView.Adapter(adicionarContato())
    }

    private fun adicionarContato() = mutableListOf(

    )



}