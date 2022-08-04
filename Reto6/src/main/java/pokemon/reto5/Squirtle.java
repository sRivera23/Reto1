/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.reto5;

/**
 *
 * @author santi
 */
public class Squirtle extends Pokemon {

    public Squirtle(String nombre, byte nivel, int salud) {
        super(nombre, nivel, salud);
    }
    
    

    @Override
    public Pokemon evolucionar() {
       Pokemon wartor = new Wartortle(nombre, nivel, salud);
       return wartor;
    }

    @Override
    public void gritar() {
        System.out.println("Squir squirtle!");
    }
    
    
}
