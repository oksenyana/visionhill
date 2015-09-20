package org.visionhill.impl.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;


@WebServlet(
	    name = "ContactServlet", 
	    urlPatterns = {"/contact"}
	)
public class ContactServlet extends VisionHillServlet {
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
            String sender = req.getParameter("sender");
            String senderEmail= req.getParameter("senderEmail");
            String message = req.getParameter("message");
		
            //Validate Post Data
            if( sender != null && sender.length() > 0 &&
                senderEmail != null && senderEmail.length() > 0 &&
		 message != null && message.length() > 0)
		{
                    //Send email
                    //Add a config email list.??? libs to use?
                    resp.getWriter().print("<message>" + sender + ", thank for contact us. Someone will get back to you soon!</message>");
		}
		else
		{
                    //Send Error Message
                    resp.getWriter().print("<message>An Error occurred</message>");
		}
	}
}