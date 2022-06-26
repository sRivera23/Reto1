/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;



import java.util.ArrayList;
import javax.swing.JOptionPane;


public class ListaPanel {
    ArrayList<Panel> listapanel = new ArrayList();
    
    public String EntradaTexto(String texto){
        return JOptionPane.showInputDialog(texto);
    }
    public int EntradaNumero(String numero){
        return Integer.parseInt(JOptionPane.showInputDialog(numero));
    }
    public void agregarPanel(){
        int id = EntradaNumero("Ingrese la id del Panel");
        int numeroSerie = EntradaNumero("Ingrese numero de serie del Panel");
        String descripcion = EntradaTexto("Ingrese una corta descripción del Panel");
        String tipoDePanel = EntradaTexto("Ingrese el tipo de Panel");
        String modelo = EntradaTexto("Ingrese modelo del Panel");
        int añoFabricacion = EntradaNumero("Ingrese el año de fabricación del Panel");
        int precioDeVenta = EntradaNumero("Ingrese el precio de venta del Panel");
        Panel panel = new Panel();
        panel.setId(id);
        panel.setNumeroSerie(numeroSerie);
        panel.setDescripcion(descripcion);
        panel.setTipoDePanel(tipoDePanel);
        panel.setModelo(modelo);
        panel.setAñoFabricacion(añoFabricacion);
        panel.setPrecioDeVenta(precioDeVenta);
        listapanel.add(panel);
    }
    public void mostrarPaneles(){
        String elemento = "";
        for(int i=0; i<listapanel.size() ; i++){
            elemento+="Panel"+"\n";
            elemento+="Id: "+listapanel.get(i).getId()+"\n";
            elemento+="Numero de serie: "+listapanel.get(i).getNumeroSerie()+"\n";
            elemento+="Descripción: "+listapanel.get(i).getDescripcion()+"\n";
            elemento+="Tipo de panel: "+listapanel.get(i).getTipoDePanel()+"\n";
            elemento+="Modelo: "+listapanel.get(i).getModelo()+"\n";
            elemento+="Año de fabricación: "+listapanel.get(i).getAñoFabricacion()+"\n";
            elemento+="Precio de venta: "+listapanel.get(i).getPrecioDeVenta()+"\n\n\n";
        }
        JOptionPane.showMessageDialog(null,elemento);
    }
}