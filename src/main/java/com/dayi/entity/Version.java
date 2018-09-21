package com.dayi.entity;

public class Version {

	private Integer vid;
	private String umsg;

	public Version() {
		super();
	}

	public Version(Integer vid, String umsg) {
		super();
		this.vid = vid;
		this.umsg = umsg;
	}

	public Integer getVid() {
		return vid;
	}

	public void setVid(Integer vid) {
		this.vid = vid;
	}

	public String getUmsg() {
		return umsg;
	}

	public void setUmsg(String umsg) {
		this.umsg = umsg;
	}

	public Integer getVersion() {
		return vid;
	}

	public void setVersion(Integer version) {
		this.vid = version;
	}

	public Version(Integer version) {
		super();
		this.vid = version;
	}

	

	@Override
	public String toString() {
		return "Version [vid=" + vid + ", umsg=" + umsg + "]";
	}
	
	
}
