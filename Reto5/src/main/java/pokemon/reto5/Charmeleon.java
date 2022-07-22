/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.reto5;

/**
 *
 * @author santi
 */
public class Charmeleon extends Pokemon{

    public Charmeleon(String nombre, byte nivel, int salud) {
        super(nombre, nivel, salud);
    }

    
    @Override
    public Pokemon evolucionar() {
        Pokemon charizard = new Charizard(nombre, nivel, salud);
        return charizard;
    }

    @Override
    public void gritar() {
         System.out.println("Charmeleon!");
    }
    
}
