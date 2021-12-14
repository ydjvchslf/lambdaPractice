package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    val TAG: String = "로그"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //매개변수X, 리턴x
        someFuntion()
        //매개변수 없을때는 invoke
        someLambda.invoke()


    }

    //매개변수X, 리턴x
    fun someFuntion() {
        Log.d(TAG, "someFuntion() called : 매개변수x, 리턴x")
    }

    val someLambda: () -> Unit = {
        Log.d(TAG, "someLambda() called : 매개변수x, 리턴x")
    }

}