package com.tito.camp22quiz.ui.fragments.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.viewbinding.ViewBinding
import com.tito.camp22quiz.model.Inflate

abstract class AdapterBaseClass<VB: ViewBinding>(private val inflate: Inflate<VB>):
    RecyclerView.Adapter<AdapterBaseClass<VB>.ViewHolder>() {
    inner class ViewHolder(val binding: VB): RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = inflate.invoke(inflater, parent, false)
        return ViewHolder(binding)
    }
}