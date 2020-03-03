package br.com.deciomontanhani.demopersistencia.sharedpreferences

import android.content.Context

class SharedPreferencesUtils (context: Context) {

    val sharedPreferences = context
        .getSharedPreferences("MEU_APP", Context.MODE_PRIVATE)
    val editor = sharedPreferences.edit()

    fun salvar(chave: String, valor: String) {
        val editor = sharedPreferences.edit()
        editor.putString(chave, valor)
        editor.apply()
    }

    fun buscar(chave: String): String? {
        return sharedPreferences.getString(chave, null)
    }

    fun limpar() {
        val editor = sharedPreferences.edit()
        editor.clear()
        editor.apply()
    }

    fun remover(chave: String) {
        val editor = sharedPreferences.edit()
        editor.remove(chave)
        editor.apply()
    }
}