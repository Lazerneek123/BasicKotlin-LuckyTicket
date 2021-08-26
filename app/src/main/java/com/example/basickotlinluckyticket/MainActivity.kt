package com.example.basickotlinluckyticket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun startProcess(view: View) {
        val bulb = findViewById<ImageView>(R.id.bulbImageView)
        val input = findViewById<EditText>(R.id.editText).text.toString().toCharArray()

        if(input.size == 6) {
            if(input[0].toInt() + input[1].toInt() + input[2].toInt() == input[3].toInt() + input[4].toInt() + input[5].toInt()) {
                bulb.setImageResource(R.drawable.icongreen)
                Toast.makeText(this, "Щасливий білет!", Toast.LENGTH_LONG).show()
            }
            else {
                bulb.setImageResource(R.drawable.iconred)
                Toast.makeText(this, "Не щасливий білет!", Toast.LENGTH_LONG).show()
            }
        }
        else {
            Toast.makeText(this, "Введіть більше символів!", Toast.LENGTH_LONG).show()
        }
    }
    // by Lazerneek123 / Barmutov Roman
}