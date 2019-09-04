
package planocoordenado;

public class PlanoCoordenado {


    public static void main(String[] args) {
       Punto punto1 = new Punto();
       Punto punto2 = new Punto();
       
       punto1.setX(3.7f);
       punto1.setY(3.7f);
       punto2.setX(3);
       punto2.setY(4);
       
        System.out.println(punto1.distancia(punto2));
        System.out.println(punto1.distancia());
    }
    
}
