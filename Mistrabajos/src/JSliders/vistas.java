package JSliders;

import java.awt.Color;
import javax.swing.*;
import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.*;

public class vistas extends JFrame {

    JSlider sldDeslizador;    
    JLabel etiValor;
    
    public vistas() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Slider");
        this.setSize(630, 300);
        this.setResizable(false);
        this.getContentPane().setLayout(new AbsoluteLayout());
        
        sldDeslizador = new JSlider();
        this.getContentPane().add(sldDeslizador, new AbsoluteConstraints(30, 20, 500, 50));
        
        etiValor = new JLabel();
        this.getContentPane().add(etiValor, new AbsoluteConstraints(30, 150, 500, 30));
        etiValor.setBorder(new LineBorder(Color.BLACK, 3, true));
        this.getContentPane().add(etiValor, new AbsoluteConstraints(30, 150, 500, 30));
        this.setVisible(true);
        sldDeslizador.setMaximum(500);
        sldDeslizador.setMinimum(100);
        sldDeslizador.setValue(400);
        sldDeslizador.setMajorTickSpacing(50);
        sldDeslizador.setPaintTicks(true);
        sldDeslizador.setPaintLabels(true);
    }

    public static void main(String[] args) {
        vistas v = new vistas();
        v.setVisible(true);
        
    }
}
