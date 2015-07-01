package com.siddhartha.com.multilanguage.activities;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.siddhartha.com.multilanguage.R;
import com.siddhartha.com.multilanguage.adapters.MyPagerAdapter;
import com.viewpagerindicator.CirclePageIndicator;

import java.util.Vector;

public class MainActivity extends Activity {
    private ViewPager viewPager;
    private Vector<View> pages;
    private LayoutInflater _layoutInflater;
    private View page1, page2, page3;
    private MyPagerAdapter adapter;
    private CirclePageIndicator pageIndicator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

      //  ActionBar a = getActionBar();
       // a.setBackgroundDrawable( new ColorDrawable(Color.BLUE));
        viewPager = (ViewPager) findViewById(R.id.view);
        _layoutInflater = getLayoutInflater();
        pages = new Vector<View>();

        page1 = _layoutInflater.inflate(R.layout.pageone_layout, null);
        page2 = _layoutInflater.inflate(R.layout.pagetwo_layout, null);
        page3 = _layoutInflater.inflate(R.layout.pagethree_layout, null);

        adapter = new MyPagerAdapter(pages,this);

        pages.add(page1);
        pages.add(page2);
        pages.add(page3);

        viewPager.setAdapter(adapter);

        pageIndicator = (CirclePageIndicator) findViewById(R.id.pagerIndicator);
        pageIndicator.setViewPager(viewPager);
        pageIndicator.setClickable(false);
        pageIndicator.setFocusable(false);
        pageIndicator.setRadius(18);

        pageIndicator.setPageColor(Color.argb(100, 0, 0, 0));
        pageIndicator.setFillColor(Color.argb(225,225,225,225));
        pageIndicator.setStrokeColor(Color.argb(0, 0, 0, 0));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
