package com.rommelrico.todolistkotlin

import io.realm.RealmObject

open class Dog: RealmObject() {
    var name = ""
    var age = 0
}
