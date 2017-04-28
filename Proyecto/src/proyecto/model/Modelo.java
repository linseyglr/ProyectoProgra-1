
package proyecto.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;

/**
 *Descripcion de la clase: Modelo
 *Fecha de creacion: 16 de abril 2017
 *Autores: Linsey Garro Le Roy, Ramson Gu Wu
 *Revisor: Georges Alfaro Salazar
 */

public class Modelo extends Observable {
    
    EscañoTableModel escañosModel;
    LinkedList<Escaño> escaños;
    
    public Modelo(){
        escaños = new LinkedList<Escaño>();
        //partidos = new EscañoTableModel(partidosPoliticos.size(),partidosPoliticos);
        this.setEscaños(escaños);
    }

    public LinkedList<Escaño> getEscaños() {
        return escaños;
    }

    public void setEscaños(LinkedList<Escaño> partidosPoliticos) {
        this.escaños = partidosPoliticos;
    }
    
     public void setEscañosModel(List<Escaño> partidos,int col){
         List<Integer> cols = new LinkedList<Integer>();
        for(int i = 0;i<col;i++)
            cols.add(i);
        this.escañosModel =new EscañoTableModel(cols,partidos);  
        setChanged();
        notifyObservers();        
    }    
     
    public EscañoTableModel getEscañosModel() {
        return escañosModel;
    }
   
}
