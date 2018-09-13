package com.rommelrico.todolistkotlin

import io.realm.RealmObject

open class ToDoItem: RealmObject() {
    var name = ""
    var important = false
}

open class Dog: RealmObject() {
    var name = ""
    var age = 0
}
