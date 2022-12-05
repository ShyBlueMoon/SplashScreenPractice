package primeiro.cliente.cursoandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.LayoutInflater
import primeiro.cliente.cursoandroid.databinding.ActivityMainBinding
import primeiro.cliente.cursoandroid.databinding.ActivityTelaSplashBinding

class TelaSplashActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTelaSplashBinding

    companion object {
        private const val nomeDoApp:String = "AppPrimeiroCliente"
        private const val activity:String = "Splash Activity::"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTelaSplashBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        Log.i(nomeDoApp, "$activity onCreate")
        handlertrocarTela()
    }

    private fun handlertrocarTela() {
        Handler(Looper.getMainLooper()).postDelayed( {
             fun trocarTela() {
                 Log.i(nomeDoApp,"$activity esperando trocar de tela")
                 startActivity(Intent(this, MainActivity::class.java))
                 finish()
             }
            trocarTela()

        }, 3000)
    }

}