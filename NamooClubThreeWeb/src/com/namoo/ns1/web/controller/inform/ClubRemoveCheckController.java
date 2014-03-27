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


@WebServlet("/inform/clubRemoveCheck.do")
@LoginRequired
public class ClubRemoveCheckController extends DefaultController {

	private static final long serialVersionUID = -5716529646596314036L;

	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		String clId = req.getParameter("clId");
		ClubService service = NamooClubServiceFactory.getInstance().getClubService();
		
		String clubName = service.findClub(clId).getName();
		req.setAttribute("clubName", clubName);
		req.setAttribute("clId", clId);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/club/clubRemove.jsp");
		dispatcher.forward(req, resp);
	}

}
