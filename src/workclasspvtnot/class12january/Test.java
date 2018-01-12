package workclasspvtnot.class12january;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) throws IOException, InterruptedException {
		List<Hourse> hourses = new ArrayList<>();
		for (int i = 0; i < 6; i++) {
			Hourse hourse = new Hourse();
			hourse.start();
			hourses.add(hourse);
		}

		while (true) {
			
			for (int i = 0; i < hourses.size(); i++) {
				System.out.println("");
				
			}
			for (Hourse hourse : hourses) {
				System.out.println(hourse);
			}

			Thread.sleep(1000);
		}
	}

}
