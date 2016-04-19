package com.app.toptabcheck;

public class Channel {
    private String name;
    private String url;
    
	public Channel(String name, String url) {
		super();
		this.name = name;
		this.url = url;
	}
	public Channel() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		return "Channel [name=" + name + ", url=" + url + "]";
	}
    
}
