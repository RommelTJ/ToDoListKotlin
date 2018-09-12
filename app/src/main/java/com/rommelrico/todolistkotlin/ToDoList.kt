package com.rommelrico.todolistkotlin

import android.app.Application
import io.realm.Realm

class ToDoList: Application() {

    override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }

}
