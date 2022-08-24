/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.reto5;

 import java.util.ArrayList;
 import java.util.Scanner;
 //se eliminan importaciones innecesarias


public class ClasePrincipal {
        
   
    static ArrayList<Pokemon> pokemones = new ArrayList();
    static ArrayList<Pokebola> pokebolas = new ArrayList();
    
    public static void main (String args[]){
        menu();
    }
    public static void menu(){

    String nombreIngresado = "";//cambio del nombre de la variable a uno más apropiado
    String nombreBuscado = "";//cambio del nombre de la variable a uno más apropiado
    byte nivel = 0;
    int salud = 0;
    int posicionEnLista=-1; //cambio del nombre de la variable a uno más apropiado
    int bola;
    Pokemon pokemon = null; //cambio del nombre de la variable a uno más apropiado
    Pokebola pokebola = null; //cambio del nombre de la variable a uno más apropiado
    String evol;
        System.out.println("Bienvenido al menu, ingrese un caracter");
        
        System.out.println("a. Agregar Pokebola");
        System.out.println("b. Evolucionar un Pokemon");
        System.out.println("c. Guardar un Pokemon");
        System.out.println("d. Mostrar Pokemones");
        System.out.println("e. Mostrar Pokebolas");
        System.out.println("1. Agregar Charmander");
        System.out.println("2. Agregar Charmeleon");
        System.out.println("3. Agregar Charizard");
        System.out.println("4. Agregar Pikachu");
        System.out.println("5. Agregar Raichu");
        System.out.println("6. Agregar Squirtle");
        System.out.println("7. Agregar Wartortle");
        System.out.println("8. Agregar Blastoise");
        
        Scanner teclado = new Scanner(System.in);
        char caracter;
        caracter = teclado.next().charAt(0);
        
        switch(caracter){
            case 'a':
                System.out.println("Se agregará una Pokebola");
                System.out.println("Ingrese el tamaño de la Pokebola");
                String tamaño = teclado.next();
                pokebola = new Pokebola(null,tamaño);
                pokebolas.add(pokebola);
                menu();
                break;
            case 'b':
                System.out.println("Ingrese el nombre del Pokemon a evolucionar");
                
                evol = teclado.next();
                
                for(int i = 0 ; i < pokemones.size() ; i++){

                    if(evol.equals(pokemones.get(i).getNombre())){
                        posicionEnLista = i;
                    }
                } 
                if(posicionEnLista == -1){
                    System.out.println(evol + " No se ha encontrado ");
                }
                else{
                    pokemon = pokemones.get(posicionEnLista);
                    try {   
                    
                    pokemon = pokemon.evolucionar();
                    String aux1 = pokemon.getClass().getSimpleName();
                    if (!aux1.equals("Raichu") || !aux1.equals("Blastoise") || !aux1.equals("Charizard")){
                            System.out.println("Ha evolucionado con exito!");
                    } 
                    }
                    catch (NoEvolutionException ex) {
                        System.out.println(ex.getMessage());
                    }
                    
                    pokemon.gritar();
                }
                menu();
                break;
            case 'c':
                System.out.println("Ingrese el nombre del Pokemon a guardar");
                nombreBuscado = teclado.next();
                
                for(int i = 0 ; i < pokemones.size() ; i++){

                    if(nombreBuscado.equals(pokemones.get(i).getNombre())){
                        posicionEnLista = i;
                    }
                } 
                if(posicionEnLista == -1){
                    System.out.println(nombreBuscado + " No se ha encontrado ");
                }
                else{
                    pokemon = pokemones.get(posicionEnLista);
                    System.out.println("Ingrese la posicion de la pokebola en la lista");
                    bola = teclado.nextInt();
                    if(bola >= pokebolas.size()){
                        System.out.println("Numero no válido");
                    }
                    else if(bola < 1){
                        System.out.println("Numero no válido");
                    }
                    else{
                        pokebolas.get(bola).setMiPoke(pokemon);
                        System.out.println("El pokemon "+pokemon+"se ha guardado");
                        System.out.println("en la Pokebola número: "+bola+" con éxito.");
                    }
                }
                menu();
                break;
            case 'd':
                System.out.println("Pokemones:"); 
                for(int i = 0; i < pokemones.size(); i++) {
                    System.out.println(pokemones.get(i).getNombre());
                }
                System.out.println("Fin de la lista.");
                menu();
                break;
            case 'e':
                System.out.println("Pokebolas:"); 
                for(int i = 0; i < pokebolas.size(); i++) {
                    System.out.println(pokebolas.get(i).getMiPoke());
                }
                System.out.println("Fin de la lista."); 
                menu();
                break;
            case '1':
                System.out.println("Se agregará un Charmander");
                System.out.println("Nombre: ");
                nombreIngresado = teclado.next();
                System.out.println("Nivel: ");
                nivel = teclado.nextByte();
                System.out.println("Salud: ");
                salud = teclado.nextInt();
                
                pokemon = new Charmander(nombreIngresado,nivel,salud);
                
                pokemones.add(pokemon);
           
                pokemon.gritar();
                menu();
                break;
            case '2':    
                System.out.println("Se agregará un Charmeleon");
                System.out.println("Nombre: ");
                nombreIngresado = teclado.next();
                System.out.println("Nivel: ");
                nivel = teclado.nextByte();
                System.out.println("Salud: ");
                salud = teclado.nextInt();
                
                pokemon = new Charmeleon(nombreIngresado,nivel,salud);
                
                pokemones.add(pokemon);
                pokemon.gritar();
                menu();
                break;
                
            case '3':    
                System.out.println("Se agregará un Charizard");
                System.out.println("Nombre: ");
                nombreIngresado = teclado.next();
                System.out.println("Nivel: ");
                nivel = teclado.nextByte();
                System.out.println("Salud: ");
                salud = teclado.nextInt();
                
                pokemon = new Charizard(nombreIngresado,nivel,salud);
                
                pokemones.add(pokemon);
                pokemon.gritar();
                menu();
                break;
                
            case '4':
                System.out.println("Se agregará un Pikachu");
                System.out.println("Nombre: ");
                nombreIngresado = teclado.next();
                System.out.println("Nivel: ");
                nivel = teclado.nextByte();
                System.out.println("Salud: ");
                salud = teclado.nextInt();
                
                pokemon = new Pikachu(nombreIngresado,nivel,salud);
                
                pokemones.add(pokemon);
                pokemon.gritar();
                menu();
                break;
            case '5':
                System.out.println("Se agregará un Raichu");
                System.out.println("Nombre: ");
                nombreIngresado = teclado.next();
                System.out.println("Nivel: ");
                nivel = teclado.nextByte();
                System.out.println("Salud: ");
                salud = teclado.nextInt();
                
                pokemon = new Raichu(nombreIngresado,nivel,salud);
                
                pokemones.add(pokemon);
                pokemon.gritar();
                menu();
                break;
            case '6':
                System.out.println("Se agregará un Squirtle");
                System.out.println("Nombre: ");
                nombreIngresado = teclado.next();
                System.out.println("Nivel: ");
                nivel = teclado.nextByte();
                System.out.println("Salud: ");
                salud = teclado.nextInt();
                
                pokemon = new Squirtle(nombreIngresado,nivel,salud);
                
                pokemones.add(pokemon);
                pokemon.gritar();
                menu();
                break;
            case '7':
                System.out.println("Se agregará un Wartortle");
                System.out.println("Nombre: ");
                nombreIngresado = teclado.next();
                System.out.println("Nivel: ");
                nivel = teclado.nextByte();
                System.out.println("Salud: ");
                salud = teclado.nextInt();
                
                pokemon = new Wartortle(nombreIngresado,nivel,salud);
                
                pokemones.add(pokemon);
                pokemon.gritar();
                menu();
                break;
            case '8':
                System.out.println("Se agregará un Blastoise");
                System.out.println("Nombre: ");
                nombreIngresado = teclado.next();
                System.out.println("Nivel: ");
                nivel = teclado.nextByte();
                System.out.println("Salud: ");
                salud = teclado.nextInt();
                
                pokemon = new Blastoise(nombreIngresado,nivel,salud);
                
                pokemones.add(pokemon);
                pokemon.gritar();
                menu();
                break;
            default:
                System.out.println("Ingrese un valor valido");
                menu();
                break;
                
        }
    }
    }
    

