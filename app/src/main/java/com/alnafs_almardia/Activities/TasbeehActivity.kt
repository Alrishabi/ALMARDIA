package com.alnafs_almardia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import com.alnafs_almardia.R

class TasbeehActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasbeeh)

        setTitle(R.string.tasbeh)

        var counter=0
        val tasbeeh_counter=findViewById<TextView>(R.id.tasbeeh_counter)
        val tasbeeh_clear=findViewById<Button>(R.id.tasbeeh_clear)
        val tasbeeh=findViewById<ImageButton>(R.id.tasbeeh)

        tasbeeh.setOnClickListener(View.OnClickListener {
            counter=counter+1
            tasbeeh_counter.setText(counter.toString())
        })
        tasbeeh_clear.setOnClickListener(View.OnClickListener {
            counter=0
            tasbeeh_counter.text= counter.toString()
        })
    }
}