package workclasspvt.factory;

public class CarFactory {
	public static Car build(CarType type) { // метод Билд в КарФактори
		if (type == CarType.LUXURY) {
			return new LuxuryCar();
			
		} else if (type == CarType.SEDAN) {
			return new SedanCar();

		} else if (type == CarType.SMALL) {
			return new SmallCar();

		}

		throw new IllegalArgumentException("Не поддерживаю тип" + type);

	}

}
