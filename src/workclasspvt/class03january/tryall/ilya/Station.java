package workclasspvt.class03january.tryall.ilya;

import java.util.concurrent.CopyOnWriteArrayList;

public class Station extends Thread {
	@Override
	public void run() {
		while (Tunks.tunksIsEmpty()) {
			if (!Car.cars.isEmpty()) {
				Car car1 = Car.cars.poll();
				getFuel(car1);
			}
		}
	}

	public void getFuel(Car car) {
		int qnt = car.getQuantityOfFuel();
		FuelType fuelType = car.getFuelType();
		Tunks tunk = selectTunk(fuelType);
		if (qnt <= tunk.getQuantity().get() && qnt >= 0) {
			tunk.setQuantity(tunk.getQuantity().get() - qnt);
			while (qnt != 0) {
				qnt -= 1;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println(
					"Машину заправила колонка " + Thread.currentThread().getName() + " на " + car.getQuantityOfFuel()
							+ " литров, осталось " + tunk.getQuantity().get() + " " + car.getFuelType().name());
		} else {
			System.out.println("Уступи место, не хватает " + car.getFuelType().name());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private Tunks selectTunk(FuelType fuelType) {
		CopyOnWriteArrayList<Tunks> tunks = Tunks.getTunks();
		for (Tunks tunk : tunks) {
			if (tunk.getFuelType() == fuelType) {
				return tunk;
			}
		}
		throw new IllegalArgumentException("Нет такого топлива на заправке");
	}

}