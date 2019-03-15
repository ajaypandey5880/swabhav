package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/application")
public class ApplicationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ApplicationServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		handleRequest(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException{
        ServletContext session = getServletContext();
        
        if(session.getAttribute("count")== null || session.getAttribute("count")== "") {
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
