package com.itacademy.dbsample;

import java.sql.SQLException;
import java.util.List;

import by.itacademy.dbsample.dao.IBrandDao;
import by.itacademy.dbsample.dao.ICarDao;
import by.itacademy.dbsample.dao.IModelDao;
import by.itacademy.dbsample.dao.impl.BrandDaoImpl;
import by.itacademy.dbsample.dao.impl.CarDaoImpl;
import by.itacademy.dbsample.dao.impl.ModelDaoImpl;
import by.itacademy.dbsample.model.Brand;

public class DaoTest {

	public static void main(String[] args) throws SQLException {
		IBrandDao brandDao = new BrandDaoImpl();
		IModelDao modelDao = new ModelDaoImpl();
		ICarDao carDao = new CarDaoImpl();

		printList(brandDao.getAll());
		printList(modelDao.getAll());

		Brand object = new Brand();
		object.setName("new brand 1");
		;
		Integer generatedId = brandDao.insert(object);
		System.out.println("latest generated brand id:" + generatedId);
		printList(brandDao.getAll());

	}

	private static void printList(List<? extends Object> all) {
		for (Object object : all) {
			System.out.println(object.toString());
		}
	}
}
