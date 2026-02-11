package hafta01_giris;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class form1 extends JFrame{ // jframe sınıfından miras almamız gerekli
    private JPanel panel;
    private JTextField txt1;
    private JButton button1;


    form1(){  //constructer method
        add(panel);
        setSize(500,500);
        setTitle("İlk Pencerem");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //çalışan pencerenin ram üzerinden de silinmesini sağlar
        txt1.setBackground(new Color(0,125,0));
        txt1.setForeground(Color.WHITE);
        txt1.setText("KONYASPOR");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt1.setBackground(new Color(200,0,0));
                txt1.setForeground(Color.BLACK);
                txt1.setText("KASTAMONUSPOR");
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
