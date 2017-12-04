package task09;




public class Maxrandnumber {

	public static void main(String[] args) {

		int maximum[] = new int[20];
		for (int i = 0; i < 20; i++) {
			maximum[i] = (int) (Math.random() * 90);
			System.out.print(maximum[i] + " ");
			
		}
	}

}
