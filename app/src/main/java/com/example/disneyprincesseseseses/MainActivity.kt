package com.example.disneyprincesseseseses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var princessImg : ImageView
    lateinit var princessTxt : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.button)
        rollButton.setOnClickListener { randomPrincess() }
        princessImg = findViewById(R.id.princessimg)
        val retryButton: Button= findViewById(R.id.button2)
        retryButton.setOnClickListener{
            princessImg.setImageResource(R.drawable.logo)
            princessTxt.text= "Click and see which Disney Priness are you..."
        }
    }

     fun randomPrincess(){
        val randomInt= (1..10).random()

        princessImg= findViewById(R.id.princessimg)
        princessTxt= findViewById(R.id.textScroll)

        val drawableResource= when(randomInt){
            1 -> R.drawable.star
            2 -> R.drawable.tiana
            3 -> R.drawable.tigerlily
            4 -> R.drawable.vanellope
            5 -> R.drawable.eilonwy
            6 -> R.drawable.faline
            7 -> R.drawable.kida
            8 -> R.drawable.ladymarian
            9 -> R.drawable.megara
            else -> R.drawable.nala
        }

        val textResource= when(randomInt){
            1 -> R.string.text1
            2 -> R.string.text2
            3 -> R.string.text3
            4 -> R.string.text4
            5 -> R.string.text5
            6 -> R.string.text6
            7 -> R.string.text7
            8 -> R.string.text8
            9 -> R.string.text9
            else -> R.string.text10
        }

        princessImg.setImageResource(drawableResource)
        princessTxt.text= getString(textResource)
    }
}
