package hafta08_tabbed_pane_list_tree;

import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;

public class form1 extends JFrame{
    private JPanel panel;
    private JTabbedPane tabbedPane1;
    private JList list1;
    private JTree tree1;


    form1(){
        add(panel);
        setSize(500,500);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

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
