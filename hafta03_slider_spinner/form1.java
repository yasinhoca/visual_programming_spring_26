package hafta03_slider_spinner;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class form1 extends JFrame{
    private JPanel panel;
    private  JSlider slider1;
    private  JSpinner spinner1;
    private  JSlider slider2;
    private  JSpinner spinner2;
    private  JSlider slider3;
    private  JSpinner spinner3;
    private  JButton button1;

    static int r,g,b;

    form1(){
        add(panel);
        setSize(700,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
               spinner1.setValue(slider1.getValue());
                r = slider1.getValue();
                g = slider2.getValue();
                b = slider3.getValue();
                button1.setBackground(new Color(r,g,b));
                slider1.setBackground(new Color(r,0,0));
            }
        });

        spinner1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                slider1.setValue((int)spinner1.getValue());
                r = slider1.getValue();
                g = slider2.getValue();
                b = slider3.getValue();
                button1.setBackground(new Color(r,g,b));
                slider1.setBackground(new Color(r,0,0));
            }
        });

        slider2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                spinner2.setValue(slider2.getValue());
                r = slider1.getValue();
                g = slider2.getValue();
                b = slider3.getValue();
                button1.setBackground(new Color(r,g,b));
                slider2.setBackground(new Color(0,g,0));
            }
        });

        spinner2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                slider2.setValue((int)spinner2.getValue());
                r = slider1.getValue();
                g = slider2.getValue();
                b = slider3.getValue();
                button1.setBackground(new Color(r,g,b));
                slider2.setBackground(new Color(0,g,0));
            }
        });

        slider3.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                spinner3.setValue(slider3.getValue());
                r = slider1.getValue();
                g = slider2.getValue();
                b = slider3.getValue();
                button1.setBackground(new Color(r,g,b));
                slider3.setBackground(new Color(0,0,b));
            }
        });

        spinner3.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                slider3.setValue((int)spinner3.getValue());
                r = slider1.getValue();
                g = slider2.getValue();
                b = slider3.getValue();
                button1.setBackground(new Color(r,g,b));
                slider3.setBackground(new Color(0,0,b));
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
