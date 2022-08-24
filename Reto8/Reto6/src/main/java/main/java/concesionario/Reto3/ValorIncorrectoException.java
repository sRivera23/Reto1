
package main.java.concesionario.Reto3;
/**
 *
 * @author usuario
 */
public class ValorIncorrectoException extends Exception{
    public ValorIncorrectoException() throws ValorIncorrectoException{
        super("El valor es inválido");
    }
}
