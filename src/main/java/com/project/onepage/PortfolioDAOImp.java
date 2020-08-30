package com.project.onepage;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.project.onepage.User;


@Repository
public class PortfolioDAOImp implements PortfolioDAO{
	
	@Autowired
	SqlSession sqlSession;

	private static final String JOINSQL="Employees.Join";

	@Override
	public void insertUser(User user) {
		// TODO Auto-generated method stub
		sqlSession.selectList(JOINSQL,user);
	}

}
