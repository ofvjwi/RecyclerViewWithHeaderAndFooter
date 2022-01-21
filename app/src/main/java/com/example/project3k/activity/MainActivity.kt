package com.example.project3k.activity

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.project3k.R
import com.example.project3k.adapter.CustomAdapter
import com.example.project3k.model.Member
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var context: Context

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()

        refreshAdapter(prepareMemberList())

    }


    private fun initViews() {
        context = this
        recyclerView = main_recycler_view
        recyclerView.layoutManager = GridLayoutManager(context, 1)
    }

    private fun refreshAdapter(list: ArrayList<Member>) {
        val adapter = CustomAdapter(context, list)
        recyclerView.adapter = adapter
    }

    private fun prepareMemberList(): ArrayList<Member> {
        val list = ArrayList<Member>()

        list.add(Member("Header", "Header")) // this is for header item

        for (i in 1..30) {
            if (i % 5 == 0) {
                list.add(Member("Muhammadrizo", "Nurullaxo'jayev", true))
            } else {
                list.add(Member("Muhammadrizo", "Nurullaxo'jayev"))
            }
        }

        list.add(Member("Footer", "Footer")) // this is for footer item

        return list
    }
}



