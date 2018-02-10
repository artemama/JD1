package com.itacademy.av;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import com.itacademy.av.db.DB;

public class Car extends DB implements Serializable {

	public Car(HashSet<String> brand, HashMap<String, String> model) {
		super(brand, model);
		// TODO Auto-generated constructor stub
	}
	
	/*
	Car car = new Car(getBrand(), getModel());

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	*/

}
