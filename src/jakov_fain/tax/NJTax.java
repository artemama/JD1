package jakov_fain.tax;

public class NJTax extends Tax {
	NJTax(double gi, String st, int depen) {
		super(gi, st, depen);
		// TODO Auto-generated constructor stub
	}

	public double adjustForStudents(double tax) {
		return tax - 500;
	}

	@Override
	public double calcTax() {
		if (grossIncome < 50000) {
			return grossIncome * 0.1;

		} else {
			return grossIncome * 0.13;

		}
	}

}