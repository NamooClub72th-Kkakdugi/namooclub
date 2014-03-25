package com.namoo.ns1.web.controller.community;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/community/comCreateInput.xhtml")
public class ComCreateInputController extends HttpServlet {

	private static final long serialVersionUID = -2467943640519332357L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/community/comCreateInput.jsp");
		dispatcher.forward(req, resp);
	}
	
	

}
