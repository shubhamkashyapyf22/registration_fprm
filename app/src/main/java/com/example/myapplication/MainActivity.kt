package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    lateinit  var binding :  ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

       binding.btnId.setOnClickListener{

          var name = binding.fNameId.editText!!.text.toString()//for get value

           val intent = Intent(this, MainActivity2::class.java)

           intent.putExtra("Fname",binding.fNameId.editText!!.text.toString())
           intent.putExtra("Lname",binding.lNameId.editText!!.text.toString())

           startActivity(intent)

//           binding.setFirstName.setText("Your first name is : "+name )//for set value
//           binding.setLastName.setText("Your last name is : "+binding.lNameId.editText!!.text.toString() ) //for set value
//           binding.setMobileNo.setText("Your Mobile No. is : "+binding.mobileNoId.editText!!.text.toString() )
//           binding.setAlternativeNo.setText("Your Alternative Mobile No. is : "+binding.AlternativeNoId.editText!!.text.toString() )
//           binding.setEmailId.setText("Your Email id is : "+binding.EmailId.editText!!.text.toString() )
//           binding.setDateOfBirth.setText("Your Date of Brith is : "+binding.DateOfBirthId.editText!!.text.toString() )




       }


    }
}
