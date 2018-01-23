package workclasspvt.thread.synchronization;

public class CounterTester {
    public static void main(final String[] args) throws InterruptedException {
        final Counter counter = new Counter();										
        
        for (int i = 0; i < 200; i++) {									// создает 200 потоков счетчика
            final CounterThread ct = new CounterThread(counter);
            ct.start();
        }
        Thread.sleep(1000);

        System.out.println("Counter:" + counter.getCounter());
    }
}

class Counter {                                 			//просто класс
    private long counter = 0L;

    public synchronized void increaseCounter() {
        counter++;
    }

    public long getCounter() {
        return counter;
    }
}

class CounterThread extends Thread {                       // класс поток
    private final Counter counter;

    public CounterThread(final Counter counter) {
        this.counter = counter;
    }

    @Override												// в цикле вызвать 1000 р счетчик +1
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.increaseCounter();
        }
    System.out.println(Thread.currentThread().getName() + " - completes");
    }
    
}