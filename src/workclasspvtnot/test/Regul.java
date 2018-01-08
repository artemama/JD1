package workclasspvtnot.test;

public class Regul {

	public static void main(String[] args) {
		System.out.println("20985".matches("-?[0-9]+"));

		String str = "Test   string for split";
		String[] words = str.split(" +");
		for (String word : words) {
			System.out.println(word + " ");
		}

	}

}
