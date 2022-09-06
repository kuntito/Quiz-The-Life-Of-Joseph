package com.tito.camp22quiz.model

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import androidx.viewbinding.ViewBinding
import com.tito.camp22quiz.R
import com.tito.camp22quiz.ui.fragments.global_navigation.GlobalNavigation.goToSearchFragment

typealias Inflate<X> = (LayoutInflater, ViewGroup?, Boolean) -> X

abstract class BaseFragment<VB: ViewBinding>(
    private val inflate: Inflate<VB>
): Fragment() {

    val sharedViewModel: SharedViewModel by activityViewModels()
    val appCompatActivity
        get() = activity as AppCompatActivity

    private var _binding: VB? = null
    val binding
        get() = _binding!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.search_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when(item.itemId){
            R.id.mi_search -> {
                goToSearchFragment(findNavController())
                true
            }
            else ->  super.onOptionsItemSelected(item)
        }
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = inflate.invoke(inflater, container, false)
        return binding.root
    }

    fun setActionBarTitle(someString: String){
        appCompatActivity.supportActionBar?.title = someString
    }

    fun getActionBarTitle() = appCompatActivity.supportActionBar?.title.toString()


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}