/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.reto7;

/**
 *
 * @author santi
 */
public class TramoAsfalto extends TramoGenerico {
    
    private String proveedor;
    private double velocidadMax;
    private boolean puedeAdelantar;

    
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
      return this.longitud()*8;
    }

    @Override
    public double volumen() {
        return this.area()*0.25;
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
