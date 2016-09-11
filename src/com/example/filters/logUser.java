package com.example.filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/**
 * Servlet Filter implementation class logUser
 */
public class logUser implements Filter {

    /**
     * Default constructor. 
     */
    public logUser() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("Lets verify if the filter is called");
		// pass the request along the filter chain
		chain.doFilter(request, response);
		/**
		 * The thing which I am doing below is also perfectly correct. In this way we can block the processing 
		 * on any page by enabling this filter on that url pattern. When ever someone will receive the request 
		 * this filter will dispatch the request to the index.html page.
		 */
		//RequestDispatcher rd = request.getRequestDispatcher("/index.html");
		//rd.forward(request, response);
		System.out.println("We can do the response filter tricks here");
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
