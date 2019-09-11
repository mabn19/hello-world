package plano;


public class Punto3d extends Punto { 
    private float z;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    
    public double distancia(){
        return Math.sqrt(Math.pow(this.getX(),2)+Math.pow(this.getY(),2)+Math.pow(this.getZ(),2));
    }
    public double distancia(float x, float y, float z){
        return Math.sqrt(Math.pow(this.getX()-x, 2)+Math.pow(this.getY()-y, 2)+Math.pow(this.getZ()-z, 2));
    }
    
}