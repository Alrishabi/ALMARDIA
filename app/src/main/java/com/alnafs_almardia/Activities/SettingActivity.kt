package com.alnafs_almardia

import android.app.Activity
import android.content.Intent

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.alnafs_almardia.helpers.Zaytona
import java.util.*

/**
 * Created by Musab on 03/12/2022.
 */

class SettingActivity : AppCompatActivity() {
    lateinit var zaytona:Zaytona
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_setting)
        setTitle(R.string.action_settings)

       // supportActionBar?.setDisplayHomeAsUpEnabled(true)

        val sp_lang = findViewById<Spinner>(R.id.languageSp)
        val set_lang = findViewById<Button>(R.id.set_lang)
        zaytona = Zaytona(this)

        // sp_lang
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter.createFromResource(
            this, R.array.language_array, android.R.layout.simple_spinner_item
        ).also { adapter ->
            // Specify the layout to use when the list of choices appears
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            // Apply the adapter to the spinner
            sp_lang.adapter = adapter
        }
        if(zaytona.getValueOfKey("app_language").equals("ar")){
         sp_lang.setSelection(1)
        }else if(zaytona.getValueOfKey("app_language").equals("en")){
            sp_lang.setSelection(2)
        }
        set_lang.setOnClickListener(View.OnClickListener {
            when (sp_lang.selectedItemPosition) {
                1 -> {
                    setLocale(this,"ar")
                }
                2 -> {
                    setLocale(this,"en")
                }
                else -> {
                    Toast.makeText(applicationContext,R.string.prompt_lang_selection, Toast.LENGTH_LONG).show()
                }
            }
        })
    }
    private fun setLocale(activity:Activity, languageCode:String) {
        val locale =  Locale(languageCode);
        Log.i("setLocal", "setLocale: ")
        Log.i("language", languageCode)
        Locale.setDefault(locale);
        val resources = activity.getResources();
        val config = resources.getConfiguration();
        config.setLocale(locale);
        resources.updateConfiguration(config, resources.getDisplayMetrics());
        zaytona.setValueToKey("app_language",languageCode)
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
    override fun onBackPressed() {
        super.onBackPressed()
        startActivity(Intent(this, MainActivity::class.java))
        finish()
    }
//    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
////       TODO("Not yet implemented")
//        if(p2==0){
//            Toast.makeText(applicationContext, "click on share", Toast.LENGTH_LONG).show()
//        }else if(p2==1){
//            Log.i("p2", "potion no 2 selected")
//            setLocale(this,"ar")
//        }else
//            setLocale(this,"en")
//
//    }
//
//    override fun onNothingSelected(p0: AdapterView<*>?) {
////        TODO("Not yet implemented")
//    }
}