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


@WebServlet("/inform/comRemoveCheck.do")
@LoginRequired
public class ComRemoveCheckController extends DefaultController {

	private static final long serialVersionUID = -27287738010509105L;

	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		
		String id = req.getParameter("id");
		req.setAttribute("id", id);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/inform/comRemoveCheck.jsp");
		dispatcher.forward(req, resp);
	}

}
