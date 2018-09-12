package com.rommelrico.todolistkotlin

import android.app.Application
import io.realm.Realm

public class ToDoList: Application() {

    public override fun onCreate() {
        super.onCreate()
        Realm.init(this)
    }

}