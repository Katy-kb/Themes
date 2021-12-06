package katy.kb.a111

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.content.Intent
import android.net.Uri


private const val HELLO_KEY = "hello"

class MainActivity : AppCompatActivity() {

    lateinit var nextActivityButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nextActivityButton = findViewById(R.id.next_activity_button)

        nextActivityButton.setOnClickListener {
            val secondActivityIntent = Intent (this, SecondActivity::class.java)
            secondActivityIntent.putExtra(HELLO_KEY, "Hello from MA")
            startActivity(secondActivityIntent)
        }


   }

}