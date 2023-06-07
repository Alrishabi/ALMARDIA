package com.alnafs_almardia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class TasbeehActivity : AppCompatActivity() {
    private var counter=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasbeeh)

        setTitle(R.string.tasbeh)


        val tasbeeh_counter=findViewById<TextView>(R.id.tasbeeh_counter)
        val tasbeeh_clear=findViewById<Button>(R.id.tasbeeh_clear)
        val LL_touch=findViewById<LinearLayout>(R.id.LL_touch)

        LL_touch.setOnClickListener(View.OnClickListener {
            counter=counter+1
            tasbeeh_counter.setText(counter.toString())
        })
        tasbeeh_clear.setOnClickListener(View.OnClickListener {
            counter=0
            tasbeeh_counter.text= counter.toString()
        })
    }
}