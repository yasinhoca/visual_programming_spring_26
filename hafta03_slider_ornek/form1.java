package hafta03_slider_ornek;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class form1 extends JFrame {
    private JPanel panel;
    private JSlider slider1;
    private JLabel lbl1;
    private JLabel lbl2;
    private JSlider slider2;
    private JLabel lbl3;
    private JSlider slider3;
    private JSlider slider4;
    private JLabel lbl4;
    int v,vo,f;
    float ort;

    form1() {
        add(panel);
        setTitle("checkbox ve radiobutton");
        setSize(700, 400);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        slider1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lbl1.setText(Integer.toString(slider1.getValue()));
                v = slider1.getValue();
                vo = slider2.getValue();
                f = slider3.getValue();
                ort = (float) ((0.375 * (float) v) + (0.125 * (float)vo) + (0.50 * (float)f));
                lbl4.setText(Float.toString(ort));
                slider4.setValue(Math.round(ort));
                if(ort>=59.50 && ort<=100) slider4.setBackground(Color.GREEN);
                else if(ort>=54.5 && ort<59.50) slider4.setBackground(Color.ORANGE);
                else slider4.setBackground(Color.RED);
            }
        });
        slider2.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lbl2.setText(Integer.toString(slider2.getValue()));
                v = slider1.getValue();
                vo = slider2.getValue();
                f = slider3.getValue();
                ort = (float) ((0.375 * (float) v) + (0.125 * (float)vo) + (0.50 * (float)f));
                lbl4.setText(Float.toString(ort));
                slider4.setValue(Math.round(ort));
                if(ort>=59.50 && ort<=100) slider4.setBackground(Color.GREEN);
                else if(ort>=54.5 && ort<59.50) slider4.setBackground(Color.ORANGE);
                else slider4.setBackground(Color.RED);

            }
        });
        slider3.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                lbl3.setText(Integer.toString(slider3.getValue()));
                v = slider1.getValue();
                vo = slider2.getValue();
                f = slider3.getValue();
                ort = (float) ((0.375 * (float) v) + (0.125 * (float)vo) + (0.50 * (float)f));
                lbl4.setText(Float.toString(ort));
                slider4.setValue(Math.round(ort));
                if(ort>=59.50 && ort<=100) slider4.setBackground(Color.GREEN);
                else if(ort>=54.5 && ort<59.50) slider4.setBackground(Color.ORANGE);
                else slider4.setBackground(Color.RED);
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
