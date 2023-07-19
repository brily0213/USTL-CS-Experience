package com.example.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.example.dao.NewsMapper;
import com.example.entity.DataWrapper;
import com.example.entity.News;
import com.example.utils.MyBatisUtils;

public class NewsService {
	public DataWrapper findNewsByCondition(int page,int rows) {
		DataWrapper dataWrapper=new DataWrapper();
		long offset=(page-1)*rows;
		SqlSessionFactory sqlSessionFactory = MyBatisUtils.sqlSessionFactoryInstance();
		try(SqlSession session = sqlSessionFactory.openSession()){
			NewsMapper mapper = session.getMapper(NewsMapper.class);
			List<News> newsList = mapper.findNewsByCondition(offset, rows);
			dataWrapper.setData(newsList);
			//TODO 获取新闻总页数，请同学们思考完成。
			dataWrapper.setTotalPage(6);
		}
		return dataWrapper;
	}
}
