package workclasspvtnot.class08january.createv1;

import workclasspvtnot.class08january.createv2.MyRunnable;

public class Test {

	public static void main(String[] args) {
		System.out.println("Main thread started");

		MyThread myThread = new MyThread();
		// myThread.setDaemon(true); // поток демон завершаетс€ при завершении основного
		// процесса
		myThread.setName("Thread 1");
		myThread.start(); // об€зательно вызываетс€ метод —тарт - не метод –ан

		Thread myThread2 = new Thread(new MyRunnable());
		myThread2.setName("Thread 2");
		System.out.println("Main thread ended");

	} // - результат многопоточности непредсказуем, не всегда отрабатывает

}
