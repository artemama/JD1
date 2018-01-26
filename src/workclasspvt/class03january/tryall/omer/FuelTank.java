package workclasspvt.class03january.tryall.omer;


public class FuelTank {
	private int fuelTypeTank;
	private int tankAmount;

	public FuelTank(int fuelTypeTank, int tankAmount) {
		this.fuelTypeTank = fuelTypeTank;
		this.tankAmount = tankAmount;
	}

	public int getFuelTypeTank() {
		return fuelTypeTank;
	}

	public void setFuelTypeTank(int fuelTypeTank) {
		this.fuelTypeTank = fuelTypeTank;
	}

	public int getTankAmount() {
		return tankAmount;
	}

	public synchronized void setTankAmount(int tankAmount) {
		this.tankAmount = tankAmount;
	}

}