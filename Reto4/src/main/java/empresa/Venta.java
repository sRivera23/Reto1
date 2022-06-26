/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;




public class Venta {
    private int id, numeroDocumento;
    private LocalDateTime fechaYHora;
    private String tipoDocumento, nombre, descripcion;
    public int valorAPagar;
    
    public Venta(/*int id, int numeroDocumento, LocalDateTime fechaYHora,String tipoDocumento,
            String nombre, String descripcion, int valorAPagar*/){
        this.id = 0;
        this.numeroDocumento = 0;
        this.fechaYHora = LocalDateTime.now();
        this.tipoDocumento = "";
        this.nombre = "";
        this.descripcion = "";
        this.valorAPagar = 0;
    }
    
public long diasVenta(){
    LocalDateTime fechaHoy = LocalDateTime.now();
    long diasEntreFechas = ChronoUnit.DAYS.between(fechaYHora, fechaHoy);
    return diasEntreFechas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getValorAPagar() {
        return valorAPagar;
    }

    public void setValorAPagar(int valorAPagar) {
        this.valorAPagar = valorAPagar;
    }

}