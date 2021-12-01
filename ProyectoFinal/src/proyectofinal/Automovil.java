/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinal;

/**
 *
 * @author Victor
 */
public class Automovil {
    //Atributos
    String placa, tipo, color;
    int horaLlegada;
    float horaSalida;
    //Constructor
    public Automovil(String placa, String tipo, String color, int horaLlegada){
        this.placa=placa;
        this.tipo=tipo;
        this.color=color;
        this.horaLlegada=horaLlegada;
    }
    //Sets & Gets
    public void setPlaca(String placa){
        this.placa=placa;
    }
    public String getPlaca(){
        return this.placa;
    }
    public void setTipo(String tipo){
        switch(tipo){
            case "Sedan": this.tipo=tipo;
            case "Camioneta": this.tipo=tipo;
            default: break;
        }
    }
    public String getTipo(){
        return this.tipo;
    }
    public void setColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    public void setHoraLlegada(int horaLlegada){
        this.horaLlegada=horaLlegada;
    }
    public int getHoraLlegada(){
        return this.horaLlegada;
    }
    public void setHoraSalida(float horaSalida){
        this.horaSalida=horaSalida;
    }
    public float getHoraSalida(){
        return this.horaSalida;
    }
}
