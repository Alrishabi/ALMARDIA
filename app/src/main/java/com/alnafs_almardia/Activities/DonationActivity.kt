package com.alnafs_almardia.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alnafs_almardia.R

class DonationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_donation)
        setTitle(R.string.donition)
    }
}