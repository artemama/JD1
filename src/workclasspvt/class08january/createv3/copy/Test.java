package workclasspvt.class08january.createv3.copy;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main thread started");
		Thread.sleep(1000);

		MyThread myThread = new MyThread();
		// myThread.setDaemon(true); // ����� ����� ����������� ��� ���������� ���������
		// ��������
		myThread.setName("Thread 1");
		myThread.setPriority(10);
		myThread.start(); // ����������� ���������� ����� ����� - �� ����� ���

		Thread myThread2 = new Thread(new Runnable() {

			@Override
			public void run() {
				String name = Thread.currentThread().getName();

				int i = 0;
				while (i < 100) {
					i++;
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(name + i);
				}

				System.out.println(name + "My thread2 started");
				System.out.println(name + "My thread2 ended");

			}
		});
		myThread.setPriority(1);
		myThread2.setName("Thread 2");
		System.out.println("Main thread ended");

	} // - ��������� ��������������� �������������, �� ������ ������������

}
