package com.itacademy.gasstation;

public class TankGasStation {

	private GasMark fuelType;
	private int qantityTank;
	

	public TankGasStation(GasMark gas, int quantity) {
		this.fuelType = gas;
		this.setQantityTank(quantity);
	}


	public GasMark getFuelType() {
		return fuelType;
	}


	public void setFuelType(GasMark fuelType) {
		this.fuelType = fuelType;
	}


	public int getQantityTank() {
		return qantityTank;
	}


	public void setQantityTank(int qantityTank) {
		this.qantityTank = qantityTank;
	}


	
	
	
	

	

}
