package com.itacademy.exel.dock;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class Document implements Serializable {
	private Map<Integer, Line> document = new TreeMap<Integer, Line>();


}
