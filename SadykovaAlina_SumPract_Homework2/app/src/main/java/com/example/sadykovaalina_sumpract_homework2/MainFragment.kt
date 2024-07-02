package com.example.sadykovaalina_sumpract_homework2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.sadykovaalina_sumpract_homework2.databinding.FragmentMainBinding

class MainFragment : Fragment(R.layout.fragment_main){

    private var binding: FragmentMainBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentMainBinding.bind(view)

        binding?.run {
            buttonAddLocation.setOnClickListener{
                findNavController().navigate(R.id.action_mainFragment_to_addLocationFragment)
            }
        }

        binding?.run {
            buttonCastle.setOnClickListener{
                findNavController().navigate(R.id.action_mainFragment_to_castleFragment2)
            }
        }

        binding?.run {
            buttonChurch.setOnClickListener{
                findNavController().navigate(R.id.action_mainFragment_to_churchFragment2)
            }
        }

        binding?.run {
            buttonRestaurant.setOnClickListener{
                findNavController().navigate(R.id.action_mainFragment_to_restaurantFragment2)
            }
        }

        binding?.run {
            buttonTheatre.setOnClickListener{
                findNavController().navigate(R.id.action_mainFragment_to_theaterFragment2)
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}

