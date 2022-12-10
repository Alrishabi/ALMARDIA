package com.alnafs_almardia.helpers

import android.content.Context
import android.content.SharedPreferences
import android.view.Gravity
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import com.alnafs_almardia.R
import java.util.*

/**
CREATED BY MUSAB ON 05/12/2022
 * */

private const val PREF_NAME = "MardiaSession"

class Zaytona(context: Context) {

    private val preferences = context.getSharedPreferences(PREF_NAME, Context.MODE_PRIVATE)
    val editor: SharedPreferences.Editor = preferences.edit()

    fun getValueOfKey(key: String?): String? {
        var value = ""
        value = preferences.getString(key, "").toString()
        if (value == "") {
            value = ""
        }
        return value
    }


    fun setValueToKey(key: String,value: String) {
        editor.putString(key, value).apply()
        editor.commit()
    }

//    fun musabToast(msg: String?, mode: String, type: String) {
//        if (mode == "1" || mode == "0") {
//            //Toast.makeText(activity,msg,Toast.LENGTH_SHORT).show();
//
//            // Get the custom layout view.
//            val toastView: View = activity.getLayoutInflater().inflate(R.layout.custom_toast, null)
//            val message = toastView.findViewById<View>(R.id.message) as TextView
//            val toast_container = toastView.findViewById<View>(R.id.toast_container) as LinearLayout
//            toast_container.setBackgroundResource(R.drawable.toast_info_shape)
//            if (type.lowercase(Locale.getDefault()).trim { it <= ' ' } == "i") {
//                toast_container.setBackgroundResource(R.drawable.toast_info_shape)
//            }
//            if (type.lowercase(Locale.getDefault()).trim { it <= ' ' } == "s") {
//                toast_container.setBackgroundResource(R.drawable.toast_success_shape)
//            }
//            if (type.lowercase(Locale.getDefault()).trim { it <= ' ' } == "w") {
//                toast_container.setBackgroundResource(R.drawable.toast_warning_shape)
//            }
//            if (type.lowercase(Locale.getDefault()).trim { it <= ' ' } == "d") {
//                toast_container.setBackgroundResource(R.drawable.toast_denger_shape)
//            }
//            message.text = msg
//
//            // Initiate the Toast instance.
//            val toast = Toast(activity.getApplicationContext())
//            // Set custom view in toast.
//            toast.setView(toastView)
//            toast.duration = Toast.LENGTH_SHORT
//            toast.setGravity(Gravity.CENTER, 0, 0)
//            toast.show()
//        }
//    }


}