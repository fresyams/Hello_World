package org.d3if4104.helloworld


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton = findViewById<Button>(R.id.roll_button) as Button
        rollbutton.setOnClickListener{
            Toast.makeText(this, "Hello Android!" , Toast.LENGTH_SHORT).show()
        }
    }
}
