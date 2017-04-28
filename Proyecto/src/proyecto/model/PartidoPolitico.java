
package proyecto.model;

/**
 *Descripcion de la clase: Clase utilizada para la declaración de la constitución de un partido político
 *Fecha de creacion: 16 de abril 2017
 *Autores: Linsey Garro Le Roy, Ramson Gu Wu
 *Revisor: Georges Alfaro Salazar
 */
public class PartidoPolitico {
    
    private int cantidadDeVotos;
    private int divisor;
    

    public PartidoPolitico(int cantidadDeVotos, int divisor) {
        this.cantidadDeVotos = cantidadDeVotos;
        this.divisor=divisor;
    }
    
    public PartidoPolitico(){
        cantidadDeVotos=0;
        divisor=1;
    }
    
    
    public int getCantidadDeVotos() {
        return cantidadDeVotos;
    }

    public void setCantidadDeVotos(int cantidadDeVotos) {
        this.cantidadDeVotos = cantidadDeVotos;
    }

    public int getDivisor() {
        return divisor;
    }

    public void setDivisor(int divisor) {
        this.divisor = divisor;
    }
    
    
    public int votos(){
        return cantidadDeVotos/divisor;
    }
    
    public void sumaDivisor(){
       divisor= divisor+1;
    }
    
}
