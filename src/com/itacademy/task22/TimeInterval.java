package com.itacademy.task22;

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

	public TimeInterval(int h, int m, int s) { // конструктор
		hour = h;
		minut = m;
		second = s;
	}

	/*
	 * public TimeInterval(int allsec) { //конструктор 2 (пробовал сделать
	 * перегруженный конструктор) second = allsec; }
	 */

	public void printAllTime(int allsec) { // метод для получения полного количества секунд
		allsec = (hour * 3600) + (minut * 60) + second;
		System.out.println("obj1 = " + allsec);
	}

	//public void printAllTime() {
	

	public void printDividedTime(int nrObj) {
		System.out.println(String.format("Object %s have %s hours, %s minuts, %s seconds", nrObj, hour, minut, second));
	}
	public static void main(String[] args) {
		TimeInterval obj1 = new TimeInterval(12,15,20); //Объект 1 
		TimeInterval obj2 = new TimeInterval(15,20,36);  //Объект 2  (создавал через пергруженный конст
		obj1.printAllTime(0);
		obj2.printAllTime(0);
		obj1.printDividedTime(1);
		obj2.printDividedTime(2);
/*
	public int compareTime() {
		if (this.second >= this.returnAllSecond()) {
			System.out.println("Object1 => Object2");
		} else {
			System.out.println("Object1 < Object2");
		}

		return this.second - this.returnAllSecond();

	}*/

}}
