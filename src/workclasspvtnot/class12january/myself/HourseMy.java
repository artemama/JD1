package workclasspvtnot.class12january.myself;

import java.util.Random;

public class HourseMy extends Thread{
	private int counter;

	@Override
	public void run() {
		while (true) {
			counter += new Random().nextInt(3) + 1;
			
			
		}
	}
	
	

}
