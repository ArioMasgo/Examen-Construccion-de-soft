/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pregunta3;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        metodoVehiculo c = new metodoVehiculo();
        String autos, camionetas,motocicletas;
        Scanner sc = new Scanner(System.in);
        int codigo; String marca; String tipo; String modelo; String patente;String kilometraje;
        int op;
        do {            
            System.out.println("1. autos");
            System.out.println("2. camionetas");
            System.out.println("3. motocicletas");
            System.out.println("4. salir");
            System.out.println("ingrese una opcion");
            op=sc.nextInt();
            switch(op){
                case 1:System.out.println("ingrese codigo");
                    codigo=sc.nextInt();
                    System.out.println("Ingrese marca");
                    marca=sc.nextLine();
                    System.out.println("Ingrese tipo");
                    tipo=sc.nextLine();
                    System.out.println("Ingrese modelo ");
                    modelo=sc.nextLine();
                    System.out.println("Ingrese patente");
                    patente=sc.nextLine();
                    System.out.println("Ingrese KIometraje");
                    kilometraje=sc.nextLine();
                    c.IngresoVehiculo(codigo, marca, tipo, modelo, patente, kilometraje);
                    c.mostrardatos();
                       
                    break;
                case 2:
                    System.out.println("ingrese codigo");
                    codigo=sc.nextInt();
                    System.out.println("Ingrese marca");
                    marca=sc.nextLine();
                    System.out.println("Ingrese tipo");
                    tipo=sc.nextLine();
                    System.out.println("Ingrese modelo ");
                    modelo=sc.nextLine();
                    System.out.println("Ingrese patente");
                    patente=sc.nextLine();
                    System.out.println("Ingrese KIometraje");
                    kilometraje=sc.nextLine();
                    c.IngresoVehiculo(codigo, marca, tipo, modelo, patente, kilometraje);
                    c.mostrardatos();
                    break;
                case 3:
                    System.out.println("ingrese codigo");
                    codigo=sc.nextInt();
                    System.out.println("Ingrese marca");
                    marca=sc.nextLine();
                    System.out.println("Ingrese tipo");
                    tipo=sc.nextLine();
                    System.out.println("Ingrese modelo ");
                    modelo=sc.nextLine();
                    System.out.println("Ingrese patente");
                    patente=sc.nextLine();
                    System.out.println("Ingrese KIometraje");
                    kilometraje=sc.nextLine();
                    c.IngresoVehiculo(codigo, marca, tipo, modelo, patente, kilometraje);
                    c.mostrardatos();
                    break;            
            }
            
        } while (4!=0);
    }
}
