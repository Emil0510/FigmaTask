package com.emilabdurahmanli.zireddinapplication.core.bottom_navigation_fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.emilabdurahmanli.zireddinapplication.R
import com.emilabdurahmanli.zireddinapplication.adapter.PalmistryRecyclerViewAdapter
import com.emilabdurahmanli.zireddinapplication.databinding.FragmentPalmistryBinding
import com.emilabdurahmanli.zireddinapplication.model.PalmistryModel


class PalmistryFragment : Fragment() {


    private lateinit var binding : FragmentPalmistryBinding
    private var list = mutableListOf<PalmistryModel>(
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
        PalmistryModel(R.drawable.profilephoto,"Aleyna"),
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentPalmistryBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.toolbar.backIV.visibility = View.GONE
        binding.toolbar.toolbarText.setText("Palmistry")
        binding.recyclerView.layoutManager = LinearLayoutManager(view.context,LinearLayoutManager.VERTICAL,false)
        binding.recyclerView.adapter = PalmistryRecyclerViewAdapter(list)

    }


}