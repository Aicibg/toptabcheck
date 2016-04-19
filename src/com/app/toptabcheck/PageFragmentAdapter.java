package com.app.toptabcheck;

import java.util.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class PageFragmentAdapter extends FragmentPagerAdapter{
    private List<Fragment> fragments;
    private FragmentManager fm;
   
	public PageFragmentAdapter(FragmentManager fm, List<Fragment> fragments
			) {
		super(fm);
		this.fragments = fragments;
		this.fm = fm;
	}

	@Override
	public Fragment getItem(int arg0) {
		// TODO Auto-generated method stub
		return fragments.get(arg0);
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return fragments.size();
	}

}
