package com.itacademy.gasstation2v;

public abstract class AllTanks {
	private GasMark fuelGasMark;
	private int tankValue;

	public AllTanks(GasMark fuelGasMark, int tankValue) {
		this.fuelGasMark = fuelGasMark;
		this.tankValue = tankValue;
	}

	public int getTankValue() {
		return tankValue;
	}

	public void setTankValue(int tankValue) {
		this.tankValue = tankValue;
	}

	public GasMark getFuelGasMark() {
		return fuelGasMark;
	}



}