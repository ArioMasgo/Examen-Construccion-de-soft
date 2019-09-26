/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta2;

/**
 *
 * @author ARIO
 */
public class Complejo {
     private double real;
    private double imag;
  
    
    public Complejo() {
   
    }
   
    public Complejo(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    
    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }
    
    public Complejo sumar(Complejo c){
        Complejo aux = new Complejo();
        aux.real = real + c.real;
        aux.imag = imag + c.imag;
        return aux;
    }
    
    public Complejo multiplicar(Complejo c){
        Complejo aux = new Complejo();
        aux.real = real * c.real - imag * c.imag;
        aux.imag = real * c.imag + imag * c.real;
        return aux;
    }
   
    public Complejo multiplicar(double n){
        Complejo aux = new Complejo();
        aux.real = real * n;
        aux.imag = imag * n;
        return aux;
    }
   
    @Override
    public String toString() {
        return "(" + real + ", " + imag + ")";
    }

   
    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Complejo other = (Complejo) obj;
        if (this.real != other.real) {
            return false;
        }
        if (this.imag != other.imag) {
            return false;
        }
        return true;
    } 
}
