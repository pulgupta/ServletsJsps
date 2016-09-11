package com.example.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.BeerExpert;

/**
 * Servlet implementation class BeerSelect
 */

public class BeerSelect extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public BeerSelect() {
        // TODO Auto-generated constructor stub
    }
    
    @Override
    public void init() {
    	System.out.println("In init method " + getServletContext().getInitParameter("adminEmailGlobal"));
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.setContentType("text/html");
		//PrintWriter out = response.getWriter();
		//out.println("Beer selection advice<br>");
		String c = request.getParameter("color");
		//out.println("Got beer color " + c);
		
		//Calling model
		BeerExpert be = new BeerExpert();
		List<String> result = be.getBrands(c);
		System.out.println(getServletConfig().getInitParameter("adminEmail"));
		System.out.println(getServletContext().getInitParameter("adminEmailGlobal"));
		//What eve we are setting here we will be able to use the same name in the jsp page
		//to load the data
		request.setAttribute("styles", result);
		
		//Redirecting to the view
		RequestDispatcher view = request.getRequestDispatcher("result.jsp");
		view.forward(request, response);
		//for (String r : result) {
			//out.println("<br>" + r);
		//}
				
	}

}
