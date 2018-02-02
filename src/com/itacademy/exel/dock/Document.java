package com.itacademy.exel.dock;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class Document implements Serializable {
	private Map<Integer, Line> document = new TreeMap<Integer, Line>();

	public Document() {
		super();
	}

	public Map<Integer, Line> getDocument() {
		return document;
	}

	public void setDocument(Map<Integer, Line> document) {
		this.document = document;
	}
	
}
