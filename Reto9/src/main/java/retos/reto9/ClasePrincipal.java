/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package retos.reto9;


import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ClasePrincipal {

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) throws IOException{
        String ruta = "C:\\Users\\usuario\\Downloads\\ETH-USD.csv" 
        String destino = "C:\\Users\\usuario\\Documents\\NetBeansProjects\\Reto9Fin\\src\\main\\java\\retos\\reto9\\ETH-USD(modificado).csv";
        //IMPORTANTE cambiar ruta y destino
        
        Archivo a = new Archivo();
       a.promedioYDesviacion(ruta);
       a.volumenMayorYMenor(ruta);
       a.punto1(ruta,destino);
        
        Set<String>  cadenas = new HashSet<String>();
        List<Double> numeros = new ArrayList<>();

        cadenas.add("Messi");
        cadenas.add("Ronaldo");
        cadenas.add("Neymar");
        cadenas.add("Kaka");
        cadenas.add("Pepe");
        numeros.add(2.3);
        numeros.add(4.2);
        numeros.add(9.0);
        System.out.println(numeros);
        
        System.out.println(raizCuadrada(numeros));
        System.out.println(masDeCinco(cadenas));
        
    }
    
    

    public static List<Double> raizCuadrada(List<Double> numeros) {
        
        List <Double> numeros_salida = new ArrayList<>();
        numeros_salida = numeros.stream()
                        .map(Math::sqrt)
                        .toList();
               
        return numeros_salida;
  
    }
    
    
    public static List<String> masDeCinco(Set <String> cadenas){
     
        List <String> nuevaLista = new ArrayList<>();
        nuevaLista = cadenas.stream()
                    .filter(x -> x.length() > 5)
                    .toList();
        return nuevaLista;
        
    }
}
