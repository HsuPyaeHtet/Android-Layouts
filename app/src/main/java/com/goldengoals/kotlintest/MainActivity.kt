package com.goldengoals.kotlintest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun hello(view: View) {
        Toast.makeText(this,"Hello", Toast.LENGTH_SHORT).show()
    }

    fun intce(view: View) {
        startActivity(Intent(this,SecondActivity::class.java))
    }
}
