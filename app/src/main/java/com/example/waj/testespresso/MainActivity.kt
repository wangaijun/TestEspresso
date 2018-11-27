package com.example.waj.testespresso

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn.setOnClickListener {
            Log.i("waj123",btn.toString())
            Toast.makeText(this,"hello",Toast.LENGTH_SHORT).show()
        }
    }
}
