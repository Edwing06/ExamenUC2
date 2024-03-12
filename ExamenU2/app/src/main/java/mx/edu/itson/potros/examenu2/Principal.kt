package mx.edu.itson.potros.examenu2

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Principal : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.principal)

        var btnDetalles: Button = findViewById(R.id.btn_detalles) as Button
        var btnGlobos: Button = findViewById(R.id.btn_globos) as Button
        var btnPeluches: Button = findViewById(R.id.btn_peluches) as Button
        var btnRegalos: Button = findViewById(R.id.btn_regalos) as Button
        var btnTazas: Button = findViewById(R.id.btn_tazas) as Button

        btnDetalles.setOnClickListener {

        }
    }
}