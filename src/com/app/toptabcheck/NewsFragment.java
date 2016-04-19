package com.app.toptabcheck;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NewsFragment extends Fragment{
    private String channelname;
    private String weburl;
    private View view;
    private TextView tvContent;
    private Activity mactivity;
    @Override
    public void onAttach(Context context) {
    	// TODO Auto-generated method stub
    	super.onAttach(context);
    	this.mactivity=(Activity) context;
    	
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
    		Bundle savedInstanceState) {
//    	if(view==null){
//    		TextView tvText=new TextView(mactivity);
//    		tvText.setText(channelname);
//    		tvText.setTextSize(16);
//    		tvText.setGravity(Gravity.CENTER);
//    		tvText.setLayoutParams(new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT));
//    		view=tvText;
//    	}
//    	ViewGroup parent=(ViewGroup) view.getParent();
//    	if(parent!=null){
//    		parent.removeView(view);
//    	}
    	view=View.inflate(mactivity, R.layout.fragment, null);
    	tvContent=(TextView) view.findViewById(R.id.tv_content);
    	tvContent.setText(channelname+"\n"+weburl);
    	return view;
    }
    
    @Override
    public void setArguments(Bundle args) {
    	weburl=args.getString("weburl");
    	channelname=args.getString("name");
    }
}
