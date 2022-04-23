package com.example.pix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.pix.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    //Nome da Activity no binding
    private lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        //Intanciar
        binding = ActivityLoginBinding.inflate(layoutInflater)

        //Sendo usada
        setContentView(binding.root)

        //Botão via ViewBingind
        binding.buttonEntrar.setOnClickListener(this)

        //retirar barra superior
        supportActionBar?.hide()

    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_Entrar) {
            salvaNome()
        }
    }


    fun salvaNome() {

        val nome = binding.editUsuario.text.toString()

        //valida se está em branco
        if (nome != "") {

            SecurityPreferences(this).storeString("USER_NAME",nome)

            //Instanciar nova tela
            startActivity(Intent(this, PrincipalActivity::class.java))

            //Finalizar tela de login
            finish()

        } else {
            Toast.makeText(this,"Preencha o campo nome",Toast.LENGTH_SHORT).show()
        }


    }


}