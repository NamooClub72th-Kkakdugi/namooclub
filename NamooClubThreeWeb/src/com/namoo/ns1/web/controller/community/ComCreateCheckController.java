package com.namoo.ns1.web.controller.community;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.web.controller.shared.LoginRequired;

@WebServlet("/community/comCreateCheck.do")
@LoginRequired
public class ComCreateCheckController extends HttpServlet{

	private static final long serialVersionUID = 6748757820209095647L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		String communityName = req.getParameter("communityName");
		String description = req.getParameter("description");
		
		req.setAttribute("communityName", communityName);
		req.setAttribute("description", description);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/community/comCreateCheck.jsp");
		dispatcher.forward(req, resp);
	}

	
}
