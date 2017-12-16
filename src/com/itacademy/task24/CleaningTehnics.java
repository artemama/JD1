package com.itacademy.task24;

public abstract class CleaningTehnics extends Electronics {
	private boolean indoor;
	private int volt220;
	private boolean battaru;

	protected boolean isIndoor() {
		return indoor;
	}

	protected void setIndoor(boolean indoor) {
		this.indoor = indoor;
	}

	protected int getVolt220() {
		return volt220;
	}

	protected void setVolt220(int volt220) {
		this.volt220 = volt220;
	}

	protected boolean isBattaru() {
		return battaru;
	}

	protected void setBattaru(boolean battaru) {
		this.battaru = battaru;
	}

}
