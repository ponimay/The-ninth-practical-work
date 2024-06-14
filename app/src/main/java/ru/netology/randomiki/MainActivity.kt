package ru.netology.randomiki

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        showRandomNumber()
    }
    fun showRandomNumber(){
        val random:Int = Random.nextInt(0, 1000)
        val randomInt: Int = Random.nextInt(0, random)
        val textviewRandom: TextView = findViewById(R.id.textView)
        val textViewLabel: TextView = findViewById(R.id.textView_random)

        textviewRandom.text = Integer.toString(randomInt)
        textViewLabel.text = getString(R.string.random_heading, random)
    }

    fun randomMe(view: View){
        startActivity(Intent(this, MainActivity2::class.java))
    }
}