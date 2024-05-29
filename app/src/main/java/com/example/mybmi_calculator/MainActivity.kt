package com.example.mybmi_calculator

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val heightEditText = findViewById<EditText>(R.id.et_height)
        val weightEditText = findViewById<EditText>(R.id.et_weight)
        val submitButton = findViewById<Button>(R.id.btn_check)


        submitButton.setOnClickListener {

        if (heightEditText.text.isEmpty()) {
            Toast.makeText(this, "키를 입력해주세요.", Toast.LENGTH_SHORT).show()
            return@setOnClickListener

        }
        if (weightEditText.text.isEmpty()) {
            Toast.makeText(this, "몸무게를 입력해주세요.", Toast.LENGTH_SHORT).show()
            return@setOnClickListener

        }

        val height : Int = heightEditText.text.toString().toInt()
        val weight : Int = weightEditText.text.toString().toInt()

        val intent = Intent(this, ResultActivity::class.java)
        intent.putExtra("height", height)
        intent.putExtra("weight", weight)
        startActivity(intent)



    }
}}