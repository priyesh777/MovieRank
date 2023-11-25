package com.example.movierank

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.movierank.databinding.EditMovieScreenBinding

class EditMovieScreen : Fragment(R.layout.edit_movie_screen) {
    private lateinit var binding: EditMovieScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = EditMovieScreenBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backButton.setOnClickListener {
            it.findNavController().navigate(R.id.navigate_back_to_movie_list_from_edit_movie)
        }
    }
}