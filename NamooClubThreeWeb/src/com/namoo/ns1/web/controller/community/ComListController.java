package com.namoo.ns1.web.controller.community;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;
import com.namoo.ns1.web.controller.shared.DefaultController;
import com.namoo.ns1.web.controller.shared.LoginRequired;

import dom.entity.Community;
import dom.entity.SocialPerson;

@WebServlet("/community/comList.do")
@LoginRequired
public class ComListController extends DefaultController{

	private static final long serialVersionUID = 2015998138536728657L;



	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		
		SocialPerson person = (SocialPerson) req.getSession().getAttribute("loginUser");
		String email = person.getEmail();
		String name = person.getName();
		
		List<Community> joinCommunities = service.findBelongCommunities(email);
		List<Community> allCommunities = service.findAllCommunities();
		
		for (Community joinCommunity : joinCommunities) {
			allCommunities.remove(joinCommunity);
		}
		req.setAttribute("allCommunities", allCommunities);
		req.setAttribute("joinCommunities", joinCommunities);
		req.setAttribute("name", name);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/community/comList.jsp");
		dispatcher.forward(req, resp);
		
	}
}
