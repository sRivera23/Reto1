
package pokemon.reto7;
import java.util.List;
import java.util.ArrayList;

public class ClasePrincipal {

    
    public static void main(String[] args) {
        
        List<TramoGenerico> listaTramos = new ArrayList<>();
        
        TramoGenerico uno = new TramoAsfalto(1, 1, 2, 2);
        
        TramoGenerico dos = new TramoAsfalto(2, 2, 2, 4);
        
        TramoGenerico tres = new TramoSinAsfalto("piedra", 0.5, 2, 4, 3, 1 );
        
        listaTramos.add(uno);
        listaTramos.add(dos);
        listaTramos.add(tres);
        
        Carretera tramos = new Carretera(listaTramos);
        System.out.println("Area total aproximada: " + tramos.areaTotal());
        
        System.out.println("Volumen total: " + tramos.volumenTotal());
        
        System.out.println("Volumen total de asfalto: " + tramos.volumenTAsfalto());
      
        System.out.println("Volume total sin asfalto: " + tramos.volumenTSinAsfalto());
        
        System.out.println("Longitud total aproximada: " + tramos.longitudTotal());
        
        System.out.println("Estan conectados?: " + tramos.estanConectados());
        
        TramoGenerico cuatro = new TramoSinAsfalto("arena",0.8,3,2,5,7);
        
        listaTramos.add(cuatro);
        
        System.out.println("Area total aproximada: " + tramos.areaTotal());
        
        System.out.println("Volumen total: " + tramos.volumenTotal());
        
        System.out.println("Volumen total de asfalto: " + tramos.volumenTAsfalto());
      
        System.out.println("Volume total sin asfalto: " + tramos.volumenTSinAsfalto());
        
        System.out.println("Longitud total aproximada: " + tramos.longitudTotal());
        
        System.out.println("Estan conectados?: " + tramos.estanConectados());
        
    }
    
}
