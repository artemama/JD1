package com.itacademy.task24;

abstract class Electronics {
	private String name;
	private String brand;
	private String color;
	private Boolean switchOn;

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected String getBrand() {
		return brand;
	}

	protected void setBrand(String brand) {
		this.brand = brand;
	}

	protected String getColor() {
		return color;
	}

	protected void setColor(String color) {
		this.color = color;
	}

	protected Boolean getSwitchOn() {
		return switchOn;
	}

	protected void setSwitchOn(Boolean switchOn) {
		this.switchOn = switchOn;
		switchOn = true;
	}

	protected boolean checkStatus() {
		return true;
	}

	protected void on() {
		switchOn = true;
	}

	protected void off() {
		switchOn = false;
	}

	protected void printStatus() {
		if (switchOn) {
			System.out.println("On");
		} else {
			System.out.println("Off");
		}
	}

}
