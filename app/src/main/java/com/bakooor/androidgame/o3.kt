package com.bakooor.androidgame

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.RadioButton
import androidx.navigation.Navigation
import com.bakooor.androidgame.databinding.FragmentO3Binding
import com.bakooor.androidgame.databinding.FragmentTitleBinding


/**
 * A simple [Fragment] subclass.
 * Use the [o3.newInstance] factory method to
 * create an instance of this fragment.
 */
class o3 : Fragment() {
    lateinit var radioButton: RadioButton
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = com.bakooor.androidgame.databinding.FragmentO3Binding.inflate(inflater,container,false)

        binding.button.setOnClickListener {view:View->
            radioButton=binding.root.findViewById(binding.rg3.checkedRadioButtonId)
            var args = arguments?.let { o3Args.fromBundle(it) }
            var ch = args?.check
            if (radioButton.text != "android studio" || args?.check!=true){
                ch = false
            }
//            else if (radioButton.text != "android_studio"){
//                ch = false
//            }

            Log.d("````TAG````", "onCreateView: args $args")

            if (ch == true){
                Navigation.findNavController(view).navigate(R.id.action_o3_to_right2)
            }
            else{
                Navigation.findNavController(view).navigate(R.id.action_o3_to_falseFragment)
            }
        }
        return binding.root
    }
}