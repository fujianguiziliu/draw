package com.dayi.entity;

public class Msg {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Msg(String msg) {
		super();
		this.msg = msg;
	}

	public Msg() {
		super();
	}

	@Override
	public String toString() {
		return "Msg [msg=" + msg + "]";
	}

	
	
}
