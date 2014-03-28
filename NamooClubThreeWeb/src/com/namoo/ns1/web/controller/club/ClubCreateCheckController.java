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
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		String cmId = req.getParameter("cmId");
		String communityName = service.findCommunity(cmId).getName();
		String description = service.findCommunity(cmId).getDescription();
		
		String name = req.getParameter("name");
		String clubCategory = req.getParameter("clubCategory");
		String clubName = req.getParameter("clubName");
		String clubDescription = req.getParameter("clubDescription");
		
		req.setAttribute("name", name);
		req.setAttribute("cmId", cmId);
		req.setAttribute("clubCategory", clubCategory);
		req.setAttribute("clubName", clubName);
		req.setAttribute("clubDescription", clubDescription);
		req.setAttribute("communityName", communityName);
		req.setAttribute("description", description);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/club/clubCreateCheck.jsp");
		dispatcher.forward(req, resp);
	}
}
