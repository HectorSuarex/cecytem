package JSpinner;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JToggleButton;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.AncestorEvent;
import javax.swing.event.AncestorListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class scontrolador implements ChangeListener {

    svista v;

    public scontrolador() {
        v = new svista();
        v.spiValor.getChangeListeners();
        v.spiValor.addChangeListener(this);
        
       
        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setMaximum(10);
        nm.setMinimum(0);
        nm.setStepSize(1);
        v.spiValor.setModel(nm);
    }

    public static void main(String[] args) {
        scontrolador c = new scontrolador();
    }




    

    @Override
    public void stateChanged(ChangeEvent ce) {
       v.etiValor.setText("El valor es: " + v.spiValor.getValue().toString());
    }

    
}
