package com.tito.camp22quiz.ui.fragments

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import android.view.View
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.tito.camp22quiz.databinding.FragmentVersesChildBinding
import com.tito.camp22quiz.model.BaseFragment
import com.tito.camp22quiz.model.Verse
import com.tito.camp22quiz.ui.fragments.adapters.VersesRecyclerAdapter

class VersesChildFragment(private val currentPosition: Int? = null):
    BaseFragment<FragmentVersesChildBinding>(FragmentVersesChildBinding::inflate) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        sharedViewModel.version.observe(viewLifecycleOwner){
            swapAdapter(sharedViewModel.currentChapterPosition.value!!, it.versionName)
        }
        sharedViewModel.currentChapterPosition.observe(viewLifecycleOwner){
            swapAdapter(it, sharedViewModel.version.value!!.versionName)
        }
    }

    private fun swapAdapter(chapterPosition: Int, versionName: String){
        val newAdapter = VersesRecyclerAdapter(chapterPosition, versionName)
        var isNewAdapterDifferentFromOldAdapter = true

        binding.rvVerses.adapter?.let{
            val currentAdapter = it as VersesRecyclerAdapter
            isNewAdapterDifferentFromOldAdapter = newAdapter.currentChapterPosition != currentAdapter.currentChapterPosition
                    || newAdapter.version != currentAdapter.version
        }

        if (isNewAdapterDifferentFromOldAdapter){
            binding.rvVerses.swapAdapter(
                newAdapter, false
            )
        }
    }


    override fun onResume() {
        super.onResume()
        Handler(Looper.getMainLooper()).postDelayed({
            currentPosition?.let{
                (binding.rvVerses.layoutManager as LinearLayoutManager)
                    .scrollToPositionWithOffset(it, 0)
            }
        }, 200)

    }
}