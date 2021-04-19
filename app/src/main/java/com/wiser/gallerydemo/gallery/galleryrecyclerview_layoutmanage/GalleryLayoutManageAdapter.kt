package com.wiser.gallerydemo.gallery.galleryrecyclerview_layoutmanage

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.recyclerview.widget.RecyclerView
import com.wiser.gallerydemo.R

class GalleryLayoutManageAdapter(var list: MutableList<Int>) : RecyclerView.Adapter<GalleryLayoutManageAdapter.TestHolder>() {

    class TestHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var ivResource:AppCompatImageView? = null
        init {
            ivResource = itemView.findViewById(R.id.iv_resource)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TestHolder {
        val holder =  TestHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.item_test,
                parent,
                false
            )
        )
        val width = parent.context?.resources?.displayMetrics?.widthPixels ?: 0
        holder.itemView.layoutParams.width = width / 3 - dp2px(parent.context,20f)
        holder.itemView.layoutParams.height = (holder.itemView.layoutParams.width * 1.25f).toInt()
        return holder
    }

    override fun onBindViewHolder(holder: TestHolder, position: Int) {
        holder.ivResource?.setImageResource(list[position])
    }

    override fun getItemCount(): Int = list.size

    fun dp2px(context: Context, dpValue: Float): Int {
        val scale: Float = context.resources.displayMetrics.density
        return (dpValue * scale + 0.5f).toInt()
    }
}