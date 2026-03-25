package hafta06_progress_bar;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class form1 extends JFrame{
    private JPanel panel;
    private JProgressBar progressBar1;
    private JProgressBar progressBar2;

    form1() {
        add(panel);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i = 0; i<=100;i++){
                    try {
                        TimeUnit.MILLISECONDS.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    progressBar1.setValue(i);
                    progressBar2.setValue(i);
                }
            }
        }).start();





    }


    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                form1 f = new form1();
                f.setVisible(true);
            }
        });
    }


    }
