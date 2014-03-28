package com.namoo.ns1.web.controller.club;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.namoo.ns1.web.controller.shared.DefaultController;
import com.namoo.ns1.web.controller.shared.LoginRequired;

@WebServlet("/club/clubJoinInput.xhtml")
@LoginRequired
public class ClubJoinInputController extends DefaultController {

	private static final long serialVersionUID = 4306268894132074403L;

	@Override
	protected void process(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//
		req.setAttribute("name", req.getParameter("name"));
		req.setAttribute("cmId", req.getParameter("cmId"));
		req.setAttribute("clId", req.getParameter("clId"));
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/club/clubJoinInput.jsp");
		dispatcher.forward(req, resp);
	}

}
