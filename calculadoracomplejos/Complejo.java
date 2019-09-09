/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomplejos;

/**
 *
 * @author Estudiantes
 */
public class Complejo {
    private float real, imag;

    public float getReal() {
        return real;
    }

    public void setReal(float real) {
        this.real = real;
    }

    public float getImag() {
        return imag;
    }

    public void setImag(float imag) {
        this.imag = imag;
    }

    public Complejo(float real, float imag) {
        this.real = real;
        this.imag = imag;
    }
    public Complejo() {
        this.real = 0;
        this.imag = 0;
    }
    public void suma (Complejo comp){
        this.real=this.getReal()+comp.getReal();
        this.imag=this.getImag()+comp.getImag();
    }
    public void resta (Complejo comp){
        this.real=this.getReal()-comp.getReal();
        this.imag=this.getImag()-comp.getImag();
    }
    public void multiplicacion(Complejo comp){
        
    }
    public void division(Complejo comp){
        
    }
    public void norma(Complejo comp){
        
    }
    public void conjugada(Complejo comp){
        
    }
}
    
