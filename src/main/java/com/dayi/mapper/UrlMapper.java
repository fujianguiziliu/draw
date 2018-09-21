package com.dayi.mapper;



import org.springframework.stereotype.Repository;

import com.dayi.entity.Url;

@Repository
public interface UrlMapper {
//	public List<Url> getUrl();
	public Url getSomeVersion(Integer urlversion);
}
