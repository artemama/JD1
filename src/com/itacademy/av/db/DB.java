package com.itacademy.av.db;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DB implements Serializable {
	private HashSet<String> brand = new HashSet<>();
	private HashMap<String, String> model = new HashMap<>();

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

	public DB(HashSet<String> brand, HashMap<String, String> model) {
		super();
		this.brand = brand;
		this.model = model;
	}

}
