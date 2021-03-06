package com.example.note.ui.home

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.note.R
import com.example.note.databinding.HomeFragmentBinding
import com.example.note.databinding.WelcomeFragmentBinding
import com.example.note.ui.welcome.WelcomeViewModel


class HomeFragment : Fragment() {

    private lateinit var binding: HomeFragmentBinding

    private lateinit var viewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate<HomeFragmentBinding>(inflater, R.layout.home_fragment, container, false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(HomeViewModel::class.java)



        binding.buttonNote.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_home_to_noteList)
        }

        binding.buttonWeb.setOnClickListener { view : View ->
            view.findNavController().navigate(R.id.action_home_to_web)
        }
    }

}
