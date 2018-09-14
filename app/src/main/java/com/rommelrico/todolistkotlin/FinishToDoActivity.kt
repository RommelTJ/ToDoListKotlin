package com.rommelrico.todolistkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import io.realm.Realm

class FinishToDoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish_to_do)
        title = "Complete ToDo"

        val toDoItemId = intent.getStringExtra("toDoItem")

        val realm = Realm.getDefaultInstance()
        val toDoItem = realm.where(ToDoItem::class.java).equalTo("id", toDoItemId).findFirst()

        val textView = findViewById<TextView>(R.id.titleTextView)
        textView.text = toDoItem.toString()
    }
}
