package com.example.biblimemo.ui.bibliotheque

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.biblimemo.R

/**
 * Ecran principal présentant la liste des ouvrages gérés par l'application.
 */
class BibliothequeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bibliotheque, container, false)
    }
}
