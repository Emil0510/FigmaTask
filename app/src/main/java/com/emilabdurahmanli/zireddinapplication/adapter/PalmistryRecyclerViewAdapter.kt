package com.emilabdurahmanli.zireddinapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.emilabdurahmanli.zireddinapplication.databinding.FragmentMailBinding
import com.emilabdurahmanli.zireddinapplication.databinding.PalmistrySingleUserItemBinding
import com.emilabdurahmanli.zireddinapplication.model.PalmistryModel

class PalmistryRecyclerViewAdapter(var list : List<PalmistryModel>) :
    RecyclerView.Adapter<PalmistryRecyclerViewAdapter.ViewHolder>() {

    inner class ViewHolder(var binding:PalmistrySingleUserItemBinding): RecyclerView.ViewHolder(binding.root) {}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
      return ViewHolder(PalmistrySingleUserItemBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.palmistryNameText.setText(list[position].name)
        holder.binding.palmistryIV.setImageResource(list[position].image)

    }
}