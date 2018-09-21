package com.dayi.entity;

public class Article {
	private String content;
	private Integer version;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public Article(String content, Integer version) {
		super();
		this.content = content;
		this.version = version;
	}
	public Article() {
		super();
	}
	@Override
	public String toString() {
		return "Article [content=" + content + ", version=" + version + "]";
	}
	
	
	
}
