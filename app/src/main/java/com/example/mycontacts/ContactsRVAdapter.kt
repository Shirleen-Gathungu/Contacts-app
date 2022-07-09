package com.example.mycontacts

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContactsRVAdapter(var contactList: List<Contact>):RecyclerView.Adapter<ContactsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        var itemView = LayoutInflater.from(parent.context).inflate(R.layout.contact_list_item,parent,false)
        return ContactsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
    var currentContact = contactList.get(position)
        holder.tvName.text =currentContact.name
        holder.tvPhoneNumber.text =currentContact.phoneNumber
        holder.tvEmailAddress.text =currentContact.email
        holder.tvAddress.text =currentContact.address
    }

    override fun getItemCount(): Int {
        return contactList.size
    }
}

class ContactsViewHolder(itemView:View):
    RecyclerView.ViewHolder(itemView){
    var tvName = itemView.findViewById<TextView>(R.id.tvName)
    var tvPhoneNumber = itemView.findViewById<TextView>(R.id.tvPhoneNumber)
    var tvEmailAddress = itemView.findViewById<TextView>(R.id.tvEmailAddress)
    var tvAddress = itemView.findViewById<TextView>(R.id.tvAddress)
    var ivContact = itemView.findViewById<ImageView>(R.id.ivContact)
}