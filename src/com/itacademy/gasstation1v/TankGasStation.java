package com.itacademy.gasstation1v;

import java.util.ArrayList;
import java.util.List;

public class TankGasStation {
	private ArrayList<Tank> fuelTanksList;
	private boolean tankIsEmpty;

	public ArrayList<Tank> getfTanksList() {
		return fuelTanksList;
	}

	public TankGasStation(ArrayList<Tank> fTanksList) {
		this.fuelTanksList = fTanksList;
	}

	public boolean tankIsEmpty() {
		int i = 0;
		synchronized (fuelTanksList) {
			for (Tank tanks : fuelTanksList) {
				i += tanks.getQantityTank();
			}
			if (i == 0) {
				System.out.println("Заправка пуста");
				return true;
			} else {
				return false;
			}
		}
	}

	public boolean isTankIsEmpty() {
		return tankIsEmpty;
	}


}
