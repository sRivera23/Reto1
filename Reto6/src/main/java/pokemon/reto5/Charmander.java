/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.reto5;

/**
 *
 * @author santi
 */
public class Charmander extends Pokemon{

    public Charmander(String nombre, byte nivel, int salud) {
        super(nombre, nivel, salud);
    }
      
    @Override
    public Pokemon evolucionar() {
        Pokemon charmaleon = new Charmeleon(nombre, nivel, salud);
        return charmaleon;
    }

    @Override
    public void gritar() {
        System.out.println("Charmander!");
    }    
    
     
    
}
