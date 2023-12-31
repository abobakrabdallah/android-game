package com.bakooor.androidgame

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import com.bakooor.androidgame.databinding.FragmentTitleBinding


/**
 * A simple [Fragment] subclass.
 * Use the [Title.newInstance] factory method to
 * create an instance of this fragment.
 */
@Suppress("DEPRECATION")
class Title : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentTitleBinding.inflate(inflater,container,false)
        binding.b1.setOnClickListener{view:View->
            Navigation.findNavController(view).navigate(R.id.action_title2_to_q1)

        }
        setHasOptionsMenu(true)

        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater?.inflate(R.menu.menuabout, menu)
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item!!,
        view!!.findNavController()
        ) || super.onOptionsItemSelected(item)
    }
}