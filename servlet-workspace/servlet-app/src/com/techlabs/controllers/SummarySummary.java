package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/summary")
public class SummarySummary extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SummarySummary() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		handleRequest(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}
	
	protected void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		HttpSession session = request.getSession(true);
		Integer sessionCount = (Integer)session.getAttribute("count");
		out.write("Session Count is :");	
		print(sessionCount,response);
		ServletContext application = getServletContext();
		Integer applictaionCount = (Integer)application.getAttribute("count");
		out.write("Appliction Count is :");
		print(applictaionCount, response);
	}
	
	protected void print(Integer count,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		out.write("Old Counter :"+count);
		out.write("New Counter :"+(count+1));	
		out.write("<br>");
	}
}
