/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.concesionario.Reto3;

/**
 *
 * @author Santiago Rivera y Santiago Alexander Losada
 */
public class Automovil {
    private String placa;
    private String marca;
    private String color;
    private String descripcionAutomovil;
    public int modelo;
    public int añoFabricacion;
    public float kilometraje;
    public float precio;
    
    /* excepcion km < 0 */
        public void setKilometraje(float kilometraje) throws ValorIncorrectoException{
        if(kilometraje >= 0){
            this.kilometraje = kilometraje;
        } else{
            throw new ValorIncorrectoException();
            }
        }
    public String consultarUso(){
        String uso;
        if(kilometraje==0){
                uso = "0 km";
        }
        else if(kilometraje > 0 && kilometraje < 1000){
                uso = "Nuevo";
        }
        else if(kilometraje >= 1000 && kilometraje < 20000){
                uso = "Casi nuevo";
        }
        else if(kilometraje >= 20000 && kilometraje < 100000){
                uso = "Usado";
        }
        else if(kilometraje>=100000){
                uso = "Muy usado";
        }
        else{
            uso = "Kilometraje no valido";
        }
        return uso;
        
    }
    
    public String consultarTipo(){
        String tipo;
        if(añoFabricacion<2000){
            tipo = "Antiguo";
        }
        else if(añoFabricacion >= 2000 && añoFabricacion < 2015){
            tipo = "Intermedio";
        }
        else if(añoFabricacion >= 2015 && añoFabricacion < 2020){
            tipo = "Nuevo";
        }
        else if(añoFabricacion >= 2020){
            tipo = "Último modelo";
        }
        else{
            tipo = "No se puede determinar";
        }
        return tipo;
    }
}
