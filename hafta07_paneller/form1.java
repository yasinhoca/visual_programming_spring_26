package hafta07_paneller;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 extends JFrame{
    private JPanel panel;
    private JPanel ust;
    private JPanel solalt;
    private JPanel sagalt;
    private JPanel ustsol;
    private JPanel ustsag;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JButton button1;
    boolean gosterim = true;

    form1() {
        add(panel);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(gosterim) {
                    ustsol.setVisible(false);
                    gosterim=false;
                    button1.setText("AÇ");
                } else {
                    ustsol.setVisible(true);
                    gosterim=true;
                    button1.setText("KAPAT");
                }
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
