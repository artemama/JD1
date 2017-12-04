package task09;

public class MaxNumber {

	public static void main(String[] args) {

		double sr = 0;
		double sum = 0;
		int n = 0;
		int x = (int) (Math.random() * 20);
		while (x != 0) {
			sum += x;
			n++;
			x = (int) (Math.random() * 20);
		}
		if (n != 0) {
			sr = sum / n;
		} else {
			sr = 0;
		}
		System.out.println("среднее:" + sr);
	}

}
