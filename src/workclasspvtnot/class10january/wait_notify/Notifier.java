package workclasspvtnot.class10january.wait_notify;

public class Notifier implements Runnable {

    private final Message msg;

    public Notifier(final Message msg) {
        this.msg = msg;
    }

    @Override
    public void run() {
        final String name = Thread.currentThread().getName();
        System.out.println(name + " стартовал");
        try {
            Thread.sleep(1000);
            synchronized (msg) {
                msg.setMsg(name + " поток Notifier отработал");
                msg.notify();
                // msg.notifyAll();
            }
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }
    }
}