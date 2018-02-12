package com.itacademy.av.command;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;

import com.itacademy.exel.dock.Document;

public abstract class Save extends Command implements Serializable{
	private HashSet brand;
	private HashMap model;
	private String fileName = "tmpSave.txt";

	public Save(String title, String key, HashSet brand, HashMap model) {
		super(title, key);
		this.brand = brand;
		this.model = model;
	}

	public void saveFile() {
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(this.brand);
			oos.writeObject(this.model);
			oos.close();
			System.out.println(String.format("File %s was saved.", fileName));
		} catch (IOException e) {
			System.out.println("Something was wrong. File wasn't saved. Please try again.");
		}

	}
	
	public void loadFile() {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));) {
			Document doc = (Document) ois.readObject();
			ois.close();
			System.out.println(String.format("Документ %s открыт", fileName));
		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
			
		} catch (Exception e) {
			System.out.println("Something is wrong.");
		}
		
	}


}
