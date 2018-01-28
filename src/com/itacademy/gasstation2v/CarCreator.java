package com.itacademy.gasstation2v;

import java.util.List;

public class CarCreator  {
	private GasMark gasMark;
	private int tankValue;
	
	public CarCreator() {
		this.gasMark = GasMark.values()[(int) (Math.random() * GasMark.values().length)];
		this.tankValue = (int) (Math.random() * 20)+1;
		int counter = 1;
		System.out.println("Заехала машина № " + counter);
		counter ++;
		
	}

	public GasMark getGasMark() {
		return gasMark;
	}

	public void setGasMark(GasMark gasMark) {
		this.gasMark = gasMark;
	}

	public int getTankValue() {
		return tankValue;
	}

	public void setTankValue(int tankValue) {
		this.tankValue = tankValue;
	}}

