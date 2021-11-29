package com.christianrruiz.barichara.preference

import android.os.Bundle
import androidx.preference.PreferenceFragmentCompat
import com.christianrruiz.barichara.R

class SettingsFragment : PreferenceFragmentCompat() {

    override fun onCreatePreferences(savedInstanceState: Bundle?, rootKey: String?) {
        setPreferencesFromResource(R.xml.root_preferences, rootKey)
    }
}