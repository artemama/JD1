package workclasspvtnot.class08january.createv1;

public class MyThread extends Thread {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "My thread2 started");

		int i = 0;
		while (i < 100) {
			i++;
			System.out.println(name + i);

		}

		System.out.println(name + "My thread started");

		System.out.println(name + "My thread ended");
	}
}
