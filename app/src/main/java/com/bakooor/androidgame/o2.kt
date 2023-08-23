package com.bakooor.androidgame

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.bakooor.androidgame.databinding.FragmentO2Binding
import com.bakooor.androidgame.databinding.FragmentTitleBinding


class o2 : Fragment() {


    lateinit var radioButton: RadioButton
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,

        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentO2Binding.inflate(inflater,container,false)



        binding.b2.setOnClickListener {view:View->
            radioButton = binding.root.findViewById(binding.rg2.checkedRadioButtonId)
            var args = arguments?.let { o2Args.fromBundle(it) }
            var ch2 = false
            Log.d("````TAG````", "onCreateView: args $args")
            if (radioButton.text == "assmbley" && args?.check==true){

                ch2= true
            }
            else{
                ch2 = false
            }

            findNavController().navigate(o2Directions.actionO2ToO3().setCheck(ch2))
        }
        return binding.root
    }

}