package com.namoo.ns1.web.controller.club;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;
import com.namoo.ns1.web.controller.shared.DefaultController;
import com.namoo.ns1.web.controller.shared.LoginRequired;

@WebServlet("/club/clubCreateCheck.do")
@LoginRequired
public class ClubCreateCheckController extends DefaultController{

	private static final long serialVersionUID = -6294726974519399084L;

	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
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
