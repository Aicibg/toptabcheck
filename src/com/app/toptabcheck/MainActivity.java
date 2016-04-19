package com.app.toptabcheck;

import java.util.ArrayList;
import java.util.List;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.HorizontalScrollView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.LayoutParams;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class MainActivity extends FragmentActivity {
    private HorizontalScrollView hsvScrollView;
    private RadioGroup radiogroup=null;
    private ViewPager viewPage;
    private ArrayList<Fragment> fragments=new ArrayList<Fragment>();
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		initTab();
		initPage();
		
		PageFragmentAdapter adapter=new PageFragmentAdapter(getSupportFragmentManager(), fragments);
		viewPage.setAdapter(adapter);
		
		viewPage.addOnPageChangeListener(new OnPageChangeListener() {
			@Override
			public void onPageSelected(int arg0) {
				setTab(arg0);
			}
			
			@Override
			public void onPageScrolled(int arg0, float arg1, int arg2) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onPageScrollStateChanged(int arg0) {
				// TODO Auto-generated method stub
				
			}
		});
		
		radiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				viewPage.setCurrentItem(checkedId);
			}
		});
		radiogroup.check(0);
	}
	
	protected void setTab(int arg0) {
		RadioButton rb=(RadioButton) radiogroup.getChildAt(arg0);
		rb.setChecked(true);
		int left=rb.getLeft();
		int width=rb.getMeasuredWidth();
		DisplayMetrics metrics=new DisplayMetrics();
		getWindowManager().getDefaultDisplay().getMetrics(metrics);
		int screenWidth=metrics.widthPixels;
		int len=left+width/2-screenWidth/2;
		hsvScrollView.smoothScrollTo(len, 0);
	}

	private void initPage() {
		List<Channel> channelList=ChannelDb.getchannelSelect();
		for(int i=0;i<channelList.size();i++){
			NewsFragment fragment=new NewsFragment();
			Bundle bundle=new Bundle();
			bundle.putString("weburl", channelList.get(i).getUrl());
			bundle.putString("name", channelList.get(i).getName());
			fragment.setArguments(bundle);
			fragments.add(fragment);
		}
	}

	private void initTab() {
		List<Channel> channelList=ChannelDb.getchannelSelect();
		for(int i=0;i<channelList.size();i++){
			RadioButton rb=(RadioButton) LayoutInflater.from(this).inflate(R.layout.tab_rb, null);
			rb.setId(i);
			rb.setText(channelList.get(i).getName());
			RadioGroup.LayoutParams params=new LayoutParams(LayoutParams.WRAP_CONTENT, LayoutParams.WRAP_CONTENT);
			radiogroup.addView(rb);
		}
	}

	private void initView() {
		hsvScrollView=(HorizontalScrollView) findViewById(R.id.hsv_ScrollView);
		radiogroup=(RadioGroup) findViewById(R.id.radiogroup);
		viewPage=(ViewPager) findViewById(R.id.vp_newslist);
	}

}
