package com.itacademy.gasstation;

import java.util.ArrayList;

/*есть 5 бензоколонок. на каждой 3 вида топлива: ДT, АИ-92, АИ-95 (использовать Enum)
колонки питаются из соответствующих общих резервуаров 3х типов, в каждом по 1000 литров горючего на момент старта

клиенты идут бесконечно один за одним. каждый заказывает от 1 до 20 литров случайно выбранного топлива. заправка происходит 
со скоростью 1 литр в секунду. новый клиент начинает работу сразу после освобождения любой колонки.

когда в резервуаре заканчивается топливо, то клиенты должны получать "отказ" и уступать место другим клиента, которые, возможно,
выберут меньший объем или другой вид топлива.
программа полностью заканчивает работу когда закончится последнее топливо во всех резервуарах.

все события отображать в System.out*/
public class Main {

	public static void main(String[] args) {

		// creating instances of tank's different types
		 ArrayList<Object> fTanksList = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			Car car = new Car();
		}
		

	}




}
