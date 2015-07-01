package com.siddhartha.com.multilanguage.adapters;

import android.content.Context;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.Vector;

/**
 * Created by BLUEHORSE DEVLOPER on 7/1/2015.
 */
public class MyPagerAdapter extends PagerAdapter {

    Vector<View> pages;
  Context context;

    public MyPagerAdapter(Vector<View> pages, Context context) {
        this.pages = pages;
        this.context = context;
    }

    @Override
    public int getCount() {
        return pages.size();
    }

    @Override
    public Object instantiateItem(ViewGroup container, int position) {
        View page = pages.get(position);
        container.addView(page);
        return page;
    }

    @Override
    public void destroyItem(ViewGroup container, int position, Object object) {
        container.removeView(pages.get(position));
    }

    @Override
    public boolean isViewFromObject(View view, Object o) {
        return view.equals(o);
    }
}
