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

import com.itacademy.av.Car;

public abstract class Save extends Command implements Serializable{
	private static HashSet brand;
	private static HashMap model;
	private static String fileName = "tmpSave.txt";

	public Save(String title, String key, HashSet brand, HashMap model) {
		super(title, key);
		this.brand = brand;
		this.model = model;
	}

	public static void saveFile() {
		try (FileOutputStream fos = new FileOutputStream(fileName);
				ObjectOutputStream oos = new ObjectOutputStream(fos);) {
			oos.writeObject(brand);
			oos.writeObject(model);
			oos.close();
			System.out.println(String.format("Файл %s сохранен.", fileName));
		} catch (IOException e) {
			System.out.println("Не получилось сохранить файл");
		}

	}
	
	public void loadFile() {
		
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));) {
			Car doc = (Car) ois.readObject();
			ois.close();
			System.out.println(String.format("Документ %s открыт", fileName));
		} catch (FileNotFoundException e) {
			System.out.println("Файл не найден.");
			
		} catch (Exception e) {
			System.out.println("Не получилось открыть файл.");
		}
		
	}


}
