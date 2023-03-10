package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityMain2Binding
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {

    lateinit  var binding2 : ActivityMain2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding2 = ActivityMain2Binding.inflate(layoutInflater)
        setContentView(binding2.root)


        val Fname = intent.getStringExtra("Fname")
        val Lname = intent.getStringExtra("Lname")

        binding2.setFirstName.setText("Your Full Name is : $Fname $Lname")

    }
}