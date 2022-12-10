package com.alnafs_almardia
import android.content.Intent
import android.content.res.Resources
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.alnafs_almardia.Activities.ContactUsActivity

/**
 * Created by Musab on 27/11/2022.
 */

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle(R.string.app_name)
    }
    fun goToAzkarAlsabah( view: View){
        startActivity(Intent(this, AzkarAlsabahActivity::class.java))
    }
    fun goToAzkarAlmasjed( view: View){
        startActivity(Intent(this, AzkarAlmasjedActivity::class.java))
    }
    fun goToTasbeeh( view: View){
        startActivity(Intent(this, TasbeehActivity::class.java))
    }
    fun goToAzkarAlmasaActivity( view: View){
        startActivity(Intent(this, AzkarAlmasaActivity::class.java))
    }
    fun goToAzkarAlestigazActivity( view: View){
        startActivity(Intent(this, AzkarAlestigazActivity::class.java))
    }
    fun goToAzkarAlnawomActivity( view: View){
        startActivity(Intent(this, AzkarAlnawomActivity::class.java))
    }
    fun goToDonationActivity( view: View){
        startActivity(Intent(this, DonationActivity::class.java))
    }
    fun goToAzkarAlsalah(view: View){
        startActivity(Intent(this, AzkarAlsalahActivity::class.java))
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                startActivity(Intent(this, SettingActivity::class.java))
                finish()
                true
            }
            R.id.contact_us -> {
                startActivity(Intent(this, ContactUsActivity::class.java))
                true
            }
            R.id.action_share ->{
                Toast.makeText(applicationContext,R.string.prompt_lang_selection, Toast.LENGTH_LONG).show()
                return true
            }
            R.id.action_exit ->{
                finish()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
