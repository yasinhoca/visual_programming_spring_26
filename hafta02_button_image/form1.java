package hafta02_button_image;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class form1 extends JFrame {
    private JPanel panel;
    private JButton button1;
    private JButton button2;
    private JLabel lbl1;

    boolean durum = true; //program ilk açıldığında buton açık kabul ediliyor

    form1(){
        add(panel);
        setSize(500,500);
        setTitle("Resimli butonlar");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        Image icon1 = new ImageIcon(this.getClass().getResource("/icon1.png")).getImage();
        button1.setIcon(new ImageIcon(icon1));


        Image acik = new ImageIcon(this.getClass().getResource("/on.png")).getImage();
        button2.setIcon(new ImageIcon(acik));

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(durum){
                    Image kapali = new ImageIcon(this.getClass().getResource("/off.png")).getImage();
                    button2.setIcon(new ImageIcon(kapali));
                    durum=false;
                } else {
                    Image acik = new ImageIcon(this.getClass().getResource("/on.png")).getImage();
                    button2.setIcon(new ImageIcon(acik));
                    durum=true;
                }
            }
        });


        Image kirmizi = new ImageIcon(this.getClass().getResource("/bkirmizi.png")).getImage();
        lbl1.setIcon(new ImageIcon(kirmizi));
        Image mavi = new ImageIcon(this.getClass().getResource("/bmavi.png")).getImage();
        Image yesil = new ImageIcon(this.getClass().getResource("/byesil.png")).getImage();


        lbl1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                super.mouseEntered(e);
                lbl1.setIcon(new ImageIcon(mavi));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                super.mouseExited(e);
                lbl1.setIcon(new ImageIcon(kirmizi));
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
                lbl1.setIcon(new ImageIcon(yesil));
                System.out.println("Butona basıldı!");
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
