package com.namoo.ns1.web.controller.club;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

@WebServlet("/club/clubCreateInput.do")
public class ClubCreateInputController extends HttpServlet{

	private static final long serialVersionUID = -5423068621780728595L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		String cmId = req.getParameter("cmId");
		
		String communityName = service.findCommunity(cmId).getName();
		String description = service.findCommunity(cmId).getDescription();
		req.setAttribute("communityName", communityName);
		req.setAttribute("description", description);
		req.setAttribute("cmId", cmId);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/club/clubCreateInput.jsp");
		dispatcher.forward(req, resp);
	}
	
	
	
	

}
