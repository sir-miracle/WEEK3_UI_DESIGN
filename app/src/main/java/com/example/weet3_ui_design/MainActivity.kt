package com.example.weet3_ui_design

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // calling the main xml file when the app launches


        if (AppCompatDelegate.getDefaultNightMode() == AppCompatDelegate.MODE_NIGHT_YES) {
            setTheme(R.style.Theme_WEET3_UI_DESIGN) //when dark mode is enabled, this makes the app use the dark theme settings
        } else {
            setTheme(R.style.Theme_WEET3_UI_DESIGN)  //default app theme which is the light mode is used here if the check for night mode is false
        }

        //using the switch to toggle between night mode and light mode

        var changeTheme = findViewById<Switch>(R.id.light_night_mode)
        changeTheme.setOnClickListener {
            if (changeTheme.isChecked) { //the if statement checks the state of the switch
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES) // if switch is checked, set mode to night mode
            } else {
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO) // set mode to light mode if the switch is not checked
            }
        }
    }
}