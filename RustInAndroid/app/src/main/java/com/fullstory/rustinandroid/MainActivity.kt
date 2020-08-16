package com.fullstory.rustinandroid

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.fullstory.rustinandroid.jni.Rust

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("**** product: " + Rust.product(5, 4))
    }
}