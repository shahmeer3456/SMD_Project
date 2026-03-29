package com.smartrasoi.app.activities

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.smartrasoi.app.R
import com.smartrasoi.app.fragments.CookFragment
import com.smartrasoi.app.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // F1: Receiver logic - Retrieving data from OnboardingActivity Intent
        val userName = intent.getStringExtra("USER_NAME") ?: "User"

        // Load initial fragment (Home)
        if (savedInstanceState == null) {
            val bundle = Bundle()
            bundle.putString("USER_NAME", userName)
            val homeFragment = HomeFragment()
            homeFragment.arguments = bundle
            loadFragment(homeFragment)
        }

        setupBottomNavigation()
    }

    private fun setupBottomNavigation() {
        val tabHome = findViewById<LinearLayout>(R.id.tab_home)
        val tabCook = findViewById<LinearLayout>(R.id.tab_cook)
        
        tabHome.setOnClickListener {
            // F4: Fragment Transactions - Switch to HomeFragment
            loadFragment(HomeFragment())
            updateNavigationStyle(it as LinearLayout)
        }

        tabCook.setOnClickListener {
            // F4: Fragment Transactions - Switch to CookFragment
            loadFragment(CookFragment())
            updateNavigationStyle(it as LinearLayout)
        }
    }

    private fun loadFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .commit()
    }

    private fun updateNavigationStyle(selectedTab: LinearLayout) {
        // Simple logic for highlighting selected tab
        // In a real app we'd reset all other tabs' colors
    }
}
