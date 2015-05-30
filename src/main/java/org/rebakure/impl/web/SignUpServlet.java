package org.rebakure.impl.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(
	    name = "SignUpServlet", 
	    urlPatterns = {"/signup"}
	)
public class SignUpServlet extends RebakureServlet {
	private static final long serialVersionUID = 1L;

	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//TODO: missing implementation
	}

	
	/**
	 * {@inheritDoc}
	 */
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//TODO: missing implementation
	}
}
