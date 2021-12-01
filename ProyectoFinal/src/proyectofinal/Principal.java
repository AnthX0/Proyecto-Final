/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

import java.util.Scanner;

/**
 *
 * @author Victor
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // TODO code application logic here
        Scanner tec=new Scanner(System.in);
        Control ctrl = new Control();
        Automovil auto = new Automovil("VKS25325","Sedan","Rojo Carmesi",11);
        String op="s";
        int opc;
        
//        System.out.println("         SISTEMA DE RESERVACIÓN DE CAJONES ESTACIONAMIENTO");
//        System.out.println("1. Registrar un automóvil");
//        System.out.println("2. Dar salida al carro y Calcular el monto por carro según el tiempo");
//        System.out.println("3. Desplegar la información de los carros registrados");
//        System.out.println("4. Desplegar la información de un carro en específico");
//        System.out.println("5. Imprimir el mapa de cajones disponibles y ocupados");
//        System.out.println("6. Hacer corte");
//        System.out.println("7. Terminar operación");
//        System.out.println("Teclee su opción: ");
//        opc=tec.nextInt();
//        
        System.out.println("-------------------------------------------------------------------------------------------");
        System.out.println("|        |        |        |        |        |        |        |        |        |        |");
        
        System.out.println("|        |        |        |        |        |        |        |        |        |        |");
        System.out.println("-------------------------------------------------------------------------------------------");
//        
//        switch(opc){
//            case 1: System.out.println("¿Desea registrar un auto? s/n");
//                    while ("S".equalsIgnoreCase(op)){
//                        System.out.println("Indique que espacio quiere modificar");
//                    }
//            case 2:
//            case 3:
//            case 4:
//            case 5: 
//            case 6:
//            case 7: break;
//        }
    }   
}
