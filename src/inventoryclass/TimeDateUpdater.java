/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventoryclass;

/**
 *
 * @author QCU
 */
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

public class TimeDateUpdater {
    private JLabel timeLabel;

    public TimeDateUpdater(JLabel timeLabel) {
        this.timeLabel = timeLabel;
        startTimer();
    }

    private void startTimer() {
        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                String formattedDate = dateFormat.format(now);
                timeLabel.setText("Current Time: " + formattedDate);
            }
        });

        timer.start();
    }
}

