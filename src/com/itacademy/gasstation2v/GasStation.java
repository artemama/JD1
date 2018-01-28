package com.itacademy.gasstation2v;

import java.util.List;

public class GasStation extends Thread {
	private List<AllTanks> fuelTanks;
	private Car car;
	private GasMark fuelGasMark;
	private int tankValue;
	static int counter = 0;

	public GasStation(List<AllTanks> fuelTanks) {
		this.fuelTanks = fuelTanks;
		/* this.setDaemon(true); */

	}

	@Override
	public void run() {

		while (true) {

			counter++;
			System.out.println("Заехала машина № " + counter);

			this.fuelGasMark = GasMark.values()[(int) (Math.random() * GasMark.values().length)];
			this.tankValue = (int) (Math.random() * 20) + 1;

			Car car = new Car(fuelGasMark, tankValue);
			
			

			synchronized (fuelTanks) {
				for (AllTanks tank : fuelTanks) {
					if ((tank.getFuelGasMark() == car.getFuelGasMark())
							&& (tank.getTankValue() >= car.getTankValue())) {
						tank.setTankValue(tank.getTankValue() - car.getTankValue());

						System.out.println(String.format(
								"Заправляем машину топливом: %s в количестве %s литров\n ---- В резервуаре осталось %s осталось  %s литров",
								car.getFuelGasMark(), car.getTankValue(), tank.getFuelGasMark(), tank.getTankValue()));
						try {
							Thread.sleep(car.getTankValue() * 100);
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
				}
			}
			System.out.println(String.format("Машина № %s заправлена %s л.", counter, car.getTankValue()));

			while (!isEmptyTank()) {
				break;
			}
		}

	}

	public boolean isEmptyTank() {
		int vol = 0;
		synchronized (fuelTanks) {
			for (AllTanks tank : fuelTanks) {
				vol += tank.getTankValue();
			}
			if (vol == 0) {
				System.out.println("Заправка закрыта - нет топлива");
				
			}
			return true;
		}
	}

}
