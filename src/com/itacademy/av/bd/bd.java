package com.itacademy.av.bd;

import java.util.HashMap;
import java.util.HashSet;

public class bd {
	private HashSet<String> brand = new HashSet<String>();
	private HashMap<String, String> model = new HashMap<String, String>();

	public HashSet<String> getBrand() {
		return brand;
	}

	public void setBrand(HashSet<String> brand) {
		this.brand = brand;
	}

	public HashMap<String, String> getModel() {
		return model;
	}

	public void setModel(HashMap<String, String> model) {
		this.model = model;
	}

	
}
