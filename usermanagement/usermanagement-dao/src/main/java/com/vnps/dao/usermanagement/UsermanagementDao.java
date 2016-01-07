package com.vnps.dao.usermanagement;

import com.vnps.core.jpa.dao.AbstractDao;
import com.vnps.core.jpa.dao.DaoException;
import com.vnps.domain.usermanagement.User;

public class UsermanagementDao extends AbstractDao{

	public UsermanagementDao(String puName) throws DaoException {
		super(puName);
		// TODO Auto-generated constructor stub
	}
	
	public void addUser(User u) throws DaoException{
		save(u);
	}
	
	
}