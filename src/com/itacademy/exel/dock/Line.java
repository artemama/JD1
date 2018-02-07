package com.itacademy.exel.dock;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class Line implements Serializable {
	private Map<Integer, Cell> line = new TreeMap<Integer, Cell>();

	public Line() {
		super();
	}

	public Cell getCell(Integer i) {
		return line.get(i);
	}

	public void addCell(Integer i, Cell cell) {
		line.put(i, cell);
	}

}
