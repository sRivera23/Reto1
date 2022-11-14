
package retos.reto9;

import java.io.*;
import static  retos.reto9.FlujoPorLinea.guardarPorLineas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.io.IOException;


public class Archivo {

    public void punto1(String ruta, String destino){
        String linea;
        String lineaCopia;
        String tab = "        ";
        List <String> listaDeLineas = new ArrayList<String>();
        String archivoDestino = destino/*cambiar por ruta personal*/;
        
       
        try (BufferedReader lectorPorLineas = new BufferedReader(new FileReader(ruta))) {
            band:
            while((linea = lectorPorLineas.readLine()) != null ) {
                String precioEthereum[] = linea.split(",");
                String precioCierre;
                if(precioEthereum[0].equals("Date")) continue band;
                if((Double.parseDouble(precioEthereum[4]) < (double)1200)){
                    precioCierre = "MUY BAJO";
                }else if ((Double.parseDouble(precioEthereum[4]) >= (double)1200) && (Double.parseDouble(precioEthereum[4]) <(double)2100)){
                    precioCierre = "BAJO";
                }else if((Double.parseDouble(precioEthereum[4]) >= (double)2100) && (Double.parseDouble(precioEthereum[4]) <(double)3100)) {
                    precioCierre = "MEDIO";
                }else if ((Double.parseDouble(precioEthereum[4]) >= (double)3100) && (Double.parseDouble(precioEthereum[4]) <(double)4600)){
                    precioCierre = "ALTO";
                }else{precioCierre = "MUY ALTO";}
                lineaCopia = precioEthereum[0]+ tab + precioCierre;
                listaDeLineas.add(lineaCopia);
            }
            String[] listaDeLineasArreglo = new String[listaDeLineas.size()];
            listaDeLineasArreglo = listaDeLineas.toArray(listaDeLineasArreglo);
            guardarPorLineas(archivoDestino, listaDeLineasArreglo);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
    }
    
    public void promedioYDesviacion (String ruta){
        String linea;
        double suma = 0, dato = 0;
        List<Double> ListaPreciosCierre = new ArrayList<>();
        try (BufferedReader lectorPorLineas = new BufferedReader(new FileReader(ruta))) {
            band:
            while((linea = lectorPorLineas.readLine()) != null ) {
            String vectorDatos[] = linea.split(",");
            if(vectorDatos[0].equals("Date")) continue band;
            dato = Double.valueOf(vectorDatos[4]);
            ListaPreciosCierre.add(dato);
            suma += dato;
            }
        double promedio = suma / ((ListaPreciosCierre.size()));
        System.out.println("El promedio del precio de cierre es "+(promedio*1000000));
        suma = 0;
        for (double elem : ListaPreciosCierre) {
        suma += Math.pow(elem - promedio, 2);
        }
        double desviacionEstandar = Math.sqrt(suma / (ListaPreciosCierre.size() - 1));
        System.out.println("La desviación estándar del precio de cierre es "+(desviacionEstandar*1000000));
      }
      catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    public void volumenMayorYMenor (String ruta){
        
        String linea;
        List<Double> ListaVolumenes = new ArrayList<>();
        List<String> fecha = new ArrayList<>();
        try (BufferedReader lectorPorLineas = new BufferedReader(new FileReader(ruta))) {
            band:
        while((linea = lectorPorLineas.readLine()) != null ) {
            String vectorDatos[] = linea.split(",");
            if(vectorDatos[0].equals("Date")) continue band;
            ListaVolumenes.add(Double.valueOf(vectorDatos[6]));
            fecha.add(vectorDatos[0]);
            }
            double volMax = Collections.max(ListaVolumenes);
            double volMin = Collections.min(ListaVolumenes);
            
            int posicionMax = -1;
        for (double posiblePosicionMax : ListaVolumenes) {
            posicionMax++;
            if (posiblePosicionMax == volMax) {
                break;
            }
        }
        int posicionMin = -1;
        for (double posiblePosicionMin : ListaVolumenes) {
            posicionMin++;
            if (posiblePosicionMin == volMin) {
                break;
            }
        }
        
        System.out.println("El volumen transado mas alto es: " + volMax + " en la fecha " + fecha.get(posicionMax));
        System.out.println("El volumen transado mas bajo es: " + volMin + " en la fecha " + fecha.get(posicionMin));
        
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    
    
}
