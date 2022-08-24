/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.reto5;


public class Pokebola {
    
    protected Pokemon miPoke;
    protected String tamaño;

    public Pokebola(Pokemon miPoke, String tamaño) {
        this.miPoke = miPoke;
        this.tamaño = tamaño;
    }

    public Pokemon getMiPoke() {
        return miPoke;
    }

    public void setMiPoke(Pokemon miPoke) {
        this.miPoke = miPoke;
    }

    public String getTamaño() {
        return tamaño;
    }

    public void setTamaño(String tamaño) {
        this.tamaño = tamaño;
    }
    
    
    
}
