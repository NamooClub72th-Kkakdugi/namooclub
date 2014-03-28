package com.namoo.ns1.web.controller.commission;

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

import dom.entity.CommunityMember;

@WebServlet("/commission/comSelectMem.xhtml")
public class ComSelectMemController extends DefaultController {

	private static final long serialVersionUID = 8194496863810223933L;

	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		String cmId = req.getParameter("cmId");
		String communityName = service.findCommunity(cmId).getName();
		List<CommunityMember> members = service.findAllCommunityMember(cmId);
		
		req.setAttribute("members", members);
		req.setAttribute("name", req.getParameter("name"));
		req.setAttribute("communityName", communityName);
		req.setAttribute("cmId", cmId);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/commission/comSelectMem.jsp");
		dispatcher.forward(req, resp);
	}
}
