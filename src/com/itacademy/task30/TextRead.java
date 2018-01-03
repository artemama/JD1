package com.itacademy.task30;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class TextRead {

	public static void main(String[] args) throws IOException {
		// e:\JD1\src\com\itacademy\task30\
		String filePath = "e:\\javaJD\\src\\com\\itacademy\\task30\\hello.txt";

		List<String> lines = Files.readAllLines(Paths.get(filePath));

		int wordsCount = 0;

		for (String line : lines) {
			System.out.println(line);

			String[] split = line.split(" ");

			wordsCount += split.length;

		}
		System.out.println("words count:" + wordsCount);

	}

}
