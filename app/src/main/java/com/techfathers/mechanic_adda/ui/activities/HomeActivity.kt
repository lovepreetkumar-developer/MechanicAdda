package com.techfathers.mechanic_adda.ui.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.fragment.NavHostFragment
import com.techfathers.mechanic_adda.R
import com.techfathers.mechanic_adda.util.Constants.KEY_PURPOSE
import com.techfathers.mechanic_adda.util.Constants.TRANSITION_ALL_REQUESTS_FRAGMENT
import com.techfathers.mechanic_adda.util.hideStatusBar

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        hideStatusBar()


        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.nav_host_home) as NavHostFragment
        val graphInflater = navHostFragment.navController.navInflater
        val navGraph = graphInflater.inflate(R.navigation.nav_graph_home)
        val navController = navHostFragment.navController

        var bundle = Bundle()

        /*Change Nav Graph Start Destination*/
        intent.extras?.let {
            bundle = it
            bundle.getString(KEY_PURPOSE)?.let { keyPurpose ->
                when (keyPurpose) {
                    TRANSITION_ALL_REQUESTS_FRAGMENT -> navGraph.setStartDestination(R.id.all_requests_fragment)
                    else -> navGraph.setStartDestination(R.id.home_fragment)
                }
            }
        }

        navController.setGraph(navGraph, bundle)

    }
}