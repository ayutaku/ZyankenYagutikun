package com.example.zyankenyagutikun

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_fight.*
import kotlinx.android.synthetic.main.activity_result.*
import java.lang.Thread.sleep

class ResultActivity : AppCompatActivity() {

    val resultYaguti = intArrayOf(
        R.drawable.result_draw,
        R.drawable.result_lose,
        R.drawable.result_win
    )

    val resultText =arrayOf(
        "あいこ！",
        "あなたの負け...",
        "あなたの勝ち!!"
    )

    val getCoin = arrayOf(
        "5コインget!",
        "",
        "10コインget!"
        )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        val resultN = intent.getIntExtra("resultN_key",0)
        yaguti_result.setImageResource(resultYaguti[resultN])
        result.setText(resultText[resultN])
        coin.setText(getCoin[resultN])
    }

    fun b4(v: View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}
