package com.itacademy.dbsample.dao.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import by.itacademy.dbsample.dao.IModelDao;
import by.itacademy.dbsample.model.Car;
import by.itacademy.dbsample.model.Model;

public class ModelDaoImpl extends AbstractDao<Model> implements IModelDao {

	@Override
	protected Model handleRow(ResultSet resultSet) throws SQLException {
		Model model = new Model();
		model.setBrandId((Integer) resultSet.getObject("brand_id"));
		model.setId(resultSet.getInt("id"));
		model.setName(resultSet.getString("name"));
		return model;

	}
	
	
	@Override
	public Integer insert(Model object) throws SQLException {
		throw new RuntimeException("not implemented");
		
	}

	@Override
	protected String getTableName() {
		return "model";
	}
	

}
