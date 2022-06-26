/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;
import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class Panel {
    public int id, numeroSerie;
    private String descripcion, tipoDePanel, modelo;
    private int añoFabricacion, precioDeVenta;

    public Panel(/*int id, int numeroSerie, String descripcion, String tipoDePanel,
            String modelo, int añoFabricacion, int precioDeVenta*/){
        this.id = 0;
        this.numeroSerie = 0;
        this.descripcion = "";
        this.tipoDePanel = "";
        this.modelo = "";
        this.añoFabricacion = 0;
        this.precioDeVenta = 0;
    }
public String consultarUso(){
    String uso;
    if(añoFabricacion >= 0 && añoFabricacion <= 1){
            uso = "El Panel es nuevo";
    }
    else if(añoFabricacion >= 2 && añoFabricacion <= 4){
            uso = "El Panel es medianamente usado";
    }
    else if(añoFabricacion >= 5){
            uso = "El Panel es usado";
    }
    else{
            uso = "Año de fabricacion no valido";
    }
    return uso;
        
}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTipoDePanel() {
        return tipoDePanel;
    }

    public void setTipoDePanel(String tipoDePanel) {
        this.tipoDePanel = tipoDePanel;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAñoFabricacion() {
        return añoFabricacion;
    }

    public void setAñoFabricacion(int añoFabricacion) {
        this.añoFabricacion = añoFabricacion;
    }

    public int getPrecioDeVenta() {
        return precioDeVenta;
    }

    public void setPrecioDeVenta(int precioDeVenta) {
        this.precioDeVenta = precioDeVenta;
    }

}