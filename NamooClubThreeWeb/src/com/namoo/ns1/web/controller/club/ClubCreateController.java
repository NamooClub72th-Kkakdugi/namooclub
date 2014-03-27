package com.namoo.ns1.web.controller.club;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


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
//		SocialPerson person = (SocialPerson) req.getSession().getAttribute("loginUser");
//		String email = person.getEmail();
		
		String clubCategory = req.getParameter("clubCategory");
		String clubName = req.getParameter("clubName");
		String clubDescription = req.getParameter("clubDescription");
		String clubQuOne = req.getParameter("clubQuOne");
		String clubQuTwo = req.getParameter("clubQuTwo");
		String clubQuThree = req.getParameter("clubQuThree");
		
//		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
//		service.
		
//		redirect(req, resp, "/community/comList.do");
	}
	
	


}
