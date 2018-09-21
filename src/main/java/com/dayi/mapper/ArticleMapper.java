package com.dayi.mapper;

import org.springframework.stereotype.Repository;

import com.dayi.entity.Article;


@Repository
public interface ArticleMapper {
	public Article getContent(int vid);
	
}
