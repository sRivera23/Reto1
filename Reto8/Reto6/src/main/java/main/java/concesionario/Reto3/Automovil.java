
package main.java.concesionario.Reto3;

/**
 *
 * @author Santiago Rivera y Santiago Alexander Losada
 */
public class Automovil {
    private String placa;
    private String marca;
    private String color;
    private String descripcionAutomovil;
    public int modelo;
    public int añoFabricacion;
    public float kilometraje;
    public float precio;
    private static final int KILOMETRAJE_MINIMO = 0; //se agrega constante para evitar numero magico
    private static final int KILOMETRAJE_SUPERIOR_NUEVO = 1000; //se agrega constante para evitar numero magico
    private static final int KILOMETRAJE_SUPERIOR_CASI_NUEVO = 20000; //se agrega constante para evitar numero magico
    private static final int KILOMETRAJE_SUPERIOR_USADO = 100000; //se agrega constante para evitar numero magico
    private static final int AÑO_FABRICACION_SUPERIOR_ANTIGUO = 2000; //se agrega constante para evitar numero magico
    private static final int AÑO_FABRICACION_SUPERIOR_INTERMEDIO = 2015; //se agrega constante para evitar numero magico
    private static final int AÑO_FABRICACION_SUPERIOR_NUEVO = 2020; //se agrega constante para evitar numero magico
    /* excepcion km < 0 */
        public void setKilometraje(float kilometraje) throws ValorIncorrectoException{
        if(kilometraje >= KILOMETRAJE_MINIMO){
            this.kilometraje = kilometraje;
        } else{
            throw new ValorIncorrectoException();
            }
        }
    public String consultarUso(){
        String uso;
        if(kilometraje==KILOMETRAJE_MINIMO){
                uso = "0 km";
        }
        else if(kilometraje > KILOMETRAJE_MINIMO && kilometraje < KILOMETRAJE_SUPERIOR_NUEVO){
                uso = "Nuevo";
        }
        else if(kilometraje >= KILOMETRAJE_SUPERIOR_NUEVO && kilometraje < KILOMETRAJE_SUPERIOR_CASI_NUEVO){
                uso = "Casi nuevo";
        }
        else if(kilometraje >= KILOMETRAJE_SUPERIOR_CASI_NUEVO && kilometraje < KILOMETRAJE_SUPERIOR_USADO){
                uso = "Usado";
        }
        else if(kilometraje>=KILOMETRAJE_SUPERIOR_USADO){
                uso = "Muy usado";
        }
        else{
            uso = "Kilometraje no valido";
        }
        return uso;
        
    }
    
    public String consultarTipo(){
        String tipo;
        if(añoFabricacion<AÑO_FABRICACION_SUPERIOR_ANTIGUO){
            tipo = "Antiguo";
        }
        else if(añoFabricacion >= AÑO_FABRICACION_SUPERIOR_ANTIGUO && añoFabricacion < AÑO_FABRICACION_SUPERIOR_INTERMEDIO){
            tipo = "Intermedio";
        }
        else if(añoFabricacion >= AÑO_FABRICACION_SUPERIOR_INTERMEDIO && añoFabricacion < AÑO_FABRICACION_SUPERIOR_NUEVO){
            tipo = "Nuevo";
        }
        else if(añoFabricacion >= AÑO_FABRICACION_SUPERIOR_NUEVO){
            tipo = "Último modelo";
        }
        else{
            tipo = "No se puede determinar";
        }
        return tipo;
    }
}
