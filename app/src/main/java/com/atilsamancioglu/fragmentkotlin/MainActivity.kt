package com.atilsamancioglu.fragmentkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun ilkFragmentAc(view : View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val ilkFragment = IlkFragment()
        fragmentTransaction.replace(R.id.frameLayout,ilkFragment).commit()
    }

    fun ikinciFragmentAc(view: View){

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()

        val ikinciFragment = IkinciFragment()
        fragmentTransaction.replace(R.id.frameLayout,ikinciFragment).commit()

    }
}