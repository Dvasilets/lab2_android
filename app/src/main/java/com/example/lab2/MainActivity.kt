package com.example.lab2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener()
        {

            val num1: Int = Integer.parseInt(plain_text_input.getText().toString())
            val num2: Int = Integer.parseInt(plain_text_input2.getText().toString())
            textView.text =  "${num1 + num2}"
            val snack = Snackbar.make(it,"$num1 + $num2 =",Snackbar.LENGTH_LONG)
            snack.show()
        }

        val button5= findViewById<Button>(R.id.button5)
        button5.setOnClickListener()
        {

            val num1: Int = Integer.parseInt(plain_text_input.getText().toString())
            val num2: Int = Integer.parseInt(plain_text_input2.getText().toString())
            textView.text =  "${num1 - num2}"
            val snack = Snackbar.make(it,"$num1 - $num2 =",Snackbar.LENGTH_LONG)
            snack.show()
        }

        val button6 = findViewById<Button>(R.id.button6)
        button6.setOnClickListener()
        {

            val num1: Int = Integer.parseInt(plain_text_input.getText().toString())
            val num2: Int = Integer.parseInt(plain_text_input2.getText().toString())
            textView.text =  "${num1 * num2}"
            val snack = Snackbar.make(it,"$num1 * $num2 =",Snackbar.LENGTH_LONG)
            snack.show()
        }

        val button7 = findViewById<Button>(R.id.button7)
        button7.setOnClickListener()
        {

            val num1: Int = Integer.parseInt(plain_text_input.getText().toString())
            val num2: Int = Integer.parseInt(plain_text_input2.getText().toString())
            if(num2 == 0)
                textView.text = "infinity"
            else
                textView.text = String.format("%.5f", num1/num2.toDouble())
            val snack = Snackbar.make(it,"$num1 / $num2 =",Snackbar.LENGTH_LONG)
            snack.show()
        }
    }



}
