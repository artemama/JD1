package com.itacademy.gasstation;

import java.util.ArrayList;

public class TankGasStation extends Tank {

	private GasMark fuelType;
	private boolean tankIsEmpty;
	public ArrayList<Object> fTanksList = new ArrayList<>();

	public TankGasStation(GasMark gas, int quantity) {
		this.fuelType = gas;
		setQantityTank(quantity);
	}

	TankGasStation tank95 = new TankGasStation(GasMark.gas95, 1000);
	TankGasStation tank92 = new TankGasStation(GasMark.gas92, 1000);
	TankGasStation tankDisel = new TankGasStation(GasMark.disel, 1000);

	public void fullingTanks() {
		fTanksList.add(tank95);
		fTanksList.add(tank92);
		fTanksList.add(tankDisel);
	}

	

	public GasMark getFuelType() {
		return fuelType;
	}

	public void setFuelType(GasMark fuelType) {
		this.fuelType = fuelType;
	}

	public boolean isTankIsEmpty() {
		return tankIsEmpty;
	}

	public void setTankIsEmpty(boolean tankIsEmpty) {
		this.tankIsEmpty = tankIsEmpty;
	}

	


}
