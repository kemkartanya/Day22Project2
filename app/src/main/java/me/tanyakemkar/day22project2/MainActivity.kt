package me.tanyakemkar.day22project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView

class MainActivity : AppCompatActivity() {

    lateinit var userArrayList: ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = arrayOf("Saumya", "Tanya", "Riya", "Prastuti", "Kavya")

        val lastMsg = arrayOf("Hey wassup", "Namaste", "hello", "hey yo", "work on it")

        val lastMsgTime = arrayOf("4:45 PM", "7:00 AM", "8:08 AM", "9:44 AM", "9:00 PM")

        val phoneNumber = arrayOf("897688989", "676797080", "4578678543", "77897865", "487987989")

        val imgId = intArrayOf(R.drawable.pic0, R.drawable.pic1, R.drawable.pic2, R.drawable.pic3, R.drawable.pic4)

        userArrayList = ArrayList()

        for(eachIndex in name.indices) {
            val user = User(name[eachIndex], lastMsg[eachIndex], lastMsgTime[eachIndex], phoneNumber[eachIndex], imgId[eachIndex])

            userArrayList.add(user)
        }

        val listView = findViewById<ListView>(R.id.listView)
        listView.isClickable = true
        listView.adapter = MyAdapter(this, userArrayList)
    }
}