package com.itacademy.gasstation;

public class GasStation extends Tank{
	Type fuelType;

	
	private GasStation(Type fuelType, int value) {
		super();
		this.fuelType = fuelType;
		
	}
	@Override
	protected int getVolume() {
		return super.getVolume();
	}
}

enum Type {
	gas95, gas92, disel;

}
