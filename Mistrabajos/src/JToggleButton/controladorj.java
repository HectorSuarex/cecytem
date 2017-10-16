package JToggleButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;

public class controladorj implements ActionListener {

    vistaj v;

    public controladorj() {
        v = new vistaj();
        v.tggUno.addActionListener(this);
        v.tggDos.addActionListener(this);
        v.tggTres.addActionListener(this);
    }

    public static void main(String[] args) {
        controladorj cj = new controladorj();

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        double precio_base = esNumero(v.txtPrecio.getText());
        double precio_instal = 40;
        double precio_for = 200;
        double precio_ali = 200;
        double precio_total;
        precio_total = precio_base;
        if (v.tggUno.isSelected()) {
            precio_total += precio_instal;
            v.tggUno.setText("Instalación 40");
        } else {
            v.tggUno.setText("Instalación 0");
        }

        if (v.tggDos.isSelected()) {
            precio_total += precio_for;
            v.tggDos.setText("Formación 200");
        } else {
            v.tggDos.setText("Formación 0");
        }

        if (v.tggTres.isSelected()) {
            precio_total += precio_ali;
            v.tggTres.setText("Alimentación 200");
        } else {
            v.tggTres.setText("Alimentación 0");
        }
        v.etiResultado.setText(precio_total + " €");

    }

    public int esNumero(String t) {
        int x;
        try {
            x = Integer.parseInt(t);
        } catch (Exception e) {
            x = 0;
        }
        return x;
    }

}
