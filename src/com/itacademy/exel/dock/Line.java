package com.itacademy.exel.dock;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

import workclasspvt.class03january.tryall.shumaher.excel.Cell;

public class Line implements Serializable {
	private Map<Character, Cell> line = new TreeMap<Character, Cell>();

	public Line() {
		super();
	}

	public Cell getCell(Character i) {
		return line.get(i);
	}

	public void addCell(Character i, Cell cell) {
		line.put(i, cell);
	}
}
