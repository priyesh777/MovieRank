package com.example.movierank

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.movierank.databinding.GetStartedScreenBinding
import com.example.movierank.databinding.MovieListScreenBinding

class MovieList : Fragment(R.layout.movie_list_screen) {

    private lateinit var binding: MovieListScreenBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = MovieListScreenBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.addButton.setOnClickListener {
            it.findNavController().navigate(R.id.navigate_to_add_new_movie)
        }
    }
}