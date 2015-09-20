package org.visionhill.impl.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public abstract class VisionHillServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 	{@inheritDoc}
	 */
	@Override
	protected abstract void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
	
	
	/**
	 * 	{@inheritDoc}
	 */
	@Override
    protected abstract void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException;
	
}
