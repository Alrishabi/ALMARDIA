package com.alnafs_almardia.Activities

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.alnafs_almardia.R

/**
 * Created by Musab on 02/12/2022
 */

class ContactUsActivity : AppCompatActivity() {

    private val LINKEDIN_URL = "https://www.linkedin.com/in/alrishabi/"
    private val DEVELOPER_EMAIL = "musab.career@gmail.com"
    private val FACEBOOK_PAGE_ID = "alrishabi/"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_us)

        setTitle(R.string.action_contact_us)



        val linkedin=findViewById<ImageView>(R.id.linkedin)
        val gmail=findViewById<ImageView>(R.id.gmail)
        gmail.setOnClickListener(View.OnClickListener {
            try {
                val intent = Intent(
                    Intent.ACTION_SENDTO,
                    Uri.fromParts("mailto", DEVELOPER_EMAIL, null)
                )
                startActivity(
                    Intent.createChooser(
                        intent,
                        resources.getString(R.string.choose_email)
                    )
                )
            } catch (_: Exception) {
                Toast.makeText(applicationContext,R.string.email_exception,Toast.LENGTH_SHORT).show()
            }
        })
    }
    fun goToWebSite(v: View?) {
        startActivity(
            Intent(
                Intent.ACTION_VIEW,
                Uri.parse(LINKEDIN_URL)
            )
        )
    }
    fun LinkedinPageURL(context: Context): String? {
        val packageManager = context.packageManager
        return try {
            val versionCode =
                packageManager.getPackageInfo("com.linkedin.android", 0).versionCode
            if (versionCode >= 418111) { //newer versions of linkedin app
                "https://www.linkedin.com/feed/$LINKEDIN_URL"
            } else { //older versions of fb app
                "in://page/$FACEBOOK_PAGE_ID"
            }
        } catch (e: PackageManager.NameNotFoundException) {
            LINKEDIN_URL //normal web url
        }
    }


    fun goToLinkedin(v: View?) {
        val facebookIntent = Intent(Intent.ACTION_VIEW)
        val facebookUrl = LinkedinPageURL(this)
        facebookIntent.data = Uri.parse(facebookUrl)
        startActivity(facebookIntent)
    }
}