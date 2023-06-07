
package com.alnafs_almardia
import android.content.Intent
import android.content.pm.PackageInfo
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import android.view.WindowManager
import android.widget.MediaController
import android.widget.TextView
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity
import com.alnafs_almardia.helpers.Zaytona
import java.util.*

/**
 * Created by Musab on 27/11/2022.
 */

class SplashActivity : AppCompatActivity() {
    lateinit var zaytona:Zaytona
    var pinfo: PackageInfo? = null
    var vv_splash: VideoView?= null
    var mediaControls: MediaController?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        zaytona= Zaytona(this)
        vv_splash = findViewById<View>(R.id.vv_splash) as VideoView


       if (mediaControls == null) {
           // creating an object of media controller class
           mediaControls = MediaController(this)
           // set the anchor view for the video view
           mediaControls!!.setAnchorView(this.vv_splash)
       }
       // set the media controller for video view
       vv_splash!!.setMediaController(mediaControls)
       // set the absolute path of the video file which is going to be played
       vv_splash!!.setVideoURI(Uri.parse("android.resource://"
               + packageName + "/" + R.raw.mardia_splash))
       vv_splash!!.requestFocus()
       // starting the video
       vv_splash!!.start()

        val version_name = findViewById<TextView>(R.id.version_name)

        // This is used to hide the status bar and make
        // the splash screen as a full screen activity.
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )

        try {
            pinfo = packageManager.getPackageInfo(packageName, 0)
        } catch (e: PackageManager.NameNotFoundException) {
            e.printStackTrace()
        }

        version_name.text = getVersionName()
        if(zaytona.getValueOfKey("app_language").equals("en")){
            val locale =  Locale("en");
            Log.i("setLocal", "setLocale: ")
            Log.i("language", "en")
            Locale.setDefault(locale);
            val resources = this.getResources();
            val config = resources.getConfiguration();
            config.setLocale(locale);
            resources.updateConfiguration(config, resources.getDisplayMetrics());
            zaytona.setValueToKey("app_language","en")
        }else if(zaytona.getValueOfKey("app_language").equals("ar")){
            val locale =  Locale("ar");
            Log.i("setLocal", "setLocale: ")
            Log.i("language", "ar")
            Locale.setDefault(locale);
            val resources = this.getResources();
            val config = resources.getConfiguration();
            config.setLocale(locale);
            resources.updateConfiguration(config, resources.getDisplayMetrics());
            zaytona.setValueToKey("app_language","ar")
        }else{
            val locale =  Locale("ar");
            Log.i("setLocal", "setLocale: ")
            Log.i("language", "ar")
            Locale.setDefault(locale);
            val resources = this.getResources();
            val config = resources.getConfiguration();
            config.setLocale(locale);
            resources.updateConfiguration(config, resources.getDisplayMetrics());
            zaytona.setValueToKey("app_language","ar")
        }

        // Handler().postDelayed({
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, 6000) // 3000 is the delayed time in milliseconds.

    }
    fun getVersionName(): String? {
        try {
            pinfo?.let { zaytona.setValueToKey("versionName", it.versionName) }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return pinfo?.versionName
    }
}

