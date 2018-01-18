package com.itacademy.gasstation;

public enum GasMark {

	gas95(1000), gas92(1000), disel(1000);

	private Integer value;

	protected Integer getValue() {
		return value;
	}

	GasMark(int value) {
		this.value = value;
	}

	public int value() {
		return value;
	}

	public String toString() { 									// return quantity gas
		return getClass().getSimpleName() + "GasMark.values()";

	}

}
