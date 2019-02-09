package com.jahskee.coolresume

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // add click event to workHistoryBtn
        var workHistoryBtn = findViewById<Button>(R.id.workHistoryBtn)
        workHistoryBtn.setOnClickListener {
            println("Hey you hit the button")

            var moveToWorkHistory = Intent(getApplicationContext(), WorkHistorActivity::class.java)
            startActivity(moveToWorkHistory)
        }
    }
}
