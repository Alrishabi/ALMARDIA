package com.alnafs_almardia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alnafs_almardia.R

class TasbeehActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasbeeh)

        setTitle(R.string.tasbeh)
    }
}