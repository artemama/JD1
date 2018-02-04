package com.itacademy.av.command;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.HashSet;

public class Save extends Command {
	private HashSet brand;
	private HashMap model;

	public Save(HashSet brand, HashMap model) {
		super();
		this.brand = brand;
		this.model = model;
	}

	@Override
	public void execute() {
		String fileName = "tmpSave.txt";
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
}
