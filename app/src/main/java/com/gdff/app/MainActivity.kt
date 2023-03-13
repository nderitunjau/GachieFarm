package com.gdff.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
/*There is no need to setContentView() with any XML layout because the splash screen is being loaded from the manifest already. 
Create a Handler if you want to show your splash screen for a set period of time, such as five seconds.
A timer can also let you download data from the cloud on your main activity, which might be a better strategy than displaying a dialogue on the home screen.
*/

class MainActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startActivity(Intent(this@MainActivity, User_registration::class.java))
        finish()
    }
}
