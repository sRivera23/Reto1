/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.reto7;

/**
 *
 * @author santi
 */
public class TramoSinAsfalto extends TramoGenerico {
    
    private String material;
    protected double espesorMaterial;

    public TramoSinAsfalto(String material, double espesorMaterial, double xI, double yI, double xF, double yF) {
        super(xI, yI, xF, yF); 
        this.material = material;
        this.espesorMaterial = espesorMaterial;
    }

   @Override
    public double longitud() {
        double longitud = Math.sqrt( Math.pow((super.xF - super.xI),2) + Math.pow((super.yF - super.yI),2) );
        return longitud;
    }

    @Override
    public double area() {
      return this.longitud()*6;
    }

    @Override
    public double volumen() {
        return this.area()*this.espesorMaterial;
    }


    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getEspesorMaterial() {
        return espesorMaterial;
    }

    public void setEspesorMaterial(double espesorMaterial) {
        this.espesorMaterial = espesorMaterial;
    }
    
    
    
    
}
