package com.namoo.ns1.web.controller.inform;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.web.controller.shared.DefaultController;
import com.namoo.ns1.web.controller.shared.LoginRequired;

@WebServlet("/inform/clubRealWithdrawl.do")
@LoginRequired
public class ClubRealWithdrawlController extends DefaultController {

	private static final long serialVersionUID = 5139374540621162962L;

	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		String name = req.getParameter("name");
		String clId = req.getParameter("clId");
		String cmId = req.getParameter("cmId");
		
		req.setAttribute("name", name);
		req.setAttribute("clId", clId);
		req.setAttribute("cmId", cmId);
		
		
		
	}

}
