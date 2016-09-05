package com.example;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;

public class SampleRequestAttributeListener implements ServletRequestAttributeListener{

	@Override
	public void attributeAdded(ServletRequestAttributeEvent arg0) {
		Enumeration<String> list = arg0.getServletRequest().getAttributeNames();
		while(list.hasMoreElements())
			System.out.println("Attribute Added : " + list.nextElement());
		
	}

	@Override
	public void attributeRemoved(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		Enumeration<String> list = arg0.getServletRequest().getAttributeNames();
		while(list.hasMoreElements())
			System.out.println("Attribute Removed : " + list.nextElement());
	}

	@Override
	public void attributeReplaced(ServletRequestAttributeEvent arg0) {
		// TODO Auto-generated method stub
		Enumeration<String> list = arg0.getServletRequest().getAttributeNames();
		while(list.hasMoreElements())
			System.out.println("Attribute Replaced : " + list.nextElement());
	}

}
