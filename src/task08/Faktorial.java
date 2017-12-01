package task08;

public class Faktorial {

	public static void main(String[] args) {

		double sr = 0;
		double factorial = 1;
		int n = 0;
		int x = (int) (Math.random() * 20);
		while (x != 0) {
			factorial *= x;
			n++;
			x = (int) (Math.random() * 20);
		}
		if (n != 0) {
			sr = factorial * n;
		} else {
			sr = 0;
		}
		System.out.println("Факториал:" + sr);

	}

}
