package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {
	public List<String> getBrands(String color) {
		List<String> brands = new ArrayList<>();
		if(color.equals("brown")) {
			brands.add("jack");
			brands.add("KF");
		}
		else
		{
			brands.add("Corona");
			brands.add("Hineken");	
		}
		return brands;
	}
}
