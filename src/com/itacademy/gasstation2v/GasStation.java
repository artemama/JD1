package com.itacademy.gasstation2v;

import java.util.List;

public class GasStation extends Thread {
	private List<AllTanks> fuelTanks;
	private GasMark fuelGasMark;
	private int tankValue;

	public GasStation(List<AllTanks> fuelTanks) {
		this.fuelTanks = fuelTanks;

	}

	@Override
	public void run() {

		while (true) {

			this.fuelGasMark = GasMark.values()[(int) (Math.random() * GasMark.values().length)];
			this.tankValue = (int) (Math.random() * 20) + 1;

			Car car = new Car(fuelGasMark, tankValue);
			System.out.println(String.format("\n Машина заехала  на заправку %s \n", Thread.currentThread().getName()));

			synchronized (fuelTanks) {
				for (AllTanks tank : fuelTanks) {
					if ((tank.getFuelGasMark() == car.getFuelGasMark())
							&& (tank.getTankValue() >= car.getTankValue())) {
						tank.setTankValue(tank.getTankValue() - car.getTankValue());

						System.out.println(String.format(
								"-Заправка № %s заправила машину %s в количестве %s литров\n ---- В резервуаре осталось %s -  %s л. \n ",
								Thread.currentThread().getName(), car.getFuelGasMark(), car.getTankValue(),
								tank.getFuelGasMark(), tank.getTankValue()));
					}
					try {
						Thread.sleep(car.getTankValue() * 100);
					} catch (InterruptedException e) {
						e.printStackTrace();

					}
					if ((tank.getFuelGasMark() == car.getFuelGasMark()) && (tank.getTankValue() < car.getTankValue())) {
						System.out.println(String.format(
								"-!-!-Извините, в колонке %s не хватает топлива %s. \n --Остаток %s меньше чем Ваш запрос - %s",
								Thread.currentThread().getName(), car.getFuelGasMark(), tank.getTankValue(),
								car.getTankValue()));

					} else {
						System.out.println(String.format("Машина заправлена %s л. на заправке № %s", car.getTankValue(),
								Thread.currentThread().getName()));

					}

				}
			}

		}
	}

}
