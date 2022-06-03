/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package holamundo.reto2;
import java.util.Scanner;

//Desarrollado por Santiago Rivera y Santiago Alexander Losada

public class exercise2 {
    static Scanner entrada = new Scanner(System.in);
    
    
    public static void main(String[] args){
        //puntoUno();
        //puntoDos();
        //puntoTres();
        puntoCuatro();
    }
    
    public static void puntoUno(){
        
        System.out.println("Ingrese un numero: ");
        
        int number = entrada.nextInt();
        int impares = 1;
        int suma = 0;
        
        
        for(int x = 0 ; x < number; x++){
            suma = suma+impares;           
            System.out.print(impares + " + ");
            impares += 2;
    }
        System.out.print(" El cuadrado de " + number + " es: " + suma);

    }
    
    public static void puntoDos(){

    boolean b, a;
    int numero, j=0, primo = 1, contador, suma = 0; 
    
    System.out.println("Cuantos primos desea sumar?"); 
    numero = entrada.nextInt();
    for (int x=1; x <= numero; x++){
        a = false; 
        while(!a){
        contador = 2; 
        b=true; 
        while((b) && (contador < primo)){ 
            if(primo % contador == 0)
            b=false; 
            else 
            contador = contador + 1;
        }
        if(b){
        j = j+1;
        System.out.println("El primo numero "+j+" es ---> "+primo);
        a=true;
        suma = suma + primo; 
        } 
        primo = primo+1;
        } 
    } 
        System.out.println ("Y su suma es: "+suma); 
} 
    
