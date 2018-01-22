package com.apple.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import com.apple.utils.Utils;

public class Dao {
	public Object find(String username,String password) throws SQLException {
		QueryRunner	qr = new QueryRunner(Utils.getDataSource());
		String sql = "SELECT * FROM USER WHERE username=? AND upassword=?";
		Object obj = qr.query(sql, new ScalarHandler(), username,password);
		return obj;
	}
}
