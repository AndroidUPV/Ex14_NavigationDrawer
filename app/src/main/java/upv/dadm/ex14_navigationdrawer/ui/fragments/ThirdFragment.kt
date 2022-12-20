/*
 * Copyright (c) 2022
 * David de Andrés and Juan Carlos Ruiz
 * Development of apps for mobile devices
 * Universitat Politècnica de València
 */

package upv.dadm.ex14_navigationdrawer.ui.fragments

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import upv.dadm.ex14_navigationdrawer.R
import upv.dadm.ex14_navigationdrawer.databinding.FragmentMessageBinding

class ThirdFragment : Fragment(R.layout.fragment_message) {

    // Backing property to resource binding
    private var _binding: FragmentMessageBinding? = null

    // Property valid between onCreateView() and onDestroyView()
    private val binding
        get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        // Get the automatically generated view binding for the layout resource
        _binding = FragmentMessageBinding.bind(view)
        // Set the message for the current Fragment
        binding.tvMessage.setText(R.string.third_fragment_message)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        // Clear resources to make them eligible for garbage collection
        _binding = null
    }
}