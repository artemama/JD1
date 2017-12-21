package packTestNotForCheck.homeWork2112;

import java.io.FileReader;
import java.io.IOException;

public class IOMain {

	public static void main(String[] args) throws IOException {
		FileReader reader;
		reader = new FileReader("hello.txt");
		int res = reader.read();
		while (res != -1) {
			System.out.print((char) res);
			res = reader.read();
		}
		reader.close();

	}

}
