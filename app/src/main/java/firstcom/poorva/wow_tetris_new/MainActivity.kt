package firstcom.poorva.wow_tetris_new

// SplashActivity.kt
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import firstcom.poorva.wow_tetris_new.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Add any initialization code or delay if needed
        // For example, you might want to load some data or perform some setup here

        // Example: Delay for 2 seconds and then launch the main activity
        val delayMillis = 2000L
        val mainIntent = Intent(this, Homescreen::class.java)

        // Use a Handler to delay the launch
        android.os.Handler().postDelayed({
            startActivity(mainIntent)
            finish()  // Close the splash screen activity
        }, delayMillis)
    }
}
