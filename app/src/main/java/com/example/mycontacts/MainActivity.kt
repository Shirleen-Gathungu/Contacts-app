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
        var contact1 =Contact("Leila","+2547890654890","leila@gmail.com","Kilimani890","https://images.pexels.com/photos/936048/pexppppppppels-photo-936048.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact2 =Contact("Maria","+254734567890","maria@gmail.com","Housepark","https://images.pexels.com/photos/1820919/pexels-photo-1820919.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact3 =Contact("Jemeika","+254798765432","jemeika@gmail.com","Maldred hills","https://images.pexels.com/photos/871495/pexels-photo-871495.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact4 =Contact("Paula","+254765432143","paula@gmail.com","Narok","https://images.pexels.com/photos/1300574/pexels-photo-1300574.jpeg?auto=compress&cs=tinysrgb&w=400")
        var contact5 =Contact("Vienna","+254890765432","vienna@gmail.com","Mulberry Heights","https://images.pexels.com/photos/175696/pexels-photo-175696.jpeg?auto=compress&cs=tinysrgb&w=400")

        var contactsList=listOf(contact1,contact2,contact3,contact4,contact5)
        var contactsAdapter = ContactsRVAdapter(contactsList)
        binding.rvContacts.layoutManager=LinearLayoutManager(this)
        binding.rvContacts.adapter =contactsAdapter








    }
}