package com.namoo.ns1.web.controller.commission;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.CommunityService;
import com.namoo.ns1.service.facade.TownerService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;
import com.namoo.ns1.web.controller.shared.DefaultController;
import com.namoo.ns1.web.controller.shared.LoginRequired;

import dom.entity.Community;
import dom.entity.SocialPerson;

@WebServlet("/commission/comCommission.do")
@LoginRequired
public class ComCommissionController extends DefaultController{

	private static final long serialVersionUID = -9106880770468221419L;

	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		CommunityService service = NamooClubServiceFactory.getInstance().getCommunityService();
		TownerService townService = NamooClubServiceFactory.getInstance().getTownerService();
		
		String name = req.getParameter("name");
		String cmId = req.getParameter("cmId");
		String email = req.getParameter("email");
		
		
		Community community = service.findCommunity(cmId);
		System.out.println("Before>>>>>>");
		System.out.println(community.getManager().getName());
		
		System.out.println("email : " + email);
		SocialPerson person = townService.findTowner(email);
		System.out.println("person : " + person.getName());
		service.commissionManagerCommunity(cmId, person);
		
		community = service.findCommunity(cmId);
		System.out.println(">>>>>");
		System.out.println(community.getManager().getName());
		 
		
		req.setAttribute("name", person.getName());
		redirect(req, resp, "/community/comList.do?name="+name);
	}

}
