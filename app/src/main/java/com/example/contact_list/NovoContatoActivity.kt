package com.example.contact_list

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.contact_list.Class.Contatos
import com.example.contact_list.databinding.ActivityNovoContatoBinding

class NovoContatoActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNovoContatoBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityNovoContatoBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

binding.buttonCancelarNovoContato.setOnClickListener{
    startActivity(Intent(this,MainActivity::class.java))
}
        binding.buttonSalvarNovoContato.setOnClickListener{
            val nomeDoNovoContato = binding.editTextNomeDoNovoContato.text.toString().trim()
            val numeroDoNovoContato = binding.editTextNumeroDoNovoContato.text.toString().trim()
if(nomeDoNovoContato.isNotEmpty() && numeroDoNovoContato.isNotEmpty()){
    val novoContato = Contatos(nomeDoNovoContato,numeroDoNovoContato)
    val intent = Intent(this,MainActivity::class.java)
    intent.putExtra("novoContato",Contatos(nomeDoNovoContato,numeroDoNovoContato))
    startActivity(intent)
}else{
    binding.textViewErroDeNovoContato.text = "Preencha todos os campos vazios"
}
        }

    }

}

private fun Intent.putExtra(s: String, contatos: Contatos) {
    TODO("Not yet implemented")
}






