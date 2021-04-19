package com.wiser.gallerydemo.gallery.galleryviewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.wiser.gallerydemo.R
import kotlinx.android.synthetic.main.item_test.*

class GalleryViewPagerFragment: Fragment() {

    companion object {
        fun createFragment(id:Int): GalleryViewPagerFragment {
            val fragment = GalleryViewPagerFragment()
            val bundle = Bundle();
            bundle.putInt("id",id)
            fragment.arguments = bundle
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.item_vp_test,container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.getInt("id")?.let { iv_resource?.setImageResource(it) }
    }

}