package com.example.pix

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pix.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity(), View.OnClickListener {

    //Nome da Activity no binding
    private lateinit var binding: ActivityLoginBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //retirar barra superior
        supportActionBar?.hide()

        //Intanciar
        binding = ActivityLoginBinding.inflate(layoutInflater)

        //Sendo usada
        setContentView(binding.root)

        //Botão via ViewBingind
        binding.buttonEntrar.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        if (v.id == R.id.button_Entrar){

            //Instanciar nova tela
            startActivity(Intent(this, PrincipalActivity::class.java))

            //Finalizar tela de login
            finish()

        }
    }
}