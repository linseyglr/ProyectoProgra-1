/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.model;

import java.util.LinkedList;

/**
 *
 * @author Angel
 */
public class Escaño {
    LinkedList<PartidoPolitico> partidos;

    public Escaño() {
        partidos = new LinkedList<PartidoPolitico>();
    }

    public LinkedList<PartidoPolitico> getPartidos() {
        return partidos;
    }

    public void setPartidos(LinkedList<PartidoPolitico> partidos) {
        this.partidos = partidos;
    }
}
