package workclasspvt.class08january.createv3.copy;

public class MyThread extends Thread {

	@Override
	public void run() {
		String name = Thread.currentThread().getName();
		System.out.println(name + "My thread2 started");

		int i = 0;
		while (i < 100) {
			i++;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(name + i);

		System.out.println(name + "My thread started");

		System.out.println(name + "My thread ended");
	}
}