package com.example.pix

import android.content.Context
import android.content.SharedPreferences

class SecurityPreferences(context: Context) {

    private val security: SharedPreferences =
        context.getSharedPreferences("PIX", Context.MODE_PRIVATE)


    //salvar valor
    fun storeString(key: String, str: String) {
        security.edit().putString(key, str).apply()
    }

    //recuperar valor
    fun getString(key: String): String {
        return security.getString(key, "") ?: ""
        //Se este for nulo security.getString(key, "") -> retorna esse ?: ""
        //Se não for nulo, é usada essa (key, "")
    }

}