package ru.netology.randomiki

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val random:Int = Random.nextInt(0, 10)
        val enterGuess: EditText = findViewById(R.id.enterGuess)
        val guessBtn: Button = findViewById(R.id.randomBtn)
        guessBtn.setOnClickListener {
            if(Integer.parseInt(enterGuess.text.toString()) == random) {
                Toast.makeText(this, "Вы выиграли", Toast.LENGTH_SHORT).show()
            }
            else  Toast.makeText(this, "Вы проиграли", Toast.LENGTH_SHORT).show()
        }
    }
}