package com.example.pix

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.pix.databinding.ActivityPrincipalBinding

class PrincipalActivity : AppCompatActivity(), View.OnClickListener {


    private lateinit var binding: ActivityPrincipalBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_principal)

        //Esconder barra de navegação
        supportActionBar?.hide()


        binding = ActivityPrincipalBinding.inflate(layoutInflater)
        setContentView(binding.root)

        getNome()


    }

    override fun onClick(v: View) {

    }


    fun getNome(){

        val nomeTela = SecurityPreferences(this).getString("USER_NAME")
        binding.txtSaudacao.text = "Olá $nomeTela !"

    }


}