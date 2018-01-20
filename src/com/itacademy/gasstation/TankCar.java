package com.itacademy.gasstation;

public class TankCar extends Tank {
	public TankCar() {
		int i = (int) (Math.random() * 3);
		this.fuelTupe = GasMark.values()[i];
		
		int needFuel = (int) (Math.random() * 20);
		this.qantityTank = needFuel;
		
		System.out.println(String.format("Car created whith s% fuel type & s% qantity", i, needFuel));

	}

}
