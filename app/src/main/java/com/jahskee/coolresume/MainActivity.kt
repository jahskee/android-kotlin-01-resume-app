package com.jahskee.coolresume

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // add click event to workHistoryBtn
        var workHistoryButton = findViewById<Button>(R.id.workHistoryButton)
        workHistoryButton.setOnClickListener {
            println("Hey you hit the button")

            var moveToWorkHistory = Intent(getApplicationContext(), WorkHistorActivity::class.java)
            startActivity(moveToWorkHistory)
        }

        // add click event to call
        var callButton = findViewById<Button>(R.id.callButton)
        callButton.setOnClickListener {
            println("Hey you hit the call button")

            var phoneUri = Uri.parse("tel: 5712979957")
            var callIntent = Intent(Intent.ACTION_DIAL, phoneUri)
            startActivity(callIntent)
        }


        // add click event to call
        var emailButton = findViewById<Button>(R.id.emailButton)
        emailButton.setOnClickListener {
            println("Hey you hit the email button")

            var emailIntent = Intent(Intent.ACTION_SEND)
            emailIntent.setType("plain/text")
            emailIntent.putExtra(Intent.EXTRA_EMAIL, "jaizon.lubaton@yahoo.com")
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Nice Resume")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "I Really enjoyed your resume..." )
            startActivity(emailIntent)
        }


    }
}
