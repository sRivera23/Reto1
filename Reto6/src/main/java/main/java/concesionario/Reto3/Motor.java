/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.concesionario.Reto3;

/**
 *
 * @author Santiago Rivera y Santiago Alexander Losada
 */
public class Motor {
    
    private int cilindraje;
    private String marca;
    private String referencia;
    private int peso;
    private String descripcionMotor;
    
    /* Excepcion peso < 0 */

    public void setPeso(int peso) throws ValorIncorrectoException{
        if(peso > 0){
            this.peso = peso;
        } else{
            throw new ValorIncorrectoException();
        }
    }
    
}
