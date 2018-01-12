package workclasspvt.class08january.createv1;

import workclasspvt.class08january.createv2.MyRunnable;

public class Test {

	public static void main(String[] args) {
		System.out.println("Main thread started");

		MyThread myThread = new MyThread();
		// myThread.setDaemon(true); // ����� ����� ����������� ��� ���������� ���������
		// ��������
		myThread.setName("Thread 1");
		myThread.start(); // ����������� ���������� ����� ����� - �� ����� ���

		Thread myThread2 = new Thread(new MyRunnable());
		myThread2.setName("Thread 2");
		System.out.println("Main thread ended");

	} // - ��������� ��������������� �������������, �� ������ ������������

}
