package com.alnafs_almardia

import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.alnafs_almardia.R


/**
 * Created by Musab on 01/12/2022.
 */

class AzkarAlmasaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_azkar_almasa)

        setTitle(R.string.azkar_almasa)
    }
}