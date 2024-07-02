package com.example.sadykovaalina_sumpract_homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sadykovaalina_sumpract_homework2.databinding.FragmentNewLocationBinding

class NewLocationFragment: Fragment(R.layout.fragment_new_location) {

    private var binding: FragmentNewLocationBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentNewLocationBinding.bind(view)
        binding?.run{
            textView.text = arguments?.getString("message")
        }

        binding?.run {
            buttonBack.setOnClickListener{
                findNavController().navigate(R.id.action_newLocationFragment_to_mainFragment)
            }
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}