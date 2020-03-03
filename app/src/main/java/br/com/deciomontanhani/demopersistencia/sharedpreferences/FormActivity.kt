package br.com.deciomontanhani.demopersistencia.sharedpreferences

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.deciomontanhani.demopersistencia.R
import kotlinx.android.synthetic.main.activity_form.*

class FormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val sharedPreferencesUtils = SharedPreferencesUtils(this)

        btnSalvar.setOnClickListener {
            sharedPreferencesUtils.salvar("nome", edtNome.text.toString())
            edtNome.setText("")
        }

        btnExcluir.setOnClickListener {
            sharedPreferencesUtils.remover("nome")
            edtNome.setText("")
        }

        btnRecuperar.setOnClickListener {
            val nome = sharedPreferencesUtils.buscar("nome")
            edtNome.setText(nome)
        }
    }

}
