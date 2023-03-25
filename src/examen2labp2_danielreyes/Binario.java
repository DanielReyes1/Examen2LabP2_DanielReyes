
package examen2labp2_danielreyes;

import java.io.Serializable;


public class Binario implements Serializable{
    private Deporte sport;

    public Binario() {
    }

    public Binario(Deporte sport) {
        this.sport = sport;
    }

    public Deporte getSport() {
        return sport;
    }

    public void setSport(Deporte sport) {
        this.sport = sport;
    }

    @Override
    public String toString() {
        return sport.getNombre();
    }
    
    
    
}
