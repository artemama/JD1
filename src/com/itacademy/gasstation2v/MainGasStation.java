package com.itacademy.gasstation2v;

import java.util.ArrayList;
import java.util.List;

public class MainGasStation {

	public static void main(String[] args) throws InterruptedException {

		List<AllTanks> fuelTanks = new ArrayList<AllTanks>();
		/*List<GasStation> gasStationList = new ArrayList<GasStation>();*/

		for (int i = 0; i < GasMark.values().length; i++) {
			AllTanks fTank = new Tank(GasMark.values()[i], 100);
			fuelTanks.add(fTank);
			System.out.println(String.format("Имеется Резервуар %s , объемом %s ", GasMark.values()[i],
					fuelTanks.get(i).getTankValue()));
		}

		for (int i = 0; i < 5; i++) {
			GasStation gasStation = new GasStation(fuelTanks);
			System.out.println("Начала работать заправка №" + Thread.currentThread().getName());
			gasStation.start();

		}

	}

}