package com.example.parcialguilardes

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class ResultActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val tvResult = findViewById<TextView>(R.id.tv_result)
        //obtengo datos ingresados por usuario
        val num1 = intent.getStringExtra("num1")?.toDoubleOrNull()?:0.0
        val num2 = intent.getStringExtra("num2")?.toDoubleOrNull()?:0.0
        val operation = intent.getStringExtra("operation")
        //calculadora
        val result = calcular(num1,num2,operation)
        tvResult.text = "$result"
    }
private fun calcular(num1:Double,num2:Double,operation:String?):Double{
    var result:Double =0.0
    if(operation=="+"){
        result = num1 + num2
    }else if(operation=="-"){
        result= num1 - num2
    }else if(operation=="x"){
        result=num1*num2
    }else if(operation=="/"&&num2!=0.0){
        result=num1/num2
    }else{
        result=0.0 //no es válido
    }
    return result
}

}