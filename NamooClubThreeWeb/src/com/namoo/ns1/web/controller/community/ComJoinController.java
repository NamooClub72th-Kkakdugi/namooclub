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

@WebServlet("/community/comJoin.do")
public class ComJoinController extends ForwardCommonController{

	private static final long serialVersionUID = -8664188246067720891L;

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
		String id = req.getParameter("id");
		
		String email = person.getEmail();
		
		service.joinAsMember(id, email);
		
		redirect(req, resp, "/community/comList.do");
	}
	
	

}
