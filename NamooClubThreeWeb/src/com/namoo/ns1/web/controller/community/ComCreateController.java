package com.namoo.ns1.web.controller.community;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;

@WebServlet("/community/comCreate.do")
public class ComCreateController extends HttpServlet{

	private static final long serialVersionUID = -769132475582817366L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		String email = req.getSession().getId();
		String communityName = req.getParameter("communityName");
		String description = req.getParameter("description");
		
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		service.registCommunity(communityName, description, email);
		
		resp.sendRedirect("./comList.do");
	}
	
	

}
