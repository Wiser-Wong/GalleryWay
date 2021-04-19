package com.wiser.gallerydemo.gallery;

import android.view.View;

import com.wiser.gallerydemo.gallery.galleryrecyclerview_layoutmanage.GalleryLayoutManager;

/**
 * Created by chensuilun on 2016/12/16.
 */
public class ScaleTransformer implements GalleryLayoutManager.ItemTransformer {

    @Override
    public void transformItem(GalleryLayoutManager layoutManager, View item, float fraction) {
        item.setPivotX(item.getWidth() / 2.0f);
        item.setPivotY(item.getHeight()/2.0f);
        float scale = 1 - 0.13f * Math.abs(fraction);
        item.setScaleX(scale);
        item.setScaleY(scale);
    }
}