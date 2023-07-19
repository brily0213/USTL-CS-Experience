package com.example.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.example.entity.News;

public interface NewsMapper {
	
	News findNewsById(long id);
	List<News> findNewsByCondition(@Param("offset") long offset,@Param("rows") int rows);
}
