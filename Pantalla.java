import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

public class Pantalla{
    private int turno;
     private PropertyChangeSupport controladora;
    
    public Pantalla(){
        turno=0;
        this.controladora= new PropertyChangeSupport(this);
    }

    public void nuevoObservador(PropertyChangeListener listener){
        this.controladora.addPropertyChangeListener(listener);
    }
    public void eliminarObservador(PropertyChangeListener listener){
        this.controladora.removePropertyChangeListener(listener);
    }
    public void setTurno(int turno){
        //firePropertyChange: para emitir un cambio en una de sus propiedades, en este caso en turno
        controladora.firePropertyChange("turno", this.turno, turno);
        this.turno=turno;
    }
    public int getTurno(){
        return turno;
    }
}