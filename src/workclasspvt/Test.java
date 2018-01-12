package workclasspvt;

public class Test {

	public static void main(String[] args) {
		PassengerCar passengerCar = new PassengerCar();
		Truck truck = new Truck();

		startTheCar(truck);
		startTheCar(passengerCar);

	}

	private static void startTheCar(PassengerCar passengerCar) {
		passengerCar.move();

	}

	private static void startTheCar(Truck truck) {
		truck.move();
	}

}
