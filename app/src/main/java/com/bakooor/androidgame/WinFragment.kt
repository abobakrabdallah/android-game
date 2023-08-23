package com.bakooor.androidgame

import android.content.Intent
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.core.app.ShareCompat
import androidx.navigation.fragment.findNavController
import com.bakooor.androidgame.databinding.FragmentWinBinding

@Suppress("DEPRECATION")
class WinFragment : Fragment() {

    private lateinit var binding: FragmentWinBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentWinBinding.inflate(inflater, container, false)

        binding.button3.setOnClickListener {
            findNavController().navigate(R.id.action_right2_to_q1)
        }

       setHasOptionsMenu(true)

        return binding.root
    }
    @Deprecated("Deprecated in Java")
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.winmenu, menu)
    }
    private fun getShareIntent(): Intent {
        return ShareCompat.IntentBuilder(requireContext()).setText(
            getString(R.string.share_success_text)
        )
            .setType("text/plain")
            .intent
    }

    private fun shareSuccess() {
        startActivity(getShareIntent())
    }

    @Deprecated("Deprecated in Java")
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.miShare -> shareSuccess()
        }
//        return super.onOptionsItemSelected(item)
        return true
    }
}