package Week13;

import java.util.Calendar;
import javax.swing.JLabel;

public class MyClock extends JLabel implements Runnable {

    @Override
    public void run() {
        while (true) {
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
            setText(String.format("%02d:%02d:%02d", hour, min, sec));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
