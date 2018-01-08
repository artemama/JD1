package workclasspvtnot.test;

public class StrBuild {

	public static void main(String[] args) {
		String str = "I leaarn Java";
		StringBuilder strBuilder = new StringBuilder(str);
		strBuilder.append("и английский тоже надо");

		int array[] = { 1, 2, 3, 4, 5 };

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length; i++) {
			int arrayElement = array[i];

			sb.append(arrayElement);
			if (i < array.length - 1) {
				sb.append(",");
			}

		}

	}

}
