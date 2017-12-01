package task04;

public class Rectangle {

	public static void main(String[] args) {
		int a = 5;
		int b = 8;
		double r;

		// надо найти длину диагонали прямоугольника по теореме пифагора

		r = ((Math.sqrt(a * a + b * b)) / 2);
		System.out.println(r + " Радиус круга");
	}

}
