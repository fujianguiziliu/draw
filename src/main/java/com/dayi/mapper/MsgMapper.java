package com.dayi.mapper;

import org.springframework.stereotype.Repository;

import com.dayi.entity.Msg;

@Repository
public interface MsgMapper {
	
	public Msg getMsg(String msg);
}
