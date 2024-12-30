package com.techfathers.mechanic_adda.ui.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.techfathers.mechanic_adda.R;

/**
 * Property of Techfathers, Inc @ 2022 All Rights Reserved.
 */

public class ServiceDetailsSliderAdapter extends PagerAdapter {

    private final Context mContext;
    private final Integer[] backgroundImages;

    public ServiceDetailsSliderAdapter(Context context, Integer[] introBackgrounds) {
        this.mContext = context;
        this.backgroundImages = introBackgrounds;
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.item_service_detail_slide, null);
        AppCompatImageView appCompatImageView = view.findViewById(R.id.img_view_logo);
        appCompatImageView.setImageResource(backgroundImages[position]);
        ViewPager viewPager = (ViewPager) container;
        viewPager.addView(view, 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        ViewPager viewPager = (ViewPager) container;
        View view = (View) object;
        viewPager.removeView(view);
    }
}
