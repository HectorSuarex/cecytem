
package JSpinner;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class svista extends JFrame{
    JSpinner spiValor;
    JLabel etiValor;

    public svista() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("*SPINNER*");
        this.setSize(300, 300);
        this.setResizable(false);
        this.getContentPane().setLayout(new AbsoluteLayout());
        
        spiValor=new JSpinner();
         this.getContentPane().add(spiValor, new AbsoluteConstraints(30, 50, 100, 30));
        
         etiValor = new JLabel();
        this.getContentPane().add(etiValor, new AbsoluteConstraints(30, 100, 100, 30));
        
        etiValor.setBorder(new LineBorder(Color.black));
         this.getContentPane().add(etiValor,new AbsoluteConstraints(30,100,100,30));
         this.setVisible(true);

       
    }
    public static void main(String[] args) {
          svista v=new svista();
    }
    
}
