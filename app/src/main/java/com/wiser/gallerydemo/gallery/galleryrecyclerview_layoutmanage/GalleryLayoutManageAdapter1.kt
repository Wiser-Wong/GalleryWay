package com.wiser.gallerydemo.gallery.galleryrecyclerview_layoutmanage

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.wiser.gallerydemo.R

class GalleryLayoutManageAdapter1(var list: MutableList<Int>) : RecyclerView.Adapter<GalleryLayoutManageAdapter1.TestHolder>() {

    class TestHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivResource:AppCompatImageView? = null
        init {
            ivResource = itemView.findViewById(R.id.iv_resource)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestHolder {
        val holder =  TestHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_test, parent,false))
        val width = parent.context?.resources?.displayMetrics?.widthPixels ?: 0
        holder.itemView.layoutParams.width = width - 300
        return holder
    }

    override fun onBindViewHolder(holder: TestHolder, position: Int) {
        holder.ivResource?.setImageResource(list[position % list.size])
    }

    override fun getItemCount(): Int = Int.MAX_VALUE

}