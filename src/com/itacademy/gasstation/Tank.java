package com.itacademy.gasstation;

import java.util.List;

public class Tank {
	private void GasType() {
		GasMark.values();
											
		GasMark mark95 = GasMark.gas95;
		GasMark mark92 = GasMark.gas92;
		GasMark markDisel = GasMark.disel;

		System.out.println("Tank Gas95 = " + mark95.value());
		System.out.println("Tank Gas92 = " + mark92.value());
		System.out.println("Tank Disel = " + markDisel.value());
		
		//List<E>

	}

}
