package com.itacademy.gasstation;

public class TankGasStation extends Tank {

	private GasMark fuelType;
	
	public TankGasStation(GasMark gas, int quantity) {
		this.fuelType = gas;
		setQantityTank(quantity);
	}
	
	TankGasStation tank95 = new TankGasStation(GasMark.gas95, 1000);
	TankGasStation tank92 = new TankGasStation(GasMark.gas92, 1000);
	TankGasStation tankDisel = new TankGasStation(GasMark.disel, 1000);

}
