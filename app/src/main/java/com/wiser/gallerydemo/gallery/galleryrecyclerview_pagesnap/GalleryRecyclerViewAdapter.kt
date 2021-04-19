package com.wiser.gallerydemo.gallery.galleryrecyclerview_pagesnap

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.wiser.gallerydemo.R

class GalleryRecyclerViewAdapter(var list: MutableList<Int>) : RecyclerView.Adapter<GalleryRecyclerViewAdapter.TestHolder>() {

    class TestHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivResource:AppCompatImageView? = null
        init {
            ivResource = itemView.findViewById(R.id.iv_resource)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestHolder {
        val holder =  TestHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_test, parent,false))
        return holder
    }

    override fun onBindViewHolder(holder: TestHolder, position: Int) {
        holder.ivResource?.setImageResource(list[position])
    }

    override fun getItemCount(): Int = list.size

}