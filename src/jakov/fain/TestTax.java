package jakov.fain;

public class TestTax {

	public static void main(String[] args) {
		// Tax t = new Tax();

		NJTax t = new NJTax(40000, "NJ", 2);
		/*t.grossIncome = 40000;
		t.dependents = 2;
		t.state = "NJ";*/

		double yourTax = t.calcTax();
		double njt = t.adjustForStudents(yourTax);
		System.out.println("Your tax is " + njt);

	}

}
