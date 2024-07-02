package com.example.sadykovaalina_sumpract_homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.sadykovaalina_sumpract_homework2.databinding.FragmentAddLocationBinding
import android.widget.Toast
import androidx.navigation.fragment.findNavController

class AddLocationFragment: Fragment(R.layout.fragment_add_location) {

    private var binding: FragmentAddLocationBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentAddLocationBinding.bind(view)


        binding?.run {
            buttonSend.setOnClickListener {
                val inputText = InputText.text.toString()

                if (inputText.isEmpty()) {
                    Toast.makeText(requireContext(), "Empty message, try again", Toast.LENGTH_SHORT)
                        .show()
                } else {
                    findNavController().navigate(
                        R.id.action_addLocationFragment_to_newLocationFragment,
                        Bundle().apply {
                            putString("message", inputText)
                        })
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}