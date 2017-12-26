package com.itacademy.task22;

public class MainTimeInterval {
	/*
	 * Задание 22 Создать класс и объекты описывающие промежуток времени. Сам
	 * промежуток в классе должен задаваться тремя свойствами: секундами, минутами,
	 * часами. Сделать методы для получения полного количества секунд в объекте,
	 * сравнения двух объектов (метод должен работать аналогично compareTo в
	 * строках). Создать два конструктора: получающий общее количество секунд, и
	 * часы, минуты и секунды по отдельности. Сделать метод для вывода данных
	 */

	public static void main(String[] args) {
		TimeInterval obj1 = new TimeInterval(52145); // Объект 1
		TimeInterval obj2 = new TimeInterval(15, 20, 36); // Объект 2 (создавал через пергруженный конст
		System.out.println(obj2.printAllSecond());
		System.out.println(obj1.printAllSecond());
		System.out.println(obj1.compareTo(obj2));

	}
}
