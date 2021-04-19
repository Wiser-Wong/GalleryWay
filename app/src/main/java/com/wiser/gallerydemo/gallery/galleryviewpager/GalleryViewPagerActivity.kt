package com.wiser.gallerydemo.gallery.galleryviewpager

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.wiser.gallerydemo.R
import kotlinx.android.synthetic.main.activity_gallery_viewpager.*

class GalleryViewPagerActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery_viewpager)

        val list = mutableListOf<Fragment>()
        list.add(GalleryViewPagerFragment.createFragment(R.drawable.icon_1))
        list.add(GalleryViewPagerFragment.createFragment(R.drawable.icon_2))
        list.add(GalleryViewPagerFragment.createFragment(R.drawable.icon_3))
        list.add(GalleryViewPagerFragment.createFragment(R.drawable.icon_4))
        list.add(GalleryViewPagerFragment.createFragment(R.drawable.icon_5))
        vp_gallery?.adapter = GalleryViewPagerFragmentAdapter(supportFragmentManager, list)
    }

}