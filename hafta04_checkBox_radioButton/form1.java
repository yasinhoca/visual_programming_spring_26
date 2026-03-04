package hafta04_checkBox_radioButton;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class form1 extends JFrame{
    private JPanel panel;
    private JCheckBox futbolCheckBox;
    private JCheckBox basketbolCheckBox;
    private JCheckBox voleybolCheckBox;
    private JCheckBox hentbolCheckBox;
    private JButton button1;
    private JRadioButton ankaraRadioButton;
    private JRadioButton istanbulRadioButton;
    private JRadioButton izmirRadioButton;
    private JRadioButton bursaRadioButton;
    private JButton button2;

    form1() {
        add(panel);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(futbolCheckBox.isSelected()) System.out.println("Futbol seçildi");
                if(basketbolCheckBox.isSelected()) System.out.println("Basketbol seçildi");
                if(voleybolCheckBox.isSelected()) System.out.println("Voleybol seçildi");
                if(hentbolCheckBox.isSelected()) System.out.println("Hentbol seçildi");
            }
        });

       /* basketbolCheckBox.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if(basketbolCheckBox.isSelected()) System.out.println("Şuan basketbol seçildi");
                else System.out.println("Basketbol seçimi kaldırıldı");
            }
        }); */
        basketbolCheckBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(basketbolCheckBox.isSelected()) System.out.println("Şuan basketbol seçildi");
                else System.out.println("Basketbol seçimi kaldırıldı");
            }
        });

        ButtonGroup bg = new ButtonGroup();
        bg.add(ankaraRadioButton);
        bg.add(istanbulRadioButton);
        bg.add(izmirRadioButton);
        bg.add(bursaRadioButton);

        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ankaraRadioButton.isSelected()) System.out.println("Ankara");
                else if(istanbulRadioButton.isSelected()) System.out.println("İstanbul");
                else if(izmirRadioButton.isSelected()) System.out.println("İzmir");
                else System.out.println("Bursa");
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
