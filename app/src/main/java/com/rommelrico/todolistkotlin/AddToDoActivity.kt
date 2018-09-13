package com.rommelrico.todolistkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class AddToDoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_to_do)

        // Setting the title
        title = "New ToDo"

        // Getting access to the button.
        val button = findViewById<Button>(R.id.addButton)
        button.setOnClickListener {
            println("---> Click")
        }

    }
}
