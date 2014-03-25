package com.namoo.ns1.web.controller.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/user/joinInput.xhtml")
public class joinInputController extends HttpServlet{

	private static final long serialVersionUID = 1038847539954106291L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/user/joinInput.jsp");
		dispatcher.forward(req, resp);
	}
}
