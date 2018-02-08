package com.itacademy.av;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Save {

	private Car car;

	public void save() throws IOException {

		FileOutputStream fos = new FileOutputStream("AutoSave.sav");
		ObjectOutputStream oos = new ObjectOutputStream(fos);

		oos.writeObject(this.car);
		oos.close();
		System.out.println("Данные сохранены в файл AutoSave.sav");
	}

}
