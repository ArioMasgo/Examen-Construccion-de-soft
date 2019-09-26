/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta3;


public class metodoVehiculo {
    Vehiculo vec[]= new Vehiculo[50];
    private int indice=0;
    
    
    public Vehiculo CrearVehiculo(int cadigo, String marca, String tipo, String modelo, String patente, String kilometraje){
        Vehiculo temp = new Vehiculo();
        temp.setCadigo(cadigo);
        temp.setMarca(marca);
        temp.setTipo(tipo);
        temp.setModelo(modelo);
        temp.setPatente(patente);
        temp.setKilometraje(kilometraje);
        return temp;
    }
    
    public void IngresoVehiculo(int cadigo, String marca, String tipo, String modelo, String patente, String kilometraje){
        vec[indice]=CrearVehiculo(cadigo, marca, tipo, modelo, patente, kilometraje);
        indice++;
        
    }
    public void ventaVehiculos(){
    
    }
    public void mostrardatos(){
    
        for (int i = 0; i < indice; i++) {
            System.out.println(vec[i].toString());
        }
    }
    
    
    
}
