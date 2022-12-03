package com.alnafs_almardia.Activities
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import com.alnafs_almardia.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
    fun goToAzkarAlsabah( view: View){
        val intent = Intent(this, AzkarAlsabahActivity::class.java)
//        intent.putExtra("key", value)
        startActivity(intent)
    }
    fun goToAzkarAlmasjed( view: View){
        val intent = Intent(this, AzkarAlmasjedActivity::class.java)
//        intent.putExtra("key", value)
        startActivity(intent)
    }
    fun goToTasbeeh( view: View){
        val intent = Intent(this, TasbeehActivity::class.java)
//        intent.putExtra("key", value)
        startActivity(intent)
    }
    fun goToAzkarAlmasaActivity( view: View){
        val intent = Intent(this, AzkarAlmasaActivity::class.java)
//        intent.putExtra("key", value)
        startActivity(intent)
    }
    fun goToAzkarAlestigazActivity( view: View){
        val intent = Intent(this, AzkarAlestigazActivity::class.java)
//        intent.putExtra("key", value)
        startActivity(intent)
    }
    fun goToAzkarAlnawomActivity( view: View){
        val intent = Intent(this, AzkarAlnawomActivity::class.java)
//        intent.putExtra("key", value)
        startActivity(intent)
    }
    fun goToDonationActivity( view: View){
        val intent = Intent(this, DonationActivity::class.java)
//        intent.putExtra("key", value)
        startActivity(intent)
    }
    fun goToAzkarAlsalah(view: View){
        val intent = Intent(this, AzkarAlsalahActivity::class.java)
//        intent.putExtra("key", value)
        startActivity(intent)
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_settings -> {
                Toast.makeText(applicationContext, "click on setting", Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_share ->{
                Toast.makeText(applicationContext, "click on share", Toast.LENGTH_LONG).show()
                return true
            }
            R.id.action_exit ->{
                Toast.makeText(applicationContext, "click on exit", Toast.LENGTH_LONG).show()
                return true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}
