package com.wiser.gallerydemo.gallery.galleryrecyclerview_layoutmanage

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.wiser.gallerydemo.R
import com.wiser.gallerydemo.gallery.CurveTransformer
import com.wiser.gallerydemo.gallery.ScaleTransformer
import kotlinx.android.synthetic.main.activity_gallery_layout_manage.*

class GalleryLayoutManageActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery_layout_manage)

        val galleryLayoutManager =
            GallerySmoothLayoutManager(
                GalleryLayoutManager.HORIZONTAL
            )
        galleryLayoutManager.attach(rlv_gallery)
        galleryLayoutManager.setItemTransformer(ScaleTransformer())
        rlv_gallery?.layoutManager = galleryLayoutManager
        rlv_gallery?.adapter = GalleryLayoutManageAdapter(getData())

        val galleryLayoutManager1 =
            GallerySmoothLayoutManager(
                GalleryLayoutManager.HORIZONTAL
            )
        galleryLayoutManager1.attach(rlv_gallery1)
        galleryLayoutManager1.setItemTransformer(CurveTransformer())
        rlv_gallery1?.layoutManager = galleryLayoutManager1
        rlv_gallery1?.adapter = GalleryLayoutManageAdapter1(getData())
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