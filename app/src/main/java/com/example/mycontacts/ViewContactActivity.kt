package com.example.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ViewContactActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_contact)
        getExtras()
    }
    fun getExtras(){
        val extras = intent.extras
        val name = extras?.getString("NAME","")
        var email = extras?.getString("EMAIL","")
        var image  = extras?.getString("IMAGE","")
        Toast.makeText(this,"$name,$email,$image",Toast.LENGTH_SHORT).show()
    }
}