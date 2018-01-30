package com.itacademy.exel.dock;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class Line implements Serializable {
	private Map<Character, Cell> line = new TreeMap<Character, Cell>();
}
