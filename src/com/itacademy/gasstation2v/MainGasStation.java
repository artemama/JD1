package com.itacademy.gasstation2v;

import java.util.ArrayList;
import java.util.List;


public class MainGasStation {

	public static void main(String[] args) throws InterruptedException {

		/* Queue<Car> queue = new ConcurrentLinkedQueue<Car>(); */

		List<AllTanks> fuelTanks = new ArrayList<AllTanks>();
		for (int i = 0; i < GasMark.values().length; i++) {
			AllTanks fTank = new Tank(GasMark.values()[i], 100);
			fuelTanks.add(fTank);
			System.out.println(String.format("Имеется Резервуар %s , объемом %s ", GasMark.values()[i],
					fuelTanks.get(i).getTankValue()));
		}

		List<GasStation> gasStation = new ArrayList<GasStation>();
		for (int i = 0; i < 5; i++) {
			GasStation gasStation1 = new GasStation(fuelTanks);
			gasStation1.start();

		}

		while (!gasStation.isEmpty()) {
			
			CarCreator CarCreator = new CarCreator();
		}

	}

}