package com.example.zyankenyagutikun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class ChooseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choose)
    }

    //選択した手がグーなら0,チョキなら1,パーなら2を渡す
    fun b1(v: View){
        val intent = Intent(this,FightActivity::class.java)
        intent.putExtra("peopleN_key",0)
        startActivity(intent)
    }

    fun b2(v: View){
        val intent = Intent(this,FightActivity::class.java)
        intent.putExtra("peopleN_key",1)
        startActivity(intent)
    }

    fun b3(v: View){
        val intent = Intent(this,FightActivity::class.java)
        intent.putExtra("peopleN_key",2)
        startActivity(intent)
    }


}
