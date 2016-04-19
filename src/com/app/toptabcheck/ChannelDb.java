package com.app.toptabcheck;

import java.util.ArrayList;
import java.util.List;

public class ChannelDb {
   public static List<Channel> channelSelect=new ArrayList<Channel>();
   static{
	   channelSelect.add(new Channel("头条", "http://www.baidu.com"));
	   channelSelect.add(new Channel("娱乐", "http://www.baidu.com"));
	   channelSelect.add(new Channel("体育", "http://www.baidu.com"));
	   channelSelect.add(new Channel("财经", "http://www.baidu.com"));
	   channelSelect.add(new Channel("热点", "http://www.baidu.com"));
	   channelSelect.add(new Channel("科技", "http://www.baidu.com"));
	   channelSelect.add(new Channel("数码", "http://www.baidu.com"));
	   channelSelect.add(new Channel("社会", "http://www.baidu.com"));
	   channelSelect.add(new Channel("国际", "http://www.baidu.com"));
   }
   
   public static List<Channel> getchannelSelect(){
	   return channelSelect;
   }
}
