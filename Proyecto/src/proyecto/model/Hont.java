
package proyecto.model;

import java.util.LinkedList;


public class Hont {
    
    private LinkedList<PartidoPolitico> partidos;

    public Hont(LinkedList<PartidoPolitico> partidos) {
        this.partidos = partidos;
    }

    public Hont() {
        partidos= new LinkedList<PartidoPolitico>();
    }

    public LinkedList<PartidoPolitico> getPartidos() {
        return partidos;
    }

    public void setPartidos(LinkedList<PartidoPolitico> partidos) {
        this.partidos = partidos;
    }
    
    
    
}
