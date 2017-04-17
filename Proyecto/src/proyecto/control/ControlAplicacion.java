
package proyecto.control;

import proyecto.model.Modelo;

/**
 *Descripcion de la clase: Controlador 
 *Fecha de creacion: 16 de abril 2017
 *Autores: Linsey Garro Le Roy, Ramson Gu Wu
 *Revisor: Georges Alfaro Salazar
 */

public class ControlAplicacion {
    
    public ControlAplicacion(Modelo nuevosDatos) {
        datos = nuevosDatos;
    }

    public ControlAplicacion() {
        this(new Modelo());
    }
   
     private Modelo datos;
    
}
