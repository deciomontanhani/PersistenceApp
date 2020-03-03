package br.com.deciomontanhani.demopersistencia.sharedpreferences.menuactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.com.deciomontanhani.demopersistencia.MainActivity
import br.com.deciomontanhani.demopersistencia.R
import br.com.deciomontanhani.demopersistencia.sharedpreferences.FormActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val spButton = findViewById<Button>(R.id.btSp)
        spButton.setOnClickListener {
            startActivity(Intent(this, FormActivity::class.java))
        }

        val bdButton = findViewById<Button>(R.id.btBanco)
        bdButton.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }

        val closeButton = findViewById<Button>(R.id.btFechar)
        closeButton.setOnClickListener {
            finish()
        }
    }
}
