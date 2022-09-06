package com.tito.camp22quiz.ui.fragments

import android.os.Bundle
import android.view.*
import androidx.recyclerview.widget.GridLayoutManager
import com.google.android.flexbox.*
import com.tito.camp22quiz.R
import com.tito.camp22quiz.databinding.FragmentStudyBinding
import com.tito.camp22quiz.model.StudySearchBaseFragment
import com.tito.camp22quiz.ui.fragments.adapters.ChapterRecyclerAdapter
import com.tito.camp22quiz.ui.fragments.adapters.VersesRecyclerAdapter
import com.tito.camp22quiz.ui.fragments.misc_functions.MiscFunctions.hideSoftKeyboard


const val TAG = "Camp22 Quiz"
class StudyFragment : StudySearchBaseFragment<FragmentStudyBinding>(FragmentStudyBinding::inflate) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val flexboxLayoutManager = FlexboxLayoutManager(context).apply {
            justifyContent = JustifyContent.CENTER
            alignItems = AlignItems.CENTER
            flexDirection = FlexDirection.ROW
            flexWrap = FlexWrap.WRAP
        }
        binding.apply{
            rvStudyFragmentHome.adapter = ChapterRecyclerAdapter()
            rvStudyFragmentHome.layoutManager = flexboxLayoutManager
        }
    }

    override fun onResume() {
        super.onResume()
        hideSoftKeyboard(appCompatActivity)
    }

}