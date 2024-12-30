package com.techfathers.mechanic_adda.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.techfathers.mechanic_adda.R
import com.techfathers.mechanic_adda.util.hideStatusBar

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        hideStatusBar()
    }
}