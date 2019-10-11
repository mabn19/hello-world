package calculadora;

import java.util.Scanner;

public class Complejo {

    private float parteReal, parteImaginaria;

    public void setparteReal(float parteReal) {
        this.parteReal = parteReal;
    }

    public void setparteImaginaria(float parteImaginaria) {
        this.parteImaginaria = parteImaginaria;
    }

    public float getparteReal() {
        return parteReal;
    }

    public float getparteImaginaria() {
        return parteImaginaria;
    }

    public Complejo() {
        this.parteImaginaria = 0;
        this.parteReal = 0;
    }

    public Complejo(float a, float b) {
        this.parteImaginaria = a;
        this.parteReal = b;
    }

    public Complejo(Complejo comp) {
        this.parteImaginaria = comp.getparteImaginaria();
        this.parteReal = comp.getparteReal();
    }
  
    public Complejo Suma(Complejo comp) {
        this.parteReal = this.parteReal + comp.parteReal;
        this.parteImaginaria = this.parteImaginaria + comp.parteImaginaria;
        return this;
    }

    public Complejo resta(Complejo comp) {
        this.parteReal = this.parteReal - comp.parteReal;
        this.parteImaginaria = this.parteImaginaria - comp.parteImaginaria;
        return this;
    }

    public Complejo multiplicacion(Complejo comp) {
        this.parteReal = (this.parteReal * comp.parteReal) - (this.parteImaginaria * comp.parteImaginaria);
        this.parteImaginaria = (this.parteReal * comp.parteImaginaria) + (this.parteImaginaria * comp.parteReal);
        return this;
    }

    public Complejo division(Complejo comp) {
        this.parteReal = (this.multiplicacion(comp.conjugada()).getparteReal()) / (comp.multiplicacion(comp.conjugada()).getparteReal());
        this.parteImaginaria = (this.multiplicacion(comp.conjugada()).getparteImaginaria()) / (comp.multiplicacion(comp.conjugada()).getparteReal());
        return this;
    }

    public double norma() {
        return Math.sqrt((this.parteReal * this.parteReal) + (this.parteImaginaria * this.parteImaginaria));
    }

    public Complejo conjugada() {
        this.parteImaginaria = -this.parteImaginaria;
        return this;
    }
    
    public void ingresarDatos() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor, ingrese la parte real:");
        this.parteReal=scan.nextFloat();
        System.out.println("Por favor, ingrese la parte imaginaria:");
        this.parteImaginaria=scan.nextFloat();
    }
    public String mostrar(){
        if(this.parteImaginaria >= 0){
            return (this.parteReal + "+" + this.parteImaginaria + "i");
        }
        else {
            return (this.parteReal + this.parteImaginaria + "i");
        } 
    }

    Complejo suma(Complejo comp2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
