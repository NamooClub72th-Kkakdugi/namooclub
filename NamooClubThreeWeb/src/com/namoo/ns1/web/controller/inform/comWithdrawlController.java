package com.namoo.ns1.web.controller.inform;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

import dom.entity.SocialPerson;

@WebServlet("/inform/comWithdrawl.do")
public class comWithdrawlController extends HttpServlet {

	private static final long serialVersionUID = -2515907141006105519L;

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
		
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		service.withdrawalCommunity(communityName, email);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/inform/comWithdrawl.jsp");
		dispatcher.forward(req, resp);
	}
	
	
	

}