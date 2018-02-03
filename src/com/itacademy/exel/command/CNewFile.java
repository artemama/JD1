package com.itacademy.exel.command;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.Map;
import java.util.TreeMap;

import com.itacademy.exel.dock.Cell;
import com.itacademy.exel.dock.Document;
import com.itacademy.exel.dock.Line;

public class CNewFile extends Command implements Serializable{

	public CNewFile(String key) {
		super("Создать  документ", key);
		setKey(key);
	}

	@Override
	public void execute() throws IOException { // should not throw. cathc and retry
		System.out.println("введите имя файла для создания");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String fileName = reader.readLine();
		// create a new file
		
	/*	TreeMap<Integer, Line> treeMap = new TreeMap<1000, Cell>;*/
		
		
		
/*		System.out.println(document);*/
		System.out.println("Файл создан с именем "+ fileName);
		
		
		// print list of actions (commands) for a new file
		
	}

}
