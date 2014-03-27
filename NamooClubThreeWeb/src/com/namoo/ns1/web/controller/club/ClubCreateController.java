package com.namoo.ns1.web.controller.club;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.ClubService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

@WebServlet("/club/clubCreate.do")
public class ClubCreateController extends HttpServlet{

	private static final long serialVersionUID = 4827189201539721388L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		ClubService service = NamooClubServiceFactory.getInstance().getClubService();
		
		
		String clubCategory = req.getParameter("clubCategory");
		String clubName = req.getParameter("clubName");
		String clubDescription = req.getParameter("clubDescription");
		String clubQuOne = req.getParameter("clubQuOne");
		String clubQuTwo = req.getParameter("clubQuTwo");
		String clubQuThree = req.getParameter("clubQuThree");

	
		
		
	}
}
