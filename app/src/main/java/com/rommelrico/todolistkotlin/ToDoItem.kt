package com.rommelrico.todolistkotlin

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

open class ToDoItem: RealmObject() {
    @PrimaryKey
    var id = UUID.randomUUID().toString()
    var name = ""
    var important = false

    override fun toString(): String {
        return name
    }

}
