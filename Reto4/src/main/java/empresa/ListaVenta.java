/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author santi
 */
public class ListaVenta {
    ArrayList<Venta> listaventa = new ArrayList();
    
    public String EntradaTexto(String texto){
        return JOptionPane.showInputDialog(texto);
    }
    public int EntradaNumero(String numero){
        return Integer.parseInt(JOptionPane.showInputDialog(numero));
    }
    public String EntradaFecha(String fecha){
        
        return JOptionPane.showInputDialog(fecha);
    }
    public void agregarVenta(){
        int id = EntradaNumero("Ingrese el id de la venta");
        int numeroDocumento = EntradaNumero("Ingrese numero de documento");
        String tipoDocumento = EntradaTexto("Ingrese el tipo de documento");
        String nombre = EntradaTexto("Ingrese el nombre");
        String descripcion = EntradaTexto("Ingrese la descripcion");
        int valorAPagar = EntradaNumero("Ingrese el valor de la venta ");
        
        Venta venta = new Venta();
        venta.setId(id);
        venta.setNumeroDocumento(numeroDocumento);
        venta.setTipoDocumento(tipoDocumento);
        venta.setNombre(nombre);
        venta.setDescripcion(descripcion);
        venta.setValorAPagar(valorAPagar);
        venta.setFechaYHora(LocalDateTime.now());
        listaventa.add(venta);
    }
    public void mostrarVentas(){
        String elemento = "";
        for(int i=0; i<listaventa.size() ; i++){
            elemento+="Venta"+"\n";
            elemento+="Id: "+listaventa.get(i).getId()+"\n";
            elemento+="Fecha y Hora: "+listaventa.get(i).getFechaYHora()+"\n";
            elemento+="Numero documento: "+listaventa.get(i).getNumeroDocumento()+"\n";
            elemento+="Tipo de documento: "+listaventa.get(i).getTipoDocumento()+"\n";
            elemento+="Nombre: "+listaventa.get(i).getNombre()+"\n";
            elemento+="Descripción: "+listaventa.get(i).getDescripcion()+"\n";
            elemento+="Valor a pagar: "+listaventa.get(i).getValorAPagar()+"\n";
         
        }
        JOptionPane.showMessageDialog(null,elemento);
    }
}
