package com.example.enpit_p12.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.ContextCompat.startActivity
import android.view.View
import com.example.enpit_p12.myapplication.R.drawable.pa
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.startActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        gu.setOnClickListener {onJankenButtonTapped(it)}
        choki.setOnClickListener {onJankenButtonTapped(it)}
        pa.setOnClickListener {onJankenButtonTapped(it)}
    }
    fun onJankenButtonTapped(view: View?){
        startActivity<ResultActivity>("MY_HAND" to view?.id)
    }
}
