package com.itacademy.Part1.task24;

public abstract class AudioTehnics extends Electronics {
	private boolean indoor;
	private boolean volt220;
	private boolean battary;

	abstract void upVol();

	abstract void downVol();

	/**
	 * @return the indoor
	 */
	protected boolean isIndoor() {
		return indoor;
	}

	/**
	 * @param indoor
	 *            the indoor to set
	 */
	protected void setIndoor(boolean indoor) {
		this.indoor = indoor;
	}

	/**
	 * @return the volt220
	 */
	protected boolean isVolt220() {
		return volt220;
	}

	/**
	 * @param volt220
	 *            the volt220 to set
	 */
	protected void setVolt220(boolean volt220) {
		this.volt220 = volt220;
	}

	/**
	 * @return the battary
	 */
	protected boolean isBattary() {
		return battary;
	}

	/**
	 * @param battary
	 *            the battary to set
	 */
	protected void setBattary(boolean battary) {
		this.battary = battary;
	}

	public void play() {
		// TODO Auto-generated method stub
		
	}

}