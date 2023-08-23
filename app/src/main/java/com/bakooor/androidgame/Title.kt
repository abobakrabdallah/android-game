package com.bakooor.androidgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.bakooor.androidgame.databinding.FragmentTitleBinding


/**
 * A simple [Fragment] subclass.
 * Use the [Title.newInstance] factory method to
 * create an instance of this fragment.
 */
class Title : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTitleBinding.inflate(inflater,container,false)
        binding.b1.setOnClickListener{view:View->
            Navigation.findNavController(view).navigate(R.id.action_title2_to_q1)

        }

        return binding.root
    }


}