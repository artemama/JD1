package com.itacademy.task24;

public abstract class AudioTehnics extends Electronics {
	boolean indoor;
	boolean volt220;
	boolean battaru;

	abstract void on();

	public boolean isVolt220() {
		return volt220;
	}

	public void seton() {
		this.volt220 = volt220;
	}

	abstract void off();

	abstract void upVol();

	abstract void downVol();

}
