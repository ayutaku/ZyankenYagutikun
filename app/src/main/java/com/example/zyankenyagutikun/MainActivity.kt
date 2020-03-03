package com.example.zyankenyagutikun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun b0(v: View){
        val intent = Intent(this,ChooseActivity::class.java)
        startActivity(intent)
    }
}
