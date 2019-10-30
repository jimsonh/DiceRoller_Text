package com.example.dicerollertext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll_button)
        val countButton: Button = findViewById(R.id.count_button)
        val resetButton: Button = findViewById(R.id.reset_button)
        rollButton.setOnClickListener { rollDice() }
        countButton.setOnClickListener{(countUp())}
        resetButton.setOnClickListener{(reset())}
    }

    private fun rollDice() {
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result2_text)
        val resultText3: TextView = findViewById(R.id.result3_text)

        var i = 0;
        while(i<3){
            val randomInt = Random().nextInt(6) + 1

            when (i) {
                0 -> resultText.text = randomInt.toString()
                1 -> resultText2.text = randomInt.toString()
                else -> resultText3.text = randomInt.toString()
            }
            i++
        }
    }

    private fun countUp(){
        Toast.makeText(this, "button clicked",
            Toast.LENGTH_SHORT).show()

        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result2_text)
        val resultText3: TextView = findViewById(R.id.result3_text)

        if(resultText.text.toString() == "Hello World!"){
            resultText.text = 1.toString()
            resultText2.text = 1.toString()
            resultText3.text = 1.toString()
        }
        else{
            resultText.text = (resultText.text.toString().toInt()+1).toString()
            resultText2.text = (resultText2.text.toString().toInt()+1).toString()
            resultText3.text = (resultText3.text.toString().toInt()+1).toString()
        }

    }

    private fun reset(){
        val resultText: TextView = findViewById(R.id.result_text)
        val resultText2: TextView = findViewById(R.id.result2_text)
        val resultText3: TextView = findViewById(R.id.result3_text)

        resultText.text = "Hello World!"
        resultText2.text = "Hello World!"
        resultText3.text = "Hello World!"
    }
}
