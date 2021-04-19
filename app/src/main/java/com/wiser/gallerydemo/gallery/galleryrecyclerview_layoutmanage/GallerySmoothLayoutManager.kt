package com.wiser.gallerydemo.gallery.galleryrecyclerview_layoutmanage

import android.util.DisplayMetrics
import androidx.recyclerview.widget.RecyclerView

class GallerySmoothLayoutManager(orientation: Int): GalleryLayoutManager(orientation) {

    override fun smoothScrollToPosition(recyclerView: RecyclerView, state: RecyclerView.State?, position: Int) {
        val smoothScroller: GallerySmoothScroller = object : GallerySmoothScroller(recyclerView.context) {
            // 返回：滑过1px时经历的时间(ms)。
            override fun calculateSpeedPerPixel(displayMetrics: DisplayMetrics): Float {
                return 100f / displayMetrics.densityDpi
            }
        }
        smoothScroller.targetPosition = position
        startSmoothScroll(smoothScroller)
    }

}