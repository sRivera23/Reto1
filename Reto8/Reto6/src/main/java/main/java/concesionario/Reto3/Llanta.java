
package main.java.concesionario.Reto3;

/**
 *
 * @author Santiago Rivera y Santiago Alexander Losada
 */
public class Llanta {
    
    private String marca;
    private String referencia;
    private int peso;
    private static final int PESO_MINIMO = 0; //se agrega constante para evitar numero magico
 
    /* Excepcion peso < 0 */

    public void setPeso(int peso) throws ValorIncorrectoException{
        if(peso > PESO_MINIMO){
            this.peso = peso;
        } else{
            throw new ValorIncorrectoException();
        }
    }
    
}
