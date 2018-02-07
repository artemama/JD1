package com.itacademy.av.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class DB {
	private List<String> brand = new ArrayList<String>();
	private HashMap<String, String> model = new HashMap<String, String>();


	public List<String> getBrand() {
		return brand;
	}

	public void setBrand(List<String> brand) {
		this.brand = brand;
	}

	public HashMap<String, String> getModel() {
		return model;
	}

	public void setModel(HashMap<String, String> model) {
		this.model = model;
	}

	
}
