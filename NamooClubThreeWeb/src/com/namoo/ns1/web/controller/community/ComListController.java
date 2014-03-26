package com.namoo.ns1.web.controller.community;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

import dom.entity.Community;
import dom.entity.SocialPerson;

@WebServlet("/community/comList.do")
public class ComListController extends HttpServlet{

	private static final long serialVersionUID = 2015998138536728657L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
	
		SocialPerson person = (SocialPerson) req.getSession().getAttribute("loginUser");
		String email = person.getEmail();
		
		List<Community> joinCommunities = service.findBelongCommunities(email);
		List<Community> allCommunities = service.findAllCommunities();

		for (Community joinCommunity : joinCommunities) {
			allCommunities.remove(joinCommunity);
		}
		req.setAttribute("allCommunities", allCommunities);
		req.setAttribute("joinCommunities", joinCommunities);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/community/comList.jsp");
		dispatcher.forward(req, resp);
	}
}
