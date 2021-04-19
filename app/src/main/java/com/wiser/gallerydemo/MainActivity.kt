package com.wiser.gallerydemo

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.wiser.gallerydemo.gallery.galleryrecyclerview_layoutmanage.GalleryLayoutManageActivity
import com.wiser.gallerydemo.gallery.galleryrecyclerview_pagesnap.GalleryRecyclerViewActivity
import com.wiser.gallerydemo.gallery.galleryviewpager.GalleryViewPagerActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun goGalleryLayoutManage(view: View) {
        startActivity(Intent(this, GalleryLayoutManageActivity::class.java))
    }
    fun goGalleryViewPager(view: View) {
        startActivity(Intent(this, GalleryViewPagerActivity::class.java))
    }
    fun goGalleryRecyclerView(view: View) {
        startActivity(Intent(this, GalleryRecyclerViewActivity::class.java))
    }
}