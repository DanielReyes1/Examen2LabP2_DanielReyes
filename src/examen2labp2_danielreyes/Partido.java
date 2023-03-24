
package examen2labp2_danielreyes;


public class Partido {
    private String nombreuno;
    private String nombredos;
    private int puntajeuno;
    private int puntajedos;

    public Partido() {
    }

    public Partido(String nombreuno, String nombredos, int puntajeuno, int puntajedos) {
        this.nombreuno = nombreuno;
        this.nombredos = nombredos;
        this.puntajeuno = puntajeuno;
        this.puntajedos = puntajedos;
    }

    public String getNombreuno() {
        return nombreuno;
    }

    public void setNombreuno(String nombreuno) {
        this.nombreuno = nombreuno;
    }

    public String getNombredos() {
        return nombredos;
    }

    public void setNombredos(String nombredos) {
        this.nombredos = nombredos;
    }

    public int getPuntajeuno() {
        return puntajeuno;
    }

    public void setPuntajeuno(int puntajeuno) {
        this.puntajeuno = puntajeuno;
    }

    public int getPuntajedos() {
        return puntajedos;
    }

    public void setPuntajedos(int puntajedos) {
        this.puntajedos = puntajedos;
    }

    @Override
    public String toString() {
        return "Partido{" + "nombreuno=" + nombreuno + ", nombredos=" + nombredos + ", puntajeuno=" + puntajeuno + ", puntajedos=" + puntajedos + '}';
    }
    
    
}
