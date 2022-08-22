package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button= findViewById(R.id.roll_button)
        val addOne :Button = findViewById(R.id.button_adder)

        rollButton.setOnClickListener{
            rollDice()
        }
        addOne.setOnClickListener{
            countUp()
        }

    }

    private fun countUp(){
        var resultText : TextView= findViewById(R.id.result_text)
        if (resultText.text[0].digitToInt()== 6){
            Toast.makeText(this,"Cannot go over 6 bud",Toast.LENGTH_SHORT).show()
            return
        }

        var countedUp=resultText.text[0].digitToInt()+1
        println(countedUp)
        resultText.text=countedUp.toString()
    }


    private fun rollDice(){

        val randomInt = (1..6).random()

        //Toast.makeText(this,"Button clicked",Toast.LENGTH_SHORT).show()
        //This is the context, in this case the main activity
        val resultText : TextView =findViewById(R.id.result_text)
        resultText.text=randomInt.toString()


    }



}