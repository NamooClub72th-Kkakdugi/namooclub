package com.namoo.ns1.web.controller.club;

import java.io.IOException;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/club/clubCreateCheck.do")
public class ClubCreateCheckController extends HttpServlet{

	private static final long serialVersionUID = -6294726974519399084L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//

		String clubCategory = req.getParameter("clubCategory");
		String clubName = req.getParameter("clubName");
		String clubDescription = req.getParameter("clubDescription");
		String clubQuOne =  req.getParameter("clubQuOne");
		String clubQuTwo =  req.getParameter("clubQuTwo");
		String clubQuThree =  req.getParameter("clubQuThree");
		
		req.setAttribute("clubCategory", clubCategory);
		req.setAttribute("clubName", clubName);
		req.setAttribute("clubDescription", clubDescription);
		req.setAttribute("clubQuOne", clubQuOne);
		req.setAttribute("clubQuTwo", clubQuTwo);
		req.setAttribute("clubQuThree", clubQuThree);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/club/clubCreateCheck.jsp");
		dispatcher.forward(req, resp);
	}
}
