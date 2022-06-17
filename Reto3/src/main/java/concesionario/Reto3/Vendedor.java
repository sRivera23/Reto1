/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package concesionario.Reto3;

/**
 *
 * @author Santiago Rivera y Santiago Alexander Losada
 */
public class Vendedor {
    private int documento;
    private String nombres;
    private String apellidos;
    private int edad;
    private String descripcionVendedor;
    public double valorTotalVendido;
    public int añoIngreso;
    
    public String consultarNivelVentas(){
        
        String nivelVentas;
               
        if(valorTotalVendido==0){
                nivelVentas = "Es un novato";
        }
        else if(valorTotalVendido > 0 && valorTotalVendido <= 500000000){
                nivelVentas = "Es un principiante";
        }
        else if(valorTotalVendido > 500000000 && valorTotalVendido <= 2000000000){
                nivelVentas = "Es intermedio";
        }
        else if(valorTotalVendido > 2000000000){
                nivelVentas = "Es avanzado";
        }
        else{
            nivelVentas = "No es posible determinar el nivel del vendedor";
        }
        return nivelVentas;
    }
    
    public String consultarTipo(){
        
        String clase;
                
        if(valorTotalVendido ==0 && añoIngreso >= 2021 ){     
                clase = "Es un mal vendedor";
        }
        else if(valorTotalVendido > 0 && valorTotalVendido <= 500000000  && añoIngreso >= 2018&& añoIngreso <= 2022 ){
                clase = "Es un vendedor regular";
        }
        else if(valorTotalVendido > 500000000 && valorTotalVendido <= 2000000000  && añoIngreso >= 2010 & añoIngreso <= 2022){
                clase = "Es un buen vendedor";
        }
        else if(valorTotalVendido > 2000000000 && añoIngreso <= 2022) {
                clase = "Es excelente vendedor";
        }
        else{
            clase = "No es posible determinar si es o no un buen vendedor";
        }
        return clase;
    }
}

