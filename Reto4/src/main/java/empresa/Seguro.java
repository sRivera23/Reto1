/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

/**
 *
 * @author santi
 */
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Seguro {
    private int id;
    private String nombreEmpresa, descripcion;
    public LocalDate fechaInicial, fechaFinal;
    
    public Seguro(/*int id, String nombreEmpresa, String descripcion, LocalDate fechaInicial,
            LocalDate fechaFinal*/){
        this.id = 0;
        this.nombreEmpresa = "";
        this.descripcion = "";
        this.fechaInicial = LocalDate.now();
        this.fechaFinal = LocalDate.now();
    }
    
public long diasCobertura(){
    long diasEntreFechas = ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
    return diasEntreFechas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public LocalDate getFechaInicial() {
        return fechaInicial;
    }

    public void setFechaInicial(LocalDate fechaInicial) {
        this.fechaInicial = fechaInicial;
    }

    public LocalDate getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(LocalDate fechaFinal) {
        this.fechaFinal = fechaFinal;
    }

}