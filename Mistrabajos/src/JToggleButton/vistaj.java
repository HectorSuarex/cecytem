
package JToggleButton;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class vistaj extends JFrame {

    JToggleButton tggUno,tggDos,tggTres;
    JLabel etiPrecio, etiInstalacion,etiFormacion,etiAlimentacion,etiResultado;
    JTextField txtPrecio;

    public vistaj() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("TOGGLE BUTTON");
        this.setSize(300, 600);
        this.setResizable(false);
        this.getContentPane().setLayout(new AbsoluteLayout());

         etiPrecio = new JLabel(" Precio Base");
        this.getContentPane().add(etiPrecio, new AbsoluteConstraints(70, 20, 100, 30));

        txtPrecio=new JTextField();
         this.getContentPane().add(txtPrecio, new AbsoluteConstraints(30, 60, 150, 30));
         
         tggUno=new JToggleButton("Instalacion 0");
         this.getContentPane().add(tggUno, new AbsoluteConstraints(30, 100, 150, 30));
         
         tggDos=new JToggleButton("Formacion 0");
         this.getContentPane().add(tggDos, new AbsoluteConstraints(30, 150, 150, 30));
         
         tggTres=new JToggleButton("Alimentacion 0");
         this.getContentPane().add(tggTres, new AbsoluteConstraints(30, 200, 150, 30));
         
         etiResultado=new JLabel();
         this.getContentPane().add(etiResultado, new AbsoluteConstraints(30, 250, 150, 30));
        
         etiResultado.setBorder(new LineBorder(Color.blue));
         this.getContentPane().add(etiResultado,new AbsoluteConstraints(30,250,150,30));
         this.setVisible(true);
    }
    public static void main(String[] args) {
        vistaj v=new vistaj();
      
    }

}

