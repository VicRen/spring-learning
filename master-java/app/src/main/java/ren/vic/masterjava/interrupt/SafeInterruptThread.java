package ren.vic.masterjava.interrupt;

public class SafeInterruptThread extends Thread {
    private static final String TAG = SafeInterruptThread.class.getSimpleName();

    @Override
    public void run() {
        if (!Thread.currentThread().isInterrupted()) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        if (Thread.currentThread().isInterrupted()) {
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
