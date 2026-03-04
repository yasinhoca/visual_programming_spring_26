package hafta04_text_araclari;

import javax.swing.*;
import javax.swing.text.MaskFormatter;
import java.text.ParseException;

public class form1 extends JFrame {
    private JPanel panel;
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JTextArea textArea1;
    private JTextPane textPane1;
    private JEditorPane editorPane1;
    private JFormattedTextField formattedTextField1;

    form1() {
        add(panel);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //passwordField1.getText();
        //passwordField1.getPassword();
        textArea1.setText("Ben textarea için yazılmış bir metinim." +
                "\n ben de yeni bir satırım" +
                "\n ben de yeni bir satırım" +
                "\n\n\n ben de yeni bir satırım");

        //formatted textfield
        try {
            MaskFormatter mf = new MaskFormatter("(5##) UUU LL AA");
            mf.install(formattedTextField1);
            // Sadece sayı girişi için #
            // Sadece büyük harf için U  (upper)
            // Sadece küçük harf için L  (Lower)
            // Alphanumeric sayı ve harf girişi için A
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

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
