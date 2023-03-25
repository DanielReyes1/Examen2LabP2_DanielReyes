
package examen2labp2_danielreyes;


import javax.swing.JProgressBar;


public class Barra extends Thread{
    private JProgressBar barra;
    private boolean estado;

    public Barra(JProgressBar barra, boolean estado) {
        this.barra = barra;
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    @Override
    public String toString() {
        return "Barra{" + "barra=" + barra + '}';
    }

    @Override
    public void run() {
        while(true){
            if(estado == true){
                barra.setValue(barra.getValue()+100);
                if(barra.getValue()==100){
                    estado =false;
                }                
            } //FIN IF
            
            try {
                Thread.sleep(7000);
            } catch (InterruptedException ex) {
            }
        }
    }
    
}
