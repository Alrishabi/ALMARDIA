package com.alnafs_almardia.Activities

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alnafs_almardia.R

class AzkarAlmasaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_azkar_almasa)

        setTitle(R.string.azkar_almasa)
    }
}