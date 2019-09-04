
package planocoordenado;


public class Punto {
    private float x;
    private float y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Punto(float x, float y) {
        this.x = x;
        this.y = y;
    }
    
    public Punto(){
        this.x=0;
        this.y=0;
    }
    public double distancia(Punto p1){
        return Math.sqrt(Math.pow(this.getX()-p1.getX(), 2)-Math.pow(this.getY()-p1.getY(), 2));
    }
    public double distancia(){
        return Math.sqrt(Math.pow(this.getX(), 2)-Math.pow(this.getY(), 2));
    }
}
