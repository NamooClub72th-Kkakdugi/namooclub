package com.namoo.ns1.web.controller.club;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.ClubService;
import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

import dom.entity.Club;
import dom.entity.Community;
import dom.entity.SocialPerson;

@WebServlet("/club/clubList.do")
public class ClubListController extends HttpServlet{

	private static final long serialVersionUID = 8429308006701253816L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		ClubService service = NamooClubServiceFactory.getInstance().getClubService();
		CommunityService comService = NamooClubServiceFactory.getInstance().getCommunityService();
		SocialPerson person = (SocialPerson) req.getSession().getAttribute("loginUser");
		
		String email = person.getEmail();
		String name = req.getParameter("name");
		String cmId = req.getParameter("cmId");
		
		Community community = comService.findCommunity(cmId);
		String communityName = community.getName();
		String description = community.getDescription();
		
		List<Club> allClubs = service.findAllClubs();
		List<Club> joinClubs = service.findBelongclubs(email);
		
		for (Club allClub : allClubs) {
			
		}
		
		req.setAttribute("allClubs", allClubs);
		req.setAttribute("communityName", communityName);
		req.setAttribute("description", description);
		req.setAttribute("cmId", cmId);
		req.setAttribute("name", name);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/club/clubList.jsp");
		dispatcher.forward(req, resp);
	}
}
