/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pokemon.reto7;

import java.util.ArrayList;
import java.util.List;


public class Carretera {
    
    protected ArrayList<TramoGenerico> tramos;

    public Carretera(ArrayList<TramoGenerico> tramos) {
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
