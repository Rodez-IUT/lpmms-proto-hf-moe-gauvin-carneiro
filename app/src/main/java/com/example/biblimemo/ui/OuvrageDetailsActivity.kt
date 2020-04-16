package com.example.biblimemo.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.biblimemo.R

/**
 * Affiche les informations détaillées d'un ouvrage et permet de les modifier en activant
 * la modification.
 */
class OuvrageDetailsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ouvrage_details)

        // TODO consultation et modification d'un ouvrage (obtenu avec getExtra)
    }
}
