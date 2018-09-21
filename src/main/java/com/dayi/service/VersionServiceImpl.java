package com.dayi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayi.entity.Version;

import com.dayi.mapper.VersionMapper;

@Service
public class VersionServiceImpl implements VersionService {

	@Autowired
	VersionMapper versionMapper;
	
	@Override
	public Version getVersion(int vid) {
		return versionMapper.getVersion(vid);
	}


}
