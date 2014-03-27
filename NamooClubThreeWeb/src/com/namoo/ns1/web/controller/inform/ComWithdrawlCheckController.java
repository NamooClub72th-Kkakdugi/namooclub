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
import com.namoo.ns1.web.controller.shared.LoginRequired;

import dom.entity.Community;



@WebServlet("/inform/comWithdrawlCheck.do")
@LoginRequired
public class ComWithdrawlCheckController extends HttpServlet {

	private static final long serialVersionUID = -1227231654372102688L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		String id = req.getParameter("id");
		req.setAttribute("id", id);
		req.setAttribute("name", req.getParameter("name"));
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		Community community = service.findCommunity(id);
		String communityName = community.getName();
		req.setAttribute("communityName", communityName);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/inform/comWithdrawlCheck.jsp");
		dispatcher.forward(req, resp);
	}
	
	

}
