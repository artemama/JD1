package com.itacademy.avfail.db;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.itacademy.av.Car;

public class DB implements Serializable {
	private String[] brand = { "Audi", "VW", "BMW" };
	private String[] audi = { "100", "A4", "A6" };
	private String[] vw = { "Polo", "Sharan", "Passat" };
	private String[] bmw = { "318i", "525tds", "m750" };
	private HashSet<String> brands = new HashSet<String>(Arrays.asList(brand)); // коллекция Брендов
	private HashSet<String> audis = new HashSet<String>(Arrays.asList(audi));
	private HashSet<String> vws = new HashSet<String>(Arrays.asList(vw));
	private HashSet<String> bmws = new HashSet<String>(Arrays.asList(bmw));
	private HashMap<String, Object> models = new HashMap<>(); 					// мапа бренд-модель
	private List<Car> cars = new ArrayList<>();
	
	public void fillDB() {
		models.put("Audi", getAudis());
		models.put("VW", getVws());
		models.put("BMW", getBmws());
	}
	
	
	public HashSet<String> getAudis() {
		return audis;
	}


	public void setAudis(HashSet<String> audis) {
		this.audis = audis;
	}


	public HashSet<String> getVws() {
		return vws;
	}


	public void setVws(HashSet<String> vws) {
		this.vws = vws;
	}


	public HashSet<String> getBmws() {
		return bmws;
	}


	public void setBmws(HashSet<String> bmws) {
		this.bmws = bmws;
	}


	public HashSet<String> getBrands() {
		return brands;
	}

	public void setBrands(HashSet<String> brands) {
		this.brands = brands;
	}


	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

	public DB() {

		super();
	}

	public void printBrands() { // вывести все брэнды
		Iterator<String> itr = brands.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}

	}
}
