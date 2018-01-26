package workclasspvt.class03january.tryall.shumaher;

public abstract class FuelHolder {
	private FuelType fuelType;
	private int sizeTank;

	public FuelType getFuelType() {
		return fuelType;
	}

	public int getSizeTank() {
		return sizeTank;
	}

	public void setSizeTank(int sizeTank) {
		this.sizeTank = sizeTank;
	}

	public FuelHolder(FuelType fuelType, int sizeTank) {
		this.fuelType = fuelType;
		this.sizeTank = sizeTank;
	}

}