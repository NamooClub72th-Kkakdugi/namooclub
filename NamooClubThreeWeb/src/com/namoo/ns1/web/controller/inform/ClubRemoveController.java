package com.namoo.ns1.web.controller.inform;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.service.facade.ClubService;
import com.namoo.ns1.service.factory.NamooClubServiceFactory;
import com.namoo.ns1.web.controller.shared.DefaultController;

@WebServlet("/inform/clubRemove.do")
public class ClubRemoveController extends DefaultController{

	private static final long serialVersionUID = -3829572762564286577L;

	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		ClubService service = NamooClubServiceFactory.getInstance().getClubService();
		String clId = req.getParameter("clId");
		service.removeClub(clId);
		
		redirect(req, resp, "/club/clubList.do");
	}

}
