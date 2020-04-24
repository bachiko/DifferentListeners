package com.example.differentlisteners

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var textView:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button3)
        textView = findViewById<TextView>(R.id.screen)

        button.setOnClickListener(this)

        button2.setOnClickListener{
            Toast.makeText(this, "This is setOnClickListener attribute on ${button2.text}", Toast.LENGTH_SHORT).show()
        }
    }

    fun onClickFun(view: View) {
        var button = view as Button
        Toast.makeText(this, "This is android:onClick attribute on ${button.text}", Toast.LENGTH_SHORT).show()
    }


    override fun onClick(v: View?) {
        textView.text = "${button3.text}"
        Toast.makeText(this, "This is View.OnClickListener attribute", Toast.LENGTH_SHORT).show()
    }

}
