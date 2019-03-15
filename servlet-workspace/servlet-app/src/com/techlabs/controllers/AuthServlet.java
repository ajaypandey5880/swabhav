package com.techlabs.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/mypage")
public class AuthServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
    public AuthServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		handleRequest(request,response);
	}
	
	protected void handleRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("done");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
        String UserName = request.getParameter("Name");
        String Password = request.getParameter("Password"); 
        if(UserName.equals(Password)) {  	
            out.write("Welcome "+UserName);
        }else {
        	out.write("Incorrect login Id or Password");
        	out.write("<a href='views/login.html'>Login Form</a>");
        }
		
	}

}
