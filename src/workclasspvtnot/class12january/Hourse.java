package workclasspvtnot.class12january;

import java.util.Random;

public class Hourse extends Thread {
	private static final int FULL_DISTANCE = 60;
	private int counter;
	private Integer distanceTime;

	@Override
	public void run() {
		long startTime = System.currentTimeMillis();
		while (true) {
			counter += new Random().nextInt(3) + 1; 									// счетчик 

			if (counter >= FULL_DISTANCE) {
				distanceTime = (int) ((System.currentTimeMillis() - startTime) / 1000);
				return;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public String toString() {
		int j = 0;
		StringBuilder sb = new StringBuilder();
		while (j < counter) {
			sb.append("-");
			j++;
		}
		sb.append(getName());
		sb.append(">");

		while (j < FULL_DISTANCE) {
			sb.append(" ");
			j++;
		}
		sb.append("|");

		if (distanceTime != null) {
			sb.append(distanceTime + " seconds");
		}
		return sb.toString();
	}
}
