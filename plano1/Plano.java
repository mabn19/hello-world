package plano;

public class Plano {

    public static void main(String[] args) {
    Punto3d punto1 = new Punto3d();
    Punto3d punto2 = new Punto3d();
       
    punto1.setX(4);
    punto1.setY(10);
    punto1.setZ(15);
    punto2.setX(16);
    punto2.setY(9);
    punto2.setZ(8);
    
    System.out.println(punto1.distancia());    
    System.out.println(punto2.distancia());
    }
    
}