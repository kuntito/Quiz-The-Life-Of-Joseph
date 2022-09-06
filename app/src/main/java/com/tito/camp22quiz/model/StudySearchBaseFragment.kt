package com.tito.camp22quiz.model

import android.util.Log
import android.view.*
import androidx.appcompat.widget.PopupMenu
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.tito.camp22quiz.R
import com.tito.camp22quiz.ui.fragments.global_navigation.GlobalNavigation.goToHomeScreen
import com.tito.camp22quiz.ui.fragments.global_navigation.GlobalNavigation.goToSearchFragment
import com.tito.camp22quiz.ui.fragments.misc_functions.MiscFunctions.removeVersionFromString


abstract class StudySearchBaseFragment<VB: ViewBinding>(
    bindingInflateFunction: Inflate<VB>
): BaseFragment<VB>(bindingInflateFunction){
    private lateinit var rvVerses: RecyclerView

    override fun onResume() {
        super.onResume()
        sharedViewModel.version.observe(viewLifecycleOwner) {
            setActionBarTitle(
                "${removeVersionFromString(getActionBarTitle())} (${it.versionName})"
            )
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.study_search_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.mi_change_bible_version -> {
                val parentView = appCompatActivity.findViewById<View>(R.id.mi_change_bible_version)
                swapVersion()
//                getBibleVersionsPopupMenu(parentView).show()
                true
            }
            R.id.mi_home -> {
                goToHomeScreen(findNavController())
                true
            }
            R.id.mi_search -> {
                goToSearchFragment(findNavController())
                true
            }
            else ->  super.onOptionsItemSelected(item)
        }
    }

    private fun getCurrentVersion() = sharedViewModel.version.value

    private fun swapVersion(){
        when(getCurrentVersion()?.versionName){
            "KJV" -> sharedViewModel.setVersion("NIV")
            "NIV" -> sharedViewModel.setVersion("KJV")
        }
    }

/*
    private fun getBibleVersionsPopupMenu(parentView: View): PopupMenu{
        val wrapper = ContextThemeWrapper(requireContext(), R.style.popupMenuStyle)
        val bibleVersionPopupMenu = PopupMenu(wrapper, parentView)

        bibleVersionPopupMenu.menuInflater.inflate(R.menu.change_version_menu, bibleVersionPopupMenu.menu)
        bibleVersionPopupMenu.setOnMenuItemClickListener {
            when(it.itemId){
                R.id.mi_KJV ->{
                    sharedViewModel.setVersion(getString(R.string.kjv))
                    true
                }
                R.id.mi_NIV->{
                    sharedViewModel.setVersion(getString(R.string.niv))
                    true
                }
                else -> false
            }
        }
        return bibleVersionPopupMenu
    }
*/

}