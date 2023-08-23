package com.bakooor.androidgame

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.bakooor.androidgame.databinding.FragmentFalseBinding
import com.bakooor.androidgame.databinding.FragmentRightBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [falseFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class falseFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFalseBinding.inflate(inflater,container,false)
        binding.bBack.setOnClickListener {view:View->
            Navigation.findNavController(view).navigate(R.id.action_falseFragment_to_q1)
        }
        return binding.root
    }
}