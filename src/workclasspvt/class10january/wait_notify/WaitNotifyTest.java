package workclasspvt.class10january.wait_notify;

public class WaitNotifyTest {

    public static void main(final String[] args) {
        final Message msg = new Message("обработать");
        final Waiter waiter1 = new Waiter(msg);
        new Thread(waiter1, "waiter1").start();

        final Waiter waiter2 = new Waiter(msg);
        new Thread(waiter2, "waiter2").start();

        final Notifier notifier = new Notifier(msg);
        new Thread(notifier, "notifier").start();
        System.out.println("Стартовали все потоки");
    }

}