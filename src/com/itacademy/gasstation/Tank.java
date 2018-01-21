package com.itacademy.gasstation;

public class Tank {
	protected int qantityTank;
	protected GasMark fuelTupe;
	
	public GasMark randomFuelType() {
		int i = 1; //(int) (Math.random() * 3);
		this.fuelTupe = GasMark.values()[i];
		return fuelTupe;	
	}
	
	public int name() {
		qantityTank = 15;
		return qantityTank;
	}
	public int getQantityTank() {
		return qantityTank;
	}
	public GasMark getFuelTupe() {
		return fuelTupe;
	} 
	
}
