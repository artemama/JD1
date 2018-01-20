package com.itacademy.Part1.task22;

/*Задание 22
Создать класс и объекты описывающие промежуток времени. Сам промежуток
в классе должен задаваться тремя свойствами: секундами, минутами, часами.
Сделать методы для получения полного количества секунд в объекте, сравнения
двух объектов (метод должен работать аналогично compareTo в строках). Создать
два конструктора: получающий общее количество секунд, и часы, минуты и секунды
по отдельности. Сделать метод для вывода данных
*/
public class TimeInterval {

	private int hour; // 3 св-ва класса
	private int minut;
	private int second;

	public TimeInterval(int hour, int minut, int second) { // конструктор 1
		this.hour = hour;
		this.minut = minut;
		this.second = second;
	}

	public TimeInterval(int second) { // конструктор 2 (пробовал сделать перегруженный конструктор)
		super();
		this.second = second;
	}

	public int printAllSecond() { // метод для получения полного количества секунд
		int allsec = (hour * 3600) + (minut * 60) + second;
		return allsec;
	}

	public boolean compareTo(TimeInterval allsec) {
		if (this.printAllSecond() == allsec.printAllSecond()) {
			return true;
		} else {
			return false;
		}
	}

	public void printDividedTime(int nrObj) {
		System.out.println(String.format("Object %s have %s hours, %s minuts, %s seconds", nrObj, hour, minut, second));
	}

}
