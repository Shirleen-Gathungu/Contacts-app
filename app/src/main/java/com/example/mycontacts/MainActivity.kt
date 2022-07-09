package com.example.mycontacts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mycontacts.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayContacts()
    }

    fun displayContacts(){
        var contact1 =Contact("Leila","+2547890654890","leila@gmail.com","Kilimani890","")
        var contact2 =Contact("Maria","+254734567890","maria@gmail.com","Housepark","")
        var contact3 =Contact("Jemeika","+254798765432","jemeika@gmail.com","Maldred hills","")
        var contact4 =Contact("Paula","+254765432143","paula@gmail.com","Narok","")
        var contact5 =Contact("Vienna","+254890765432","vienna@gmail.com","Mulberry Heights","")

        var contactsList=listOf(contact1,contact2,contact3,contact4,contact5)
        var contactsAdapter = ContactsRVAdapter(contactsList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter =contactsAdapter








    }
}