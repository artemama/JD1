package com.itacademy.gasstation2v;

import java.util.List;


public class GasStation extends Thread {
	private List<AllTanks> fuelTanks;
	private Car car;

	public GasStation(List<AllTanks> fuelTanks) {
		this.fuelTanks = fuelTanks;
		this.setDaemon(true);

	}

	@Override
	public void run() {

		while (true) {

			fillingCar();

		}
	}
	private void fillingCar() {
		CarCreator carCreator = new CarCreator();
		
	}

	public boolean fillingCar1() {
		CarCreator carCreator = new CarCreator();
		synchronized (fuelTanks) {
			for (AllTanks tank : fuelTanks) {
				if ((tank.getFuelGasMark() == car.getFuelGasMark()) && (tank.getTankValue() >= car.getTankValue())) {
					tank.setTankValue(tank.getTankValue() - car.getTankValue());
					System.out.println(String.format("Fill car (%s -- %s)---- Tank (%s -- %s)", car.getFuelGasMark(),
							car.getTankValue(), tank.getFuelGasMark(), tank.getTankValue()));
					return true;
				}
			}
			System.out.println("Not enough fuel. Try next car");
			return false;
		}
	}
	public boolean isEmptyTank() {
		int vol = 0;
		synchronized (fuelTanks) {
			for (AllTanks tank : fuelTanks) {
				vol += tank.getTankValue();
			}
			if (vol == 0) {
				System.out.println("Заправка закрыта, нет топлива");
				return true;
			} else {
				return false;
			}
		}
	}

}
