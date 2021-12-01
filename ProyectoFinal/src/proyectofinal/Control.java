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
public class Control {
    Scanner tec=new Scanner(System.in);
    Automovil [] automoviles;
    Automovil estVip[]=new Automovil[10];
    Automovil estRegular[]=new Automovil[10];
    
    public void setAutomovil(int pos, Automovil automovil){
        if (pos>=0 && pos<automoviles.length)
            automoviles[pos]=automovil;
    }
    public Automovil getAutomovil(int pos){
        if (pos>=0 && pos<automoviles.length){
            return automoviles[pos];
        }
        return null;
    }
}
