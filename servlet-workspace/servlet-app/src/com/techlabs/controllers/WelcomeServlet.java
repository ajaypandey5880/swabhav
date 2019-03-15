package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public WelcomeServlet() {
        super();
        System.out.println("Inside Welcome Servlet");
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		handleRequest(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//doGet(request, response);
		//System.out.println("Inside doPost");
	}
	
	protected void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
        response.setContentType("text/html");
 
        String paramName = "developer";
        String paramValue = request.getParameter(paramName);
        
        for(int i = 1;i<=6;i++) {
        	if (paramValue==null || paramValue=="") {
                out.write("<h"+i+">Welcome to Servlet</h"+i+">");
            }else {
            	out.write("<h"+i+">Developer");
                out.write(" = ");
                out.write(paramValue+"</h"+i+">");
            }
     
        }
 
        
        out.close();
 
    }

}
