package com.dayi.entity;

public class Url {
	private String urldetail;
	private Integer urlversion;
	public String getUrldetail() {
		return urldetail;
	}
	public void setUrldetail(String urldetail) {
		this.urldetail = urldetail;
	}
	public Integer getUrlversion() {
		return urlversion;
	}
	public void setUrlversion(Integer urlversion) {
		this.urlversion = urlversion;
	}
	public Url(String urldetail, Integer urlversion) {
		super();
		this.urldetail = urldetail;
		this.urlversion = urlversion;
	}
	public Url() {
		super();
	}
	@Override
	public String toString() {
		return "Url [urldetail=" + urldetail + ", urlversion=" + urlversion
				+ "]";
	}
	
}
