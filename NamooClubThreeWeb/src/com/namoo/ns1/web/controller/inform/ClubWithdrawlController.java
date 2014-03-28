package com.namoo.ns1.web.controller.inform;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.ClubService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;
import com.namoo.ns1.web.controller.shared.DefaultController;
import com.namoo.ns1.web.controller.shared.LoginRequired;

import dom.entity.Club;
import dom.entity.SocialPerson;

@WebServlet("/inform/clubWithdrawl.do")
@LoginRequired
public class ClubWithdrawlController extends DefaultController {

	private static final long serialVersionUID = -2515907141006105519L;

	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 
		ClubService service = NamooClubServiceFactory.getInstance().getClubService();
		SocialPerson person = (SocialPerson) req.getSession().getAttribute("loginUser");
		String email = person.getEmail();
		
		String name = req.getParameter("name");
		String clId = req.getParameter("clId");
		String cmId = req.getParameter("cmId");
		
		req.setAttribute("name", name);
		req.setAttribute("clId", clId);
		req.setAttribute("cmId", cmId);
		
		Club club = service.findClub(clId);
		service.withdrawalClub(clId, email);
		if (club.getMembers().isEmpty()) {
			RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/inform/clubRealWithdrawl.jsp");
			dispatcher.forward(req, resp);
		} else {
		redirect(req, resp, "/club/clubList.do?cmId=" + cmId);
		}
		
	}
}
