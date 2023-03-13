package com.gdff.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //contructor Handler() seems to have been deprecated,tomorrow we might try a different approach towards this
        Handler().postDelayed(Runnable { //This method will be executed once the timer is over
            // Start your app main activity
            val i = Intent(this@MainActivity, User_registration::class.java)
            startActivity(i)
            // close this activity
            finish()
        }, 3000)
    }
}