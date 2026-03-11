package hafta05_table_random_matrix;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class form1 extends JFrame{
    private JPanel panel;
    private JTextField textField1;
    private JTextField textField2;
    private JButton btn1;
    private JTable table1;
    static int satir,sutun;
    DefaultTableModel model = new DefaultTableModel();
    Random r = new Random();

    form1(){
        add(panel);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                satir = Integer.parseInt(textField1.getText());
                sutun = Integer.parseInt(textField2.getText());
                model.setRowCount(satir);
                model.setColumnCount(sutun);

                for(int i=0;i<satir;i++){
                    for(int j=0;j<sutun;j++){
                        int s = r.nextInt(100);
                        model.setValueAt(s,i,j);
                    }
                }

                table1.setModel(model);
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
