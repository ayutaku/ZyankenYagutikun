package com.example.zyankenyagutikun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import kotlinx.android.synthetic.main.activity_fight.*
import java.lang.Thread.sleep
import kotlin.random.Random

class FightActivity : AppCompatActivity() {


    val yagutiN = Random.nextInt(3)

    val yagutiHand = intArrayOf(
        R.drawable.yaguti_gu,
        R.drawable.yaguti_tyoki,
        R.drawable.yaguti_pa
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fight)
        yaguti_hand.setImageResource(yagutiHand[yagutiN])
    }



     fun next(v:View) {
         val peopleN = intent.getIntExtra("peopleN_key",0)
         val intent = Intent(this, ResultActivity::class.java)
         val resultN =(peopleN - yagutiN +3)%3 //じゃんけんの規則性よりこの値が0ならあいこ、1なら負け、2なら勝ち
        intent.putExtra("resultN_key", resultN)
        startActivity(intent)
    }
}
