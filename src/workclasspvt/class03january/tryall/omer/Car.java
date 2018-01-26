package workclasspvt.class03january.tryall.omer;

public class Car {

	private int fuelTypeCar;
	private int fuelAmount;

	public Car(int fuelTypeCar, int fuelAmount) {
		this.fuelTypeCar = fuelTypeCar;
		this.fuelAmount = fuelAmount;
	}

	public int getFuelTypeCar() {
		return fuelTypeCar;
	}

	public void setFuelTypeCar(int fuelTypeCar) {
		this.fuelTypeCar = fuelTypeCar;
	}

	public int getFuelAmount() {
		return fuelAmount;
	}

	public void setFuelAmount(int fuelAmount) {
		this.fuelAmount = fuelAmount;
	}

}