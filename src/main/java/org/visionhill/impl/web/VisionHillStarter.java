package org.visionhill.impl.web;

import java.io.File;

import javax.servlet.http.HttpServlet;

import org.apache.catalina.startup.Tomcat;

public class VisionHillStarter extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public static void main(String[] args) throws Exception {
    	  String webappDirLoc = "src/main/webapp/";
          Tomcat tomcat = new Tomcat();

          String webPort = System.getenv("PORT");
          if(webPort == null || webPort.isEmpty()) {
              webPort = "8080";
          }
          tomcat.setPort(Integer.valueOf(webPort));
          tomcat.addWebapp("/", new File(webappDirLoc).getAbsolutePath());
          System.out.println("configuring visionhill with basedir: " + new File("./" + webappDirLoc).getAbsolutePath());
          tomcat.start();
          tomcat.getServer().await();  
    }
}
