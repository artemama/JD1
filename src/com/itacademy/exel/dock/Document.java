package com.itacademy.exel.dock;

import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

public class Document implements Serializable {
	private Map<Integer, Line> document = new TreeMap<Integer, Line>();
	
	public Map<Integer, Line> getDocument() {
		return document;
	}

	public void setDocument(Map<Integer, Line> document) {
		this.document = document;
	}

	public String getDocName() {
		return docName;
	}

	public void setDocName(String docName) {
		this.docName = docName;
	}

	private String docName;
	
	public Document(Map<Integer, Line> document, String docName) {
		super();
		this.document = document;
		this.docName = docName;
	}


}
