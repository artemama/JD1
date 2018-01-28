package com.itacademy.gasstation1v;

import com.itacademy.gasstation2v.AllTanks;

import workclasspvt.class03january.tryall.shumaher.FuelType;

abstract class Tank {
	public void setGasMark(GasMark gasMark) {
		this.gasMark = gasMark;
	}
	private int qantityTank;
	private GasMark gasMark;

	public Tank(int qantityTank, GasMark gasMark) {
		
		this.qantityTank = qantityTank;
		this.gasMark = gasMark;
	}

	public int getQantityTank() {
		return qantityTank;
	}

	public void setQantityTank(int qantityTank) {
		this.qantityTank = qantityTank;
	}

	public GasMark getGasMark() {
		return gasMark;
	}
	public Tank(GasMark gasMark, int qantityTank) {
		super();
	}
	

}