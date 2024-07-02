package com.example.sadykovaalina_sumpract_homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.example.sadykovaalina_sumpract_homework2.databinding.FragmentCastleBinding

class CastleFragment : Fragment(R.layout.fragment_castle) {
    private var binding: FragmentCastleBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentCastleBinding.bind(view)
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}