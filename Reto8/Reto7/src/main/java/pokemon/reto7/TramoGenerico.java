
package pokemon.reto7;

/**
 *
 * @author santi
 */
public abstract class TramoGenerico {
    
    protected double xI; 
    protected double yI;
    protected double xF;
    protected double yF;

    public TramoGenerico(double xI, double yI, double xF, double yF) {
        this.xI = xI;
        this.yI = yI;
        this.xF = xF;
        this.yF = yF;
    }
      
    
    public abstract double longitud();
    
    public abstract double area();
    
    public abstract double volumen();
}
