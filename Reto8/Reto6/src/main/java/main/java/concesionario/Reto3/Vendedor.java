

package main.java.concesionario.Reto3;
import java.time.LocalDate;

/**
 *
 * @author Santiago Rivera y Santiago Alexander Losada
 */
public class Vendedor {
    private int documento;
    private String nombres;
    private String apellidos;
    private int edad;
    private String descripcionVendedor;
    public double valorTotalVendido;
    public int añoIngreso;
    private static final int EDAD_MINIMA = 18; //se agrega constante para evitar numero magico
    private static final int VALOR_MINIMO = 0; //se agrega constante para evitar numero magico
    private static final int VALOR_SUPERIOR_PRINCIPIANTE = 500000000; //se agrega constante para evitar numero magico
    private static final int VALOR_SUPERIOR_INTERMEDIO = 2000000000; //se agrega constante para evitar numero magico
    private static final int AÑO_MUY_RECIENTE = 2021; //se agrega constante para evitar numero magico
    private static final int AÑO_RECIENTE = 2018; //se agrega constante para evitar numero magico
    private static final int AÑO_ANTIGUO = 2010; //se agrega constante para evitar numero magico
    private static final int AÑO_ACTUAL = 2022; //se agrega constante para evitar numero magico
    
    /* Excepcion edad < 18
        Excepcion añoIngreso > añoActual
        

    */
    public void setEdad(int edad) throws ValorIncorrectoException{
        if(edad >= EDAD_MINIMA){
            this.edad = edad;
        } else{
            throw new ValorIncorrectoException();
            }
        }
    public void setAñoIngreso(int añoIngreso) throws ValorIncorrectoException{
        LocalDate fechaActual = LocalDate.now();
        int añoActual = fechaActual.getYear();
        if(añoIngreso <= añoActual){
            this.añoIngreso = añoIngreso;
        } else{
            throw new ValorIncorrectoException();
            }
        }
    public String consultarNivelVentas(){
        
        String nivelVentas;
               
        if(valorTotalVendido==VALOR_MINIMO){
                nivelVentas = "Es un novato";
        }
        else if(valorTotalVendido > VALOR_MINIMO && valorTotalVendido <= VALOR_SUPERIOR_PRINCIPIANTE){
                nivelVentas = "Es un principiante";
        }
        else if(valorTotalVendido > VALOR_SUPERIOR_PRINCIPIANTE && valorTotalVendido <= VALOR_SUPERIOR_INTERMEDIO){
                nivelVentas = "Es intermedio";
        }
        else if(valorTotalVendido > VALOR_SUPERIOR_INTERMEDIO){
                nivelVentas = "Es avanzado";
        }
        else{
            nivelVentas = "No es posible determinar el nivel del vendedor";
        }
        return nivelVentas;
    }
    
    public String consultarTipo(){
        
        String clase;
                
        if(valorTotalVendido ==VALOR_MINIMO && añoIngreso >= AÑO_MUY_RECIENTE ){     
                clase = "Es un mal vendedor";
        }
        else if(valorTotalVendido > VALOR_MINIMO && valorTotalVendido <= VALOR_SUPERIOR_PRINCIPIANTE  && añoIngreso >= AÑO_RECIENTE&& añoIngreso <= AÑO_ACTUAL ){
                clase = "Es un vendedor regular";
        }
        else if(valorTotalVendido > VALOR_SUPERIOR_PRINCIPIANTE && valorTotalVendido <= VALOR_SUPERIOR_INTERMEDIO  && añoIngreso >= AÑO_ANTIGUO & añoIngreso <= AÑO_ACTUAL){
                clase = "Es un buen vendedor";
        }
        else if(valorTotalVendido > VALOR_SUPERIOR_INTERMEDIO && añoIngreso <= AÑO_ACTUAL) {
                clase = "Es excelente vendedor";
        }
        else{
            clase = "No es posible determinar si es o no un buen vendedor";
        }
        return clase;
    }
}

