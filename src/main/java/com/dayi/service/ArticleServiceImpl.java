package com.dayi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dayi.entity.Article;
import com.dayi.mapper.ArticleMapper;

@Service
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	ArticleMapper articleMapper;
	@Override
	public Article getContent(Integer vid) {
		return articleMapper.getContent(vid);
	}

}
