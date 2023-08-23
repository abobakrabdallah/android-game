package com.bakooor.androidgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.bakooor.androidgame.databinding.FragmentQ1Binding


/**
 * A simple [Fragment] subclass.
 * Use the [q1.newInstance] factory method to
 * create an instance of this fragment.
 */
class q1 : Fragment() {

    lateinit var radioButton: RadioButton
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentQ1Binding.inflate(inflater,container,false)



        binding.bsubmit1.setOnClickListener {view:View->

            radioButton = binding.root.findViewById(binding.rg1.checkedRadioButtonId)
            var ch = false
            if (radioButton.text == "xml"){

                ch = true
            }

           view.findNavController().navigate(q1Directions.actionQ1ToO2().setCheck(ch))



//
        }
        return binding.root
    }
}
//
//private fun RadioGroup.setOnCheckedChangeListener(function: () -> Unit) {
//
//}
