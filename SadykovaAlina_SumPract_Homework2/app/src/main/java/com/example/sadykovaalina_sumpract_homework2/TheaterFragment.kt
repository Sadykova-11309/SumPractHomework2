package com.example.sadykovaalina_sumpract_homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.sadykovaalina_sumpract_homework2.databinding.FragmentChurchBinding
import com.example.sadykovaalina_sumpract_homework2.databinding.FragmentTheaterBinding

class TheaterFragment: Fragment(R.layout.fragment_theater) {

    private var binding: FragmentTheaterBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentTheaterBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}