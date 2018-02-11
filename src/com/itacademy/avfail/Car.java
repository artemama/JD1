package com.itacademy.avfail;

import java.io.Serializable;


public class Car implements Serializable {
	String brand;
	String model;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Car(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}

}
