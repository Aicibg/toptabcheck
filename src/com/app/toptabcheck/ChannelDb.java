package com.app.toptabcheck;

import java.util.ArrayList;
import java.util.List;

public class ChannelDb {
   public static List<Channel> channelSelect=new ArrayList<Channel>();
   static{
	   channelSelect.add(new Channel("ͷ��", "http://www.baidu.com"));
	   channelSelect.add(new Channel("����", "http://www.baidu.com"));
	   channelSelect.add(new Channel("����", "http://www.baidu.com"));
	   channelSelect.add(new Channel("�ƾ�", "http://www.baidu.com"));
	   channelSelect.add(new Channel("�ȵ�", "http://www.baidu.com"));
	   channelSelect.add(new Channel("�Ƽ�", "http://www.baidu.com"));
	   channelSelect.add(new Channel("����", "http://www.baidu.com"));
	   channelSelect.add(new Channel("���", "http://www.baidu.com"));
	   channelSelect.add(new Channel("����", "http://www.baidu.com"));
   }
   
   public static List<Channel> getchannelSelect(){
	   return channelSelect;
   }
}
