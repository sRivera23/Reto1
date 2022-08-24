
package pokemon.reto7;

/**
 *
 * @author santi
 */
public class TramoAsfalto extends TramoGenerico {
    
    private String proveedor;
    private double velocidadMax;
    private boolean puedeAdelantar;
    private static final int ANCHO_ASFALTO = 8; //se agregan constantes para evitar numeros magicos
    private static final double ESPESOR_ASFALTO = 0.25;
    
    public TramoAsfalto(String proveedor, double velocidadMax, boolean puedeAdelantar, double xI, double yI, double xF, double yF) {
          super(xI, yI, xF, yF);
          this.proveedor = proveedor;
          this.puedeAdelantar = puedeAdelantar;
          this.velocidadMax = velocidadMax;
    }
   

    public TramoAsfalto( double xI, double yI, double xF, double yF) {
        super(xI, yI, xF, yF);

    }
    
    
    
    @Override
    public double longitud() {
        double longitud = Math.sqrt( Math.pow((super.xF - super.xI),2) + Math.pow((super.yF - super.yI),2) );
        return longitud;
    }

    @Override
    public double area() {
      return this.longitud()*ANCHO_ASFALTO;
    }

    @Override
    public double volumen() {
        return this.area() * ESPESOR_ASFALTO;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public double getVelocidadMax() {
        return velocidadMax;
    }

    public void setVelocidadMax(double velocidadMax) {
        this.velocidadMax = velocidadMax;
    }

    public boolean isPuedeAdelantar() {
        return puedeAdelantar;
    }

    public void setPuedeAdelantar(boolean puedeAdelantar) {
        this.puedeAdelantar = puedeAdelantar;
    }
    
    
}
