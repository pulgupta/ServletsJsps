package com.example.web;

public class Counter {
	public static int count;
	
	public static synchronized int getCount() {
		return count++;
	}
}
