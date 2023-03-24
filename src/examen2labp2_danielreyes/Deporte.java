
package examen2labp2_danielreyes;

import java.util.ArrayList;


public class Deporte {
    private String periodo;
    private ArrayList<Torneo> torneos = new ArrayList();

    public Deporte() {
    }

    public Deporte(String periodo) {
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public ArrayList<Torneo> getTorneos() {
        return torneos;
    }

    public void setTorneos(ArrayList<Torneo> torneos) {
        this.torneos = torneos;
    }

    @Override
    public String toString() {
        return "Deporte{" + "periodo=" + periodo + ", torneos=" + torneos + '}';
    }
    
    
}
