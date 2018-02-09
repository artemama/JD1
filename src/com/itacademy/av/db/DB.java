package com.itacademy.av.db;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DB implements Serializable {
	private List<String> brand = new ArrayList<String>();
	private HashSet<String> model = new HashSet<String>();


	public List<String> getBrand() {
		return brand;
	}

	public void setBrand(List<String> brand) {
		this.brand = brand;
	}

	public HashSet<String> getModel() {
		return model;
	}

	public void setModel(HashSet<String> model) {
		this.model = model;
	}

	
}
