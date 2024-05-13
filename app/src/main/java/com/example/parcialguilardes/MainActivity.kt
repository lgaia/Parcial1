package com.example.parcialguilardes

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val num1 = findViewById<EditText>(R.id.et_num1)
        val num2 = findViewById<EditText>(R.id.et_num2)
        val sumButton :Button = findViewById<Button>(R.id.btn_sum)
        val restaButton :Button = findViewById<Button>(R.id.btn_resta)
        val multButton :Button = findViewById<Button>(R.id.btn_mult)
        val divButton :Button = findViewById<Button>(R.id.btn_division)
        val calcButton: Button = findViewById<Button>(R.id.btn_calcular)
        var operation : String = ""
        //segun que boton de operacion puso el usuario asigno valor a operation para usarlo al calcular
        sumButton.setOnClickListener{
            operation="+"
        }
        restaButton.setOnClickListener{
            operation="-"
        }
        multButton.setOnClickListener{
            operation="x"
        }
        divButton.setOnClickListener{
            operation="/"
        }
        //configuro boton de calcular para que lleve a la segunda pantalla
        calcButton.setOnClickListener{
            val num1 = findViewById<EditText>(R.id.et_num1).text.toString()
            val num2 = findViewById<EditText>(R.id.et_num2).text.toString()
            if(num1.isNotEmpty()&&num2.isNotEmpty()) {
                val intent = Intent(this,ResultActivity::class.java)
                intent.putExtra("num1",num1)
                intent.putExtra("num2",num2)
                intent.putExtra("operation",operation)
                startActivity(intent)
            }
        }
    }

}