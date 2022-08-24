
package pokemon.reto7;

import java.util.List; //Se cambia arraylist por list


public class Carretera {
    
    protected List<TramoGenerico> tramos; //Se cambia arraylist por list

    public Carretera(List<TramoGenerico> tramos) { //Se cambia arraylist por list
        this.tramos = tramos;
    }
    
    
     
    public int longitudTotal(){
        int i, longitudTotal=0;
        
        for (i = 0 ; i < tramos.size(); i++){
        longitudTotal += tramos.get(i).longitud();
    }
        return longitudTotal;

    }
    
    
    public int areaTotal(){
        int i , areaTotal = 0;
        
        for (i = 0; i < tramos.size(); i++ ){
            areaTotal += tramos.get(i).area();
        }
        return areaTotal;
    }    
    
    
    
    public double volumenTotal(){
        int i ;
        double volumenTotal = 0;
        
        for (i = 0; i < tramos.size(); i++ ){
            volumenTotal += tramos.get(i).volumen();
        }
        return volumenTotal;
    }  
    
    
    
    public double volumenTAsfalto(){
        int i ; 
        double volumenTAsfalto = 0;
        
        for (i = 0; i < tramos.size(); i++ ){
            if (tramos.get(i).getClass().getSimpleName().equals("TramoAsfalto")){
            volumenTAsfalto += tramos.get(i).volumen();
            }
        }
        return volumenTAsfalto;
    }  
        
    
    public double volumenTSinAsfalto(){
        int i ; 
        double volumenTSinAsfalto = 0;
        
        for (i = 0; i < tramos.size(); i++ ){
            if (tramos.get(i).getClass().getSimpleName().equals("TramoSinAsfalto")){
            volumenTSinAsfalto += tramos.get(i).volumen();
            }
        }
        return volumenTSinAsfalto;
    }  
    public boolean estanConectados(){
        if(tramos.size() > 1){
        for (int i = 1; i < tramos.size(); i++){
            if(tramos.get(i).xI != tramos.get(i-1).xF || tramos.get(i).yI != tramos.get(i-1).yF){
                return false;
            }
        }
        return true;
        }
        return false;
    }
}
