package Week13;

import javax.swing.JLabel;

public class MyTimer extends JLabel implements Runnable {

    private int time;
    private boolean paused = false;

    @Override
    public void run() {
        // TODO Auto-generated method stub
        while (true) {
            synchronized (this) {
                while (paused) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            int sec = time % 60;
            int min = (time / 60) % 60;
            int hour = (time / 3600) % 24;
            setText(String.format("%02d:%02d:%02d", hour, min, sec));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            time++;
        }
    }

    public synchronized void pauseThread() {
        paused = true;
    }

    public synchronized void resumeThread() {
        paused = false;
        notify();
    }
}
