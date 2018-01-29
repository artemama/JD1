package com.itacademy.gasstation2v;

import java.util.ArrayList;
import java.util.List;

public class MainGasStation {

	public static void main(String[] args) throws InterruptedException {

		List<FuelHolder> fuelTanks = new ArrayList<FuelHolder>();
		/*List<GasStation> gasStationList = new ArrayList<GasStation>();*/

		for (int i = 0; i < GasMark.values().length; i++) {
			FuelHolder fTank = new Tank(GasMark.values()[i], 100);
			fuelTanks.add(fTank);
			System.out.println(String.format("Имеется Резервуар %s , объемом %s ", GasMark.values()[i],
					fuelTanks.get(i).getTankValue()));
		}

		for (int i = 0; i < 5; i++) {
			Column gasStation = new Column(fuelTanks);
			System.out.println("Начала работать заправка №" + Thread.currentThread().getName());
			gasStation.start();

		}

	}

}