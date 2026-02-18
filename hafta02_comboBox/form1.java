package hafta02_comboBox;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class form1 extends JFrame {
    private JPanel panel;
    private JComboBox comboBox1;
    private JButton button1;
    private JComboBox comboBox2;
    private JButton button2;
    private JComboBox comboBox3;
    private JComboBox comboBox4;

    DefaultComboBoxModel model = new DefaultComboBoxModel<>();
    DefaultComboBoxModel model2 = new DefaultComboBoxModel<>();
    DefaultComboBoxModel model3 = new DefaultComboBoxModel<>();

    form1() {
        add(panel);
        setSize(500, 500);
        setTitle("Mouse Eventler");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(comboBox1.getSelectedItem());
                System.out.println(comboBox1.getSelectedIndex());
            }
        });

        for(int i = 0;i<256;i++) model.addElement(i);
        comboBox2.setModel(model);

        for(int i = 0;i<256;i++) model2.addElement(i);
        comboBox3.setModel(model2);

        for(int i = 0;i<256;i++) model3.addElement(i);
        comboBox4.setModel(model3);

        comboBox2.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int r = (int) comboBox2.getSelectedIndex();
                int g = (int) comboBox3.getSelectedIndex();
                int b = (int) comboBox4.getSelectedIndex();

                button2.setBackground(new Color(r,g,b));
                button2.setText(Integer.toString(r) +"-"+Integer.toString(g)+"-"+Integer.toString(b));
            }
        });


        comboBox3.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int r = (int) comboBox2.getSelectedIndex();
                int g = (int) comboBox3.getSelectedIndex();
                int b = (int) comboBox4.getSelectedIndex();

                button2.setBackground(new Color(r,g,b));
                button2.setText(Integer.toString(r) +"-"+Integer.toString(g)+"-"+Integer.toString(b));
            }
        });


        comboBox4.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int r = (int) comboBox2.getSelectedIndex();
                int g = (int) comboBox3.getSelectedIndex();
                int b = (int) comboBox4.getSelectedIndex();

                button2.setBackground(new Color(r,g,b));
                button2.setText(Integer.toString(r) +"-"+Integer.toString(g)+"-"+Integer.toString(b));
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