    public static void puntoTres(){
        
        
        int numberpiñon = 0, i = 1, n = 12, k = 1, dimension;
        double circunferencia1 = 2.288, circunferencia2 = 2.298, circunferencia3 = 2.326, circunferenciaelegida;  
        double desarrollo, desarrollo1, plato1, plato2;
        double zero = 0.0;
        
      
       
        //Todos diferentes de 0
        
        System.out.println("Ingrese el numero de dientes de los platos delanteros: ");
        
        System.out.println("Plato 1: ");
        plato1 = entrada.nextDouble();
        
        System.out.println("Plato 2: ");
        plato2 = entrada.nextDouble();
        
        if(plato1 >= zero && plato2 >= zero ){

        System.out.println("De que dimension la llanta?");
        System.out.println("Digite 1 para 29x2.1 ,  2 para 29x2.2 ,  3 para 29x2.3");
        dimension = entrada.nextInt();
       
        switch(dimension){
            case 1: 
                System.out.println("Has elegido la circunferencia de tamano: " + circunferencia1 +  " metros");
                circunferenciaelegida = circunferencia1;
                System.out.println("A continuacion iremos ingresando el numero de dientes del pinon del 1 al 12");
              
                while (i <= n){
                    numberpiñon++;
                    System.out.println("Ingrese el numero de dientes del pinon, recuerde que debe ser mayor a 0: ");
                    int piñon = entrada.nextInt();
                    if(piñon != 0){
                    desarrollo = plato1/piñon * circunferenciaelegida;
                    desarrollo1 = plato2/piñon * circunferenciaelegida;
                    int j = i;
                    while(j <= k ){
                        if(desarrollo !=0){
                        System.out.println("El desarrollo para el plato 1 y el pinon " + numberpiñon + " es: "  + String.format("%.2f",desarrollo) + " metros por cada ciclo de pedalada.");
                        }
                        if(desarrollo1 != 0){
                            System.out.println("El desarrollo para el plato 2 y el pinon " + numberpiñon + " es: "  + String.format("%.2f",desarrollo1)  + " metros por cada ciclo de pedaladas.");
                        }
                        j++;
                    }
                   
                    k++;
                    i++;
                }
                    else{
                        System.out.println("Valor invalido, inicie desde el principio.");
                        puntoTres();
                    }
                }       
                    
                 break;

            case 2:
                System.out.println("Has elegido la circunferencia de tamano: " + circunferencia2 + " metros");
                System.out.println("A continuacion iremos ingresando el numero de dientes del pinon del 1 al 12");
                circunferenciaelegida = circunferencia2;
                
                    while (i <= n){
                    numberpiñon++;
                    System.out.println("Ingrese el numero de dientes del pinon, recuerde que debe ser mayor a 0: ");
                    int piñon = entrada.nextInt();
                    if(piñon != 0){
                    desarrollo = plato1/piñon * circunferenciaelegida;
                    desarrollo1 = plato2/piñon * circunferenciaelegida;
                    int j = i;
                    while(j <= k ){
                        if(desarrollo !=0){
                        System.out.println("El desarrollo para el plato 1 y el pinon " + numberpiñon + " es: "  + String.format("%.2f",desarrollo) + " metros por cada ciclo de pedalada.");
                        }
                        if(desarrollo1 != 0){
                            System.out.println("El desarrollo para el plato 2 y el pinon " + numberpiñon + " es: "  + String.format("%.2f",desarrollo1)  + " metros por cada ciclo de pedaladas.");
                        }
                        j++;
                    }
                   
                    k++;
                    i++;
                }
                    else{
                        System.out.println("Valor invalido, inicie desde el principio.");
                        puntoTres();
                    }
                }
                                
                break;
                
            case 3: 
                System.out.println("Has elegido la circunferencia de tamano " + circunferencia3 + " metros");
                System.out.println("A continuacion iremos ingresando el numero de dientes del pinon del 1 al 12");
                circunferenciaelegida = circunferencia3;
                
                while (i <= n){
                    numberpiñon++;
                    System.out.println("Ingrese el numero de dientes del pinon, recuerde que debe ser mayor a 0: ");
                    int piñon = entrada.nextInt();
                    if(piñon != 0){
                    desarrollo = plato1/piñon * circunferenciaelegida;
                    desarrollo1 = plato2/piñon * circunferenciaelegida;
                    int j = i;
                    while(j <= k ){
                        if(desarrollo !=0){
                        System.out.println("El desarrollo para el plato 1 y el pinon " + numberpiñon + " es: "  + String.format("%.2f",desarrollo) + " metros por cada ciclo de pedalada.");
                        }
                        if(desarrollo1 != 0){
                            System.out.println("El desarrollo para el plato 2 y el pinon " + numberpiñon + " es: "  + String.format("%.2f",desarrollo1)  + " metros por cada ciclo de pedaladas.");
                        }
                        j++;
                    }
                   
                    k++;
                    i++;
                }
                    else{
                        System.out.println("Valor invalido, inicie desde el principio.");
                        puntoTres();
                    }
                }
                break;
            default:
                System.out.print("Seleccione un valor válido");
        }
        }
            else{
            puntoTres();
            }
        }
      
        
     public static void puntoCuatro(){
        
        System.out.println("Bienvenido al menu. ");
        
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("4");
        
        System.out.println("Del 1 al 3 ejecutara un programa, el 4 para salir del menu: ");
        
        Scanner teclado = new Scanner(System.in);
        char caracter;
        caracter = teclado.next().charAt(0);
        
        switch(caracter){
            case '1':
                System.out.println("Se ejecutara el punto 1: ");
                puntoUno();
                System.out.println(" ");
                System.out.println("Desea ver otra vez ver el menu?");
                System.out.println("Ingrese 1 para verlo y 2 para salir");
                
                int repetir = entrada.nextInt();
                if(repetir == 1){
                    puntoCuatro();
                    
                }
                
                break;
            case '2':    
                System.out.println("Se ejecutara el punto 2: ");
                puntoDos();
                                System.out.println(" ");
                System.out.println("Desea ver otra vez ver el menu?");
                System.out.println("Ingrese 1 para verlo y 2 para salir");
                
                int repetir1 = entrada.nextInt();
                if(repetir1 == 1){
                    puntoCuatro();
                    
                }
                break;
                
            case '3':    
                System.out.println("Se ejecutara el punto 3: " );
                puntoTres();
                System.out.println(" ");
                System.out.println("Desea ver otra vez ver el menu?");
                System.out.println("Ingrese 1 para verlo y 2 para salir");
                
                int repetir2 = entrada.nextInt();
                if(repetir2 == 1){
                    puntoCuatro();
                    
                }
                break;
                
            case '4':
                break;
                
            default:
                System.out.println("Ingrese un valor valido");
                puntoCuatro();
                break;
                
        }
                    
        }
}



