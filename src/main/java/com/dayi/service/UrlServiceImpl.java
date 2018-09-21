package com.dayi.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayi.entity.Url;
import com.dayi.mapper.UrlMapper;

@Service
public class UrlServiceImpl implements UrlService {

	@Autowired
	UrlMapper urlMapper;
	
	@Override
	public Url getSomeVersion(Integer urlversion) {
		return urlMapper.getSomeVersion(urlversion);
	}

//	@Override
//	public List<Url> getUrl() {
//		return urlMapper.getUrl();
//	}
	

}
