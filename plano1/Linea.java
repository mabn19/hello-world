
package plano;


public class Linea {
   private Punto puntoinc = new Punto();
   private Punto puntofin = new Punto();

    public Punto getPuntoinc() {
        return puntoinc;
    }

    public void setPuntoinc(Punto puntoinc) {
        this.puntoinc = puntoinc;
    }

    public Punto getPuntofin() {
        return puntofin;
    }

    public void setPuntofin(Punto puntofin) {
        this.puntofin = puntofin;
    }

    public void movhorizontal(float b){
        puntoinc.movhorizontal(b);
        puntofin.movhorizontal(b);
        
    }

   
}
