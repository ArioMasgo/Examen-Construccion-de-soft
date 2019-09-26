/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta3;


public class Vehiculo {
    private int cadigo;
    private String marca;
    private String tipo;
    private String modelo;
    private String patente;
    private String kilometraje;

    public Vehiculo(int cadigo, String marca, String tipo, String modelo, String patente, String kilometraje) {
        this.cadigo = cadigo;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.patente = patente;
        this.kilometraje = kilometraje;
    }
    public Vehiculo(){
    }

    public int getCadigo() {
        return cadigo;
    }

    public void setCadigo(int cadigo) {
        this.cadigo = cadigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "cadigo=" + cadigo + ", marca=" + marca + ", tipo=" + tipo + ", modelo=" + modelo + ", patente=" + patente + ", kilometraje=" + kilometraje + '}';
    }
    
    
    }
