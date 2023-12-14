package com.example.contact_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contact_list.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            var usuario = binding.editTextUsuario.text.toString().trim()
            var senha = binding.editTextSenha.text.toString()

            if (usuario.isNotEmpty() && senha.isNotEmpty()) {
                if (ValidarUsuario(usuario, senha)) {
                    startActivity(Intent(this, MainActivity::class.java))
                } else {
                    binding.textViewErroDeLogin.text = "Usuario Invalido ou Não Cadastrado"
                }
            } else {
                binding.textViewErroDeLogin.text = "Digite o usuário e a senha"
            }
        }
            binding.textViewCadastro.setOnClickListener {
                startActivity(Intent(this, CadastroActivity::class.java))
            }
        }

    private fun ValidarUsuario(usuario: String, senha: String): Boolean {
        return usuario == UsuarioPrincipal.usuario && senha == UsuarioPrincipal.senha
    }

}