package hafta09_runtime;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.TimerTask;

public class form1 extends JFrame{
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    Random r = new Random();


    form1(){
        add(panel);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x,y,w,h,re,gr,bl,random_harf_kodu;
                x=r.nextInt(300)+50;
                y=r.nextInt(300)+50;
                w=r.nextInt(100)+50;
                h=r.nextInt(100)+50;
                re=r.nextInt(255);
                gr=r.nextInt(255);
                bl=r.nextInt(255);
                char harf;
                random_harf_kodu=r.nextInt(26)+65;
                harf = (char) random_harf_kodu;
                button2.setText(Character.toString(harf));
                button2.setForeground(new Color(255-re,255-gr,255-bl));
                button2.setBounds(x,y,w,h);
                button2.setBackground(new Color(re,gr,bl));
                button3.setBounds(50,50,50,50);

            }
        });
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
