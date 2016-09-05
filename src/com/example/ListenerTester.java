package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListenerTester
 */
//@WebServlet("/ListenerTester")
public class ListenerTester extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListenerTester() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		pw.println("set context attributes set by listener <br>");
		Dog dog = (Dog) getServletContext().getAttribute("dog");
		pw.println("Dog breed is " + dog.getBreed());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Dog dog = (Dog) getServletContext().getAttribute("dog");
		request.setAttribute("dog", dog);
		System.out.println("the breed of the dog is in servlet" + dog.getBreed());
		RequestDispatcher rd = request.getRequestDispatcher("eldemo.jsp");
		rd.forward(request, response);
	}

}
