package com.itacademy.dbsample.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import by.itacademy.dbsample.dao.ICarDao;
import by.itacademy.dbsample.model.Car;

public class CarDaoImpl extends AbstractDao<Car> implements ICarDao {

	@Override
	protected Car handleRow(ResultSet resultSet) throws SQLException {
		throw new RuntimeException("not implemented");
	}

	@Override
	protected String getTableName() {
		return "car";
	}

	@Override
	public Integer insert(Car object) throws SQLException {
		throw new RuntimeException("not implemented");
		
	}
}
