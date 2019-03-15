package com.hexadecimal.activitylifecycle

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("onCreate","Start")
    }

    override fun onStart() {
        super.onStart()
        Log.e("onStart","Start")
    }

    override fun onResume() {
        super.onResume()
        Log.e("onResume","Start")
    }

    override fun onPause() {
        super.onPause()
        Log.e("onPause","Start")
    }

    override fun onStop() {
        super.onStop()
        Log.e("onStop","Start")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("onRestart","Start")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("onDestroy","Start")
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        Log.e("onSaveInstanceState","Start")
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        Log.e("onRestoreInstanceState","Start")
    }

    override fun onContentChanged() {
        super.onContentChanged()
        Log.e("onContentChanged","Start")
    }

}
