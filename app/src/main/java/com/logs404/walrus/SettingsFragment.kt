package com.logs404.walrus


import android.content.SharedPreferences
import android.os.Bundle

import androidx.preference.PreferenceFragmentCompat


class SettingsFragment : PreferenceFragmentCompat() {
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.prefrences, rootKey)
        sharedPreferences = preferenceScreen.sharedPreferences!!
    }
    fun readPreferences() {
        val enableNotifications = sharedPreferences.getBoolean("enable_notifications", true)
        val serverAddress = sharedPreferences.getString("server_address", "https://example.com")
        // Use the preference values here
    }
}
