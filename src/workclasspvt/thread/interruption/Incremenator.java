package workclasspvt.thread.interruption;

public class Incremenator extends Thread {

    private volatile boolean mIsIncrement = true;
    private volatile boolean mFinish = false;

    public int mValue = 0;

    public void changeAction() {
        mIsIncrement = !mIsIncrement;
    }

    public void finish() {
        mFinish = true;
    }

    @Override
    public void run() {
        System.out.print("Значение = ");

        do {
            if (!Thread.interrupted()) {
                if (mIsIncrement) {
                    mValue++;
                } else {
                    mValue--;
                }

                System.out.print(mValue + " ");
            } else {
                return;
            }

            try {
                Thread.sleep(1000);
            } catch (final InterruptedException e) {
            	return;
            }

        } while (true);
    }
}
