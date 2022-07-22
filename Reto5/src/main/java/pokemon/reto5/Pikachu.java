/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.reto5;

/**
 *
 * @author santi
 */
public class Pikachu extends Pokemon {

    public Pikachu(String nombre, byte nivel, int salud) {
        super(nombre, nivel, salud);
    }
   

    @Override
    public Pokemon evolucionar() {
        Pokemon raichu = new Raichu(nombre, nivel, salud);
        return raichu;
    }

    @Override
    public void gritar() {
        System.out.println("Pika pika pikachu!");
    }
    
    
    
}
