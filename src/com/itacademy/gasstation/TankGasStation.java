package com.itacademy.gasstation;

public class TankGasStation extends Tank {

	private GasMark fuelType;
	
	public TankGasStation(GasMark gas, int quantity) {
		this.fuelType = gas;
		setQantityTank(quantity);
	}

}
