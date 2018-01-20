package jakov_fain;

class Tax {

	double grossIncome;
	String state;
	int dependents;
	
	Tax(double gi, String st, int depen) {
		this.grossIncome = gi;
		this.state = st;
		this.dependents = depen;
	}

	public double calcTax() {
		if (grossIncome < 50000) {
			return grossIncome * 0.06;

		} else {
			return grossIncome * 0.08;

		}

	}



	

}
