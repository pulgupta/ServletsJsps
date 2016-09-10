package com.example.session;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class SessionExample
 */
@WebServlet("/SessionExample")
public class SessionExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SessionExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		Enumeration<String> names = request.getParameterNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			session.setAttribute(name, request.getParameter(name));
			System.out.println("attribute added in session " + request.getParameter(name));
		}
		String flag = request.getParameter("endConservation");
		String nextPage = "";
		if(flag==null || !flag.equals("true")){
			nextPage="session2.jsp";
		}
		else {
			nextPage="result.jsp";
			Enumeration<String> reqNames = session.getAttributeNames();
			while(reqNames.hasMoreElements()){
				String temp = reqNames.nextElement();
				request.setAttribute(temp, session.getAttribute(temp));
			}
		}
		RequestDispatcher rd = request.getRequestDispatcher(nextPage);
		rd.forward(request, response);
	}

}
