package workclasspvt.class03january.tryall.ermak;


import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Test {

	public static void main(String[] args) {
		Queue<Car> cars = new ConcurrentLinkedQueue<>();
		List<Tank> tanks = new ArrayList<>();
		Station station = new Station(tanks);

		for (int i = 0; i < Fuel.values().length; i++) {
			tanks.add(new Tank(Fuel.values()[i], 100));
			System.out.println(String.format("Type %s quantity %s ", Fuel.values()[i], tanks.get(i).getQuantityFuel()));
		}
		for (int i = 0; i < 5; i++) {
			Column column = new Column(tanks, cars);
			column.start();
		}
		
		while (!station.isEmptyTank()) {
			synchronized (cars) {
				if (cars.isEmpty()) {
					cars.add(new Car());
					cars.notify();
				}
			}
			
		}
		


	}

}