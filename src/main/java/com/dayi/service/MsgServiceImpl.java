package com.dayi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayi.entity.Msg;
import com.dayi.mapper.MsgMapper;

@Service
public class MsgServiceImpl implements MsgService {

	@Autowired
	MsgMapper msgMapper;

	
	@Override
	public Msg getMsg(String msg) {
		return msgMapper.getMsg(msg);
	}

	

	
	

}
