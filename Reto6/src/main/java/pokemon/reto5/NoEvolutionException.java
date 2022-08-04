/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.reto5;

/**
 *
 * @author santi
 */
public class NoEvolutionException extends Exception{
    
    public NoEvolutionException() throws NoEvolutionException{
        
        super("El pokemon no puede evolucionar más");
        
    }
    
}
