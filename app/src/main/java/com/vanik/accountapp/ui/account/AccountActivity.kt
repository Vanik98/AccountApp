package com.vanik.accountapp.ui.account

import android.os.Bundle
import com.vanik.accountapp.R
import com.vanik.accountapp.ui.base.BaseActivity

class AccountActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_account)
    }
}