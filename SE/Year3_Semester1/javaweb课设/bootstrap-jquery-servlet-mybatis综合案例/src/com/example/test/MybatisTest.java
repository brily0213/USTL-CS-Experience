package com.example.test;

import static org.junit.Assert.*;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.example.dao.NewsMapper;
import com.example.entity.News;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class MybatisTest {

	@Test
	public void testConnDB() {

		Connection conn = null;

		try {
			conn = DriverManager
					.getConnection("jdbc:mysql://localhost/test?user=root&password=Wjmysql123321&serverTimezone=GMT");
			PreparedStatement ps = conn.prepareStatement("select * from news");
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println(rs.getString("title"));
			}

		} catch (SQLException ex) {
			System.out.println("SQLException: " + ex.getMessage());
			System.out.println("SQLState: " + ex.getSQLState());
			System.out.println("VendorError: " + ex.getErrorCode());
		}
	}
	@Test
	public void testMybatisConn() throws Exception {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		try(SqlSession session = sqlSessionFactory.openSession()){
			NewsMapper mapper = session.getMapper(NewsMapper.class);
			System.out.println(mapper.findNewsById(1l).getTitle());
		}
	}
	@Test
	public void testMybatisPagination() throws Exception {
		String resource = "mybatis-config.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		try(SqlSession session = sqlSessionFactory.openSession()){
			NewsMapper mapper = session.getMapper(NewsMapper.class);
			List<News> newsList = mapper.findNewsByCondition(1, 1);
			System.out.println(newsList.size());
			System.out.println(newsList.get(0).getTitle());
		}
	}

}
