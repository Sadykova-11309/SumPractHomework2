package com.example.sadykovaalina_sumpract_homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.sadykovaalina_sumpract_homework2.databinding.FragmentChurchBinding

class ChurchFragment: Fragment(R.layout.fragment_church) {

    private var binding: FragmentChurchBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentChurchBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}