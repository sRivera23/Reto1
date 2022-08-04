/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.concesionario.Reto3;
/**
 *
 * @author usuario
 */
public class ValorIncorrectoException extends Exception{
    public ValorIncorrectoException() throws ValorIncorrectoException{
        super("El valor es inválido");
    }
}
