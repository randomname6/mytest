package com.apple.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.apple.service.Service;



public class LoginServlet extends HttpServlet {
	private static Service service = new Service();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		try {
			boolean flag = service.find(username, password);
			if(flag) {
				response.getWriter().write("登录成功");
			}else {
				response.getWriter().write("登录失败");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("查找失败");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
