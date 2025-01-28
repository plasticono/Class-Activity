package edu.temple.classactivity

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //can all be done on one line by taking the object
        //from #findViewById and accessing the onClickListener directly from it.
        button = findViewById<Button>(R.id.button)
        button.setOnClickListener(){
            button.text = "clicked"
        }

    }
}