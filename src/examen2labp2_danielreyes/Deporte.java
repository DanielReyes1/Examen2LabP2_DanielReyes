
package examen2labp2_danielreyes;

import java.io.Serializable;
import java.util.ArrayList;


public class Deporte implements Serializable{
    private String nombre;
    private ArrayList<Torneo> torneos = new ArrayList();

    public Deporte() {
    }

    public Deporte(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
