package com.dayi.mapper;

import org.springframework.stereotype.Repository;

import com.dayi.entity.Version;

@Repository
public interface VersionMapper {
	
	public Version getVersion(int vid);
	
}
