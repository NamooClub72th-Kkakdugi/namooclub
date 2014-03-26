package com.namoo.ns1.web.controller.community;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

import dom.entity.Community;
import dom.entity.SocialPerson;

@WebServlet("/community/comUnjoinList.do")
public class ComUnjoinedListController extends HttpServlet{

	private static final long serialVersionUID = -1275341252370187093L;

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
		List<Community> Allcommunities = service.findAllCommunities();
		List<Community> unjoinCommunities = new ArrayList<>();
		
		for (Community joinCommunity : joinCommunities) {
			Allcommunities.remove(joinCommunity);
		}
		unjoinCommunities.equals(Allcommunities);
		req.setAttribute("unjoinCommunities", unjoinCommunities);
		
		resp.sendRedirect("/WEB-INF/views/community/comList.jsp");
	}

	
}
