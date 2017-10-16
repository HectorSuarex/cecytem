package JScrollBar;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javafx.scene.control.ScrollBar;

public class controladorc implements AdjustmentListener {

    vistac v;

    public controladorc() {
        v = new vistac();
        v.setVisible(true);
        v.desValor.addAdjustmentListener(this);
        v.desValor.setMaximum(100);
        v.desValor.setMinimum(0);
        v.desValor.setUnitIncrement(1);
        v.desValor.setBlockIncrement(20);
        v.desValor.setVisibleAmount(50);

    }

    @Override
    public void adjustmentValueChanged(AdjustmentEvent ae) {
        if (ae.getSource() == v.desValor) {
            v.etiVAlor.setText("El valor es: " + v.desValor.getValue());
        }

    }

    public static void main(String[] args) {
        controladorc c = new controladorc();
    }
}
