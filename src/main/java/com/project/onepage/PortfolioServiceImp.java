package com.project.onepage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PortfolioServiceImp implements PortfolioService {
	
	@Autowired
	 PortfolioDAO portfolioDAO;


	@Override
	public void joinuser(User user) {
		// TODO Auto-generated method stub
		portfolioDAO.insertUser(user);
		
	}



}
