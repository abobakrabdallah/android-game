package com.bakooor.androidgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.bakooor.androidgame.databinding.FragmentFalseBinding

class FalseFragment : Fragment() {

    private lateinit var binding: FragmentFalseBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentFalseBinding.inflate(inflater,container,false)

        binding.bBack.setOnClickListener {view:View->
            Navigation.findNavController(view).navigate(R.id.action_falseFragment_to_q1)
        }
        return binding.root
    }
}