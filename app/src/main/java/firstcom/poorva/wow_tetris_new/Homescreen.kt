package firstcom.poorva.wow_tetris_new

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Homescreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_homescreen)


        val tetris = findViewById<Button>(R.id.tetris)


        tetris.setOnClickListener {

            val intent =Intent(this,GameScreenActivity::class.java)
            startActivity(intent)

        }

        val language =findViewById<Button>(R.id.LANGUAGE)

        language.setOnClickListener {

            val intent= Intent(this,Settings::class.java)
            startActivity(intent)
        }


    }
}