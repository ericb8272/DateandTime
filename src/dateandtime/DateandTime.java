/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package dateandtime;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author Eric Benedict
 */
public class DateandTime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateandTime dateandTime = new DateandTime();

    }

    public DateandTime() {


        JFrame frame = new JFrame("Curent Date and Time");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(new Clock());
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public class Clock extends JPanel {

        private JLabel clock;

        public Clock() {
            setLayout(new BorderLayout());
            clock = new JLabel();
            clock.setHorizontalAlignment(JLabel.CENTER);
            seconds();
            add(clock);

            Timer timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    seconds();
                }
            });

            timer.setInitialDelay(0);
            timer.start();
        }

        public void seconds() {
            clock.setText(DateFormat.getDateTimeInstance().format(new Date()));
        }
    }
}
