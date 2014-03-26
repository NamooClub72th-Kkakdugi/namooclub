package com.namoo.ns1.web.controller.community;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;
import com.namoo.ns1.web.controller.shared.ForwardCommonController;

import dom.entity.SocialPerson;

@WebServlet("/community/comCreate.do")
public class ComCreateController extends ForwardCommonController{

	private static final long serialVersionUID = -769132475582817366L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		SocialPerson person = (SocialPerson) req.getSession().getAttribute("loginUser");
		String email = person.getEmail();
		String communityName = req.getParameter("communityName");
		String description = req.getParameter("description");
		
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		service.registCommunity(communityName, description, email);
		
		redirect(req, resp, "/community/comList.do");
	}
	
	

}
