package hafta01_mouseEvents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;

public class form1 extends JFrame{
    private JPanel panel;
    private JButton btn1;

    form1(){
        add(panel);
        setSize(500,500);
        setTitle("Mouse Events");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        btn1.setBackground(Color.WHITE);

        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                System.out.println("imleç butonun üstüne geldi!");
                btn1.setBackground(Color.RED);
            }
        });

        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                System.out.println("imleç butonun üstünden çekildi!");
                btn1.setBackground(Color.WHITE);
            }
        });

        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
                System.out.println("mouse butonuna basıldı");
                btn1.setBackground(Color.GREEN);
            }
        });


        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                System.out.println("mouse butonuna basıldı şimdi bırakıldı");
                btn1.setBackground(Color.BLUE);
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
