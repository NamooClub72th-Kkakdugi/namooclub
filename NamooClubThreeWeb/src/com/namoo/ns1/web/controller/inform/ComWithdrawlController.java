package com.namoo.ns1.web.controller.inform;

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

import dom.entity.SocialPerson;

@WebServlet("/inform/comWithdrawl.do")
@LoginRequired
public class ComWithdrawlController extends DefaultController {

	private static final long serialVersionUID = -2515907141006105519L;

	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 
		SocialPerson person = (SocialPerson) req.getSession().getAttribute("loginUser");
		String name = person.getName();
		String id = req.getParameter("id");
		String email = person.getEmail();
		req.setAttribute("name", name);
		
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		service.withdrawalCommunity(id, email);

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/inform/comWithdrawl.jsp");
		dispatcher.forward(req, resp);
	}
}
