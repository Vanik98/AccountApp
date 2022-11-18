package com.vanik.accountapp.ui.main

import android.os.Bundle
import com.vanik.accountapp.R
import com.vanik.accountapp.ui.base.BaseActivity

class MainActivity : BaseActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}