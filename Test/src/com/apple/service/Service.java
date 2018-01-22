package com.apple.service;

import java.sql.SQLException;

import com.apple.dao.Dao;

public class Service {
	private static Dao dao = new Dao();
	public boolean find(String username,String password) throws SQLException {
		Object obj = dao.find(username, password);
		if(obj == null) {
			return false;
		}
		int result = Integer.valueOf(obj.toString());
		if(result > 0) {
			return true;
		}
		return false;
	}
}
