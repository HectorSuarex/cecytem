
package Jmenu;
import java.awt.Color;
import javax.swing.*;

import javax.swing.border.LineBorder;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;

public class vistam extends JFrame {

    JMenuBar barraMenus;
    JMenu menuArchivo, menuEdicion, menuInsertar, menuColores;
    JMenuItem menuItemAbrir, menuItemGuardar, menuSalir, menuItemRojo, menuItemVerde, menuItemAzul;
    JSeparator separador1;

    public vistam() {
        this.setTitle("*/MENU/*");
        this.setSize(400, 300);
        this.getContentPane().setLayout(new AbsoluteLayout());

        barraMenus = new JMenuBar();
        this.getContentPane().add(barraMenus, new AbsoluteConstraints(0, 0, 500, 40));

        menuArchivo = new JMenu("Archivo");
        menuItemAbrir = new JMenuItem("Abrir");
        menuItemGuardar = new JMenuItem("Guardar");
        separador1 = new JSeparator();
        menuSalir = new JMenuItem("Salir");
        barraMenus.add(menuArchivo);
        menuArchivo.add(menuItemAbrir);
        menuArchivo.add(menuItemGuardar);
        menuArchivo.add(separador1);
        menuArchivo.add(menuSalir);

        menuEdicion = new JMenu("Edicion");
        menuColores = new JMenu("Colores");
        menuItemRojo = new JMenuItem("Rojo");
        menuItemVerde = new JMenuItem("Verde");
        menuItemAzul = new JMenuItem("Azul");
        barraMenus.add(menuEdicion);
        menuEdicion.add(menuColores);
        menuColores.add(menuItemRojo);
        menuColores.add(menuItemVerde);
        menuColores.add(menuItemAzul);

        menuInsertar = new JMenu("Insertar");
        barraMenus.add(menuInsertar);

    }

    public static void main(String[] args) {
        vistam v = new vistam();
        v.setVisible(true);

    }
}

