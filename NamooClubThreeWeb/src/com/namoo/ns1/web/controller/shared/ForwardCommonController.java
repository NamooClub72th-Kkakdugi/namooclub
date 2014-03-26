package com.namoo.ns1.web.controller.shared;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class ForwardCommonController extends HttpServlet {

	private static final long serialVersionUID = 5119936070915974893L;

	protected void redirect(HttpServletRequest req, HttpServletResponse resp, String url)  throws ServletException, IOException {
		//
		resp.sendRedirect(req.getContextPath() + url);
	}
}
