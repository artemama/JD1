package com.itacademy.av;

import java.io.Serializable;

public class Car implements Serializable {
	
	public Car(String brand, String model) {
		super();
		// TODO Auto-generated constructor stub
	}

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

	private String brand;
	private String model;

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

}
