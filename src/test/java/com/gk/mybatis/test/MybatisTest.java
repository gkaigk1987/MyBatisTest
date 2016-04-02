package com.gk.mybatis.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.gk.mybatis.dao.UserDao;
import com.gk.mybatis.entity.User;
import com.gk.mybatis.entity.mapper.UserMapper;

public class MybatisTest {
	
	private SqlSession sqlSession = null;
	
	@Before
	public void init() throws IOException {
		Reader resourceAsReader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsReader);
		sqlSession = sqlSessionFactory.openSession();
	}

	@Test
	public void testCase1() {
//		UserDao userDao = sqlSession.getMapper(UserDao.class);
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);//生成UserMapper代理（实际是MapperProxy，其继承InvocationHandler）
		List<User> users = userMapper.getUserList();//代理调用，实际是反射调用MapperProxy的invoke方法
		System.out.println(users.size());
	}
	
	@After
	public void destroy() {
		if(sqlSession != null) {
			sqlSession.close();
		}
	}
	
}
