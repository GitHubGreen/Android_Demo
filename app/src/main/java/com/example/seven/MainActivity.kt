package com.example.seven

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tencent.bugly.crashreport.CrashReport
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn_bugly.setOnClickListener(this)
    }

    override fun onClick(view: View?) {
       when(view){
           btn_bugly->{
               CrashReport.testJavaCrash()
           }

       }
    }
}
