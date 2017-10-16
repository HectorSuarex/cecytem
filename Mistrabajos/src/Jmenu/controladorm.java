
package Jmenu;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.EventListener;
import javax.swing.DefaultListModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class controladorm implements ActionListener {

    vistam v;

    public controladorm() {
        v = new vistam();
        v.setVisible(true);
        v.menuItemRojo.addActionListener(this);
        v.menuItemAzul.addActionListener(this);
        v.menuItemVerde.addActionListener(this);

    }

    public static void main(String[] args) {
        controladorm c = new controladorm();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == v.menuItemRojo) {

            v.getContentPane().setBackground(Color.RED);

        }
        if (ae.getSource() == v.menuItemAzul) {

            v.getContentPane().setBackground(Color.BLUE);

        }
        if (ae.getSource() == v.menuItemVerde) {

           v.getContentPane().setBackground(Color.GREEN);

        }

    }
}


