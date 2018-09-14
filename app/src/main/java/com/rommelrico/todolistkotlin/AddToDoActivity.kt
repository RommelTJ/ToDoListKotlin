package com.rommelrico.todolistkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import io.realm.Realm

class AddToDoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_to_do)

        // Setting the title
        title = "New ToDo"

        // Getting access to the button.
        val button = findViewById<Button>(R.id.addButton)
        button.setOnClickListener {

            // Values from UI.
            val editText = findViewById<EditText>(R.id.toDoEditText)
            val checkbox = findViewById<CheckBox>(R.id.importantCheckBox)

            // Create a ToDoItem class
            val toDo = ToDoItem()
            toDo.name = editText.text.toString()
            toDo.important = checkbox.isChecked

            val realm = Realm.getDefaultInstance()
            realm.beginTransaction()
            realm.copyToRealm(toDo)
            realm.commitTransaction()

            finish()
        }

    }
}
