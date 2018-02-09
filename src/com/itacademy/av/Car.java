package com.itacademy.av;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import com.itacademy.av.db.DB;

public class Car extends DB implements Serializable {
	
	public Car(List<String> list, HashSet<String> hashSet) {
		super();
	}
	
	/*Car car = new Car(getBrand(), getModel());

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	*/

}
