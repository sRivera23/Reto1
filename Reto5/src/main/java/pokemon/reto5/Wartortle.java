/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.reto5;

/**
 *
 * @author santi
 */
public class Wartortle extends Pokemon{

    public Wartortle(String nombre, byte nivel, int salud) {
        super(nombre, nivel, salud);
    }

    @Override
    public Pokemon evolucionar() {
        Pokemon blas = new Blastoise(nombre, nivel, salud);
        return blas;
    }

    @Override
    public void gritar() {
        System.out.println("Wartortle!");
    }
    
}
