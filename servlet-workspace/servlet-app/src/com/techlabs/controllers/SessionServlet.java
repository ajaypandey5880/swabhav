package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/session")
public class SessionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SessionServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		handleRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException{
        HttpSession session = request.getSession(true);
        
        if(session.isNew()) {
        	Integer counter = 0;
        	session.setAttribute("count",counter);   		
        	print(counter,response);
        }else {
        	Integer counter = (Integer)session.getAttribute("count");
        	counter ++;
        	session.setAttribute("count", counter);
        	print(counter, response);
        }
        
	}
	
	protected void print(Integer count,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.write("Old Counter :"+count);
		out.write("New Counter :"+(count+1));		
	}
	

}
