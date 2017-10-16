
package JSliders;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
public class controladors implements ChangeListener{
   vistas v;

    public controladors() {
        v=new vistas();
        v.setVisible(true);
        v.sldDeslizador.addChangeListener(this);
    }
    public static void main(String[] args) {
        controladors c=new controladors();
    }

    @Override
    public void stateChanged(ChangeEvent ce) {
        v.etiValor.setText("El valos es: "+v.sldDeslizador.getValue());
    }
    
}
