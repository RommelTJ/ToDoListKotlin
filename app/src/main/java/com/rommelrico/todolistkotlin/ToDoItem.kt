package com.rommelrico.todolistkotlin

import io.realm.RealmObject

open class Dog: RealmObject() {
    public var name = ""
    public var age = 0
}

