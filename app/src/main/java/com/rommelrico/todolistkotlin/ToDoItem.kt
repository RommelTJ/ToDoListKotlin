package com.rommelrico.todolistkotlin

import io.realm.RealmObject

open class ToDoItem: RealmObject() {
    var name = ""
    var important = false

    override fun toString(): String {
        return "ToDoItem(name='$name', important=$important)"
    }

}
