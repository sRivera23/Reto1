/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class ListaSeguro {
    ArrayList<Seguro> listaseguro = new ArrayList();
    
    public String EntradaTexto(String texto){
        return JOptionPane.showInputDialog(texto);
    }
    public int EntradaNumero(String numero){
        return Integer.parseInt(JOptionPane.showInputDialog(numero));
    }
    public String EntradaFecha(String fecha){
        
        return JOptionPane.showInputDialog(fecha);
    }
    public void agregarSeguro(){
        int id = EntradaNumero("Ingrese la id del Seguro");
        String nombreEmpresa = EntradaTexto("Ingrese nombre de la Empresa");
        String descripcion = EntradaTexto("Ingrese una corta descripción del Seguro");
        String fechaInicial = EntradaTexto("Ingrese la fecha inicial del Seguro");
        LocalDate finicial = LocalDate.parse(fechaInicial);
        String fechaFinal = EntradaTexto("Ingrese la fecha final del Seguro");
        LocalDate ffinal = LocalDate.parse(fechaFinal);
        Seguro seguro = new Seguro();
        seguro.setId(id);
        seguro.setNombreEmpresa(nombreEmpresa);
        seguro.setDescripcion(descripcion);
        seguro.setFechaInicial(finicial);
        seguro.setFechaFinal(ffinal);
        listaseguro.add(seguro);
    }
    public void mostrarSeguros(){
        String elemento = "";
        for(int i=0; i<listaseguro.size() ; i++){
            elemento+="Seguro"+"\n";
            elemento+="Id: "+listaseguro.get(i).getId()+"\n";
            elemento+="Nombre de la Empresa: "+listaseguro.get(i).getNombreEmpresa()+"\n";
            elemento+="Descripción: "+listaseguro.get(i).getDescripcion()+"\n";
            elemento+="Fecha inicial: "+listaseguro.get(i).getFechaInicial()+"\n";
            elemento+="Fecha final: "+listaseguro.get(i).getFechaFinal()+"\n\n\n";
        }
        JOptionPane.showMessageDialog(null,elemento);
    }
}
