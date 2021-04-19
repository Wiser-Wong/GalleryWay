package com.wiser.gallerydemo.gallery.galleryrecyclerview_pagesnap

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import androidx.recyclerview.widget.RecyclerView
import com.wiser.gallerydemo.R
import kotlinx.android.synthetic.main.activity_gallery_layout_manage.*
import kotlin.math.abs

class GalleryRecyclerViewActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery_recyclerview)

        rlv_gallery?.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rlv_gallery?.adapter = GalleryRecyclerViewAdapter(getData())

        PagerSnapHelper().attachToRecyclerView(rlv_gallery)
        rlv_gallery?.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                super.onScrolled(recyclerView, dx, dy)
                val childCount = recyclerView.childCount;
                for (i in (0 until childCount)) {
                    val child = recyclerView.getChildAt(i)
                    val left = child.left
                    val paddingStart = recyclerView.paddingStart
                    // 遍历recyclerView子项，以中间项左侧偏移量为基准进行缩放
                    val bl = 1f.coerceAtMost(abs(left - paddingStart) * 1f / child.width)
                    val scale = 1f - bl * (1f - 0.8f)
                    child.scaleY = scale
                }
            }
        })
    }

    private fun getData(): MutableList<Int> {
        val list = mutableListOf<Int>()
        list.add(R.drawable.icon_1)
        list.add(R.drawable.icon_2)
        list.add(R.drawable.icon_3)
        list.add(R.drawable.icon_4)
        list.add(R.drawable.icon_5)
        return list
    }

}