package com.smartrasoi.app.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.smartrasoi.app.R

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_home, container, false)
        
        // F1: Receiver logic - Display username from Intent data passed through Bundle
        val userName = arguments?.getString("USER_NAME") ?: "User"
        val txtGreeting = root.findViewById<TextView>(R.id.txtHomeGreeting)
        txtGreeting?.text = "Good Morning, $userName!"
        
        return root
    }
}
