
package JScrollBar;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class vistac extends JFrame {
    JScrollBar desValor;
    JLabel etiVAlor;

    public vistac() {
         this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("JScrollBar");
        this.setSize(500, 300);
        this.setResizable(false);
        this.getContentPane().setLayout(new AbsoluteLayout());
        
        desValor=new JScrollBar();
        this.getContentPane().add(desValor,new AbsoluteConstraints(20,20,450,20));
        desValor.setOrientation(0);
        etiVAlor=new JLabel();
        this.getContentPane().add(etiVAlor,new AbsoluteConstraints(20,70,300,40));
         etiVAlor.setBorder(new LineBorder(Color.black,5,true));
        this.getContentPane().add(etiVAlor,new AbsoluteConstraints(20,70,300,40));
        
    }
    
    public static void main(String[] args) {
        vistac v=new vistac();
        v.setVisible(true);
    }
}
