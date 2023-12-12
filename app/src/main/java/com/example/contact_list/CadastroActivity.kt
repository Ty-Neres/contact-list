package com.example.contact_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.contact_list.Objetos.UsuarioPrincipal
import com.example.contact_list.databinding.ActivityCadastroBinding

class CadastroActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCadastroBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCadastroBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonCadastrar.setOnClickListener{
            var usuario = binding.editTextUsuarioDeCadastro.text.toString()
            var senha = binding.editTextSenhaDeCadastro.text.toString()
            var confirmarSenha = binding.editTextConfirmarSenha.text.toString()

            if (usuario.isNotEmpty() && senha.isNotEmpty() && confirmarSenha.isNotEmpty()){
                if (senha == confirmarSenha){
                    UsuarioPrincipal.usuario = usuario
                    UsuarioPrincipal.senha = senha
                    startActivity(Intent(this,LoginActivity::class.java))
                }else{
                     binding.textViewErroNoCadastro.text = "As senhas não são iguais"
                }
            }else{
                binding.textViewErroNoCadastro.text = "Preencha todos os campos vazios"
            }
        }
    }
}