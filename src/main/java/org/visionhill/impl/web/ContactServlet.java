package org.visionhill.impl.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest; 
import javax.servlet.http.HttpServletResponse;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


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
		try
		{
			String sender = req.getParameter("sender");
			String senderEmail= req.getParameter("senderEmail");
			String message = req.getParameter("message");
		
			//Validate Post Data
			if( sender != null && sender.length() > 0 &&
				senderEmail != null && senderEmail.length() > 0 &&
				message != null && message.length() > 0)
			{
				//Send email
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("Spring-Mail.xml");
			    	 
				UtilsServlet mm = (UtilsServlet)context.getBean("MailUtil");
				mm.sendMail(senderEmail,
			    		    "ntwa2@yahoo.fr",
			    		   "Vision Hill Web Contact" + sender, message);
				resp.getWriter().print("<message>" + sender + ", thank for contact us. Someone will get back to you soon!</message>");
			}
			else
			{
				//Send Error Message
				resp.getWriter().print("<message>An Error occurred</message>");
			}
		}
		catch(Exception ex)
		{
			//Log the actual error and send generic error
			resp.getWriter().print("<message>An Error occurred</message>");
		}
	}
}