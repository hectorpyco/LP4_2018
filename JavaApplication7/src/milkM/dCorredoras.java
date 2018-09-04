/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package milkM;

/**
 *
 * @author Milko
 */
public class dCorredoras extends dAves {
    private String reproduccion;

    public dCorredoras() {
        super();
    }

    public dCorredoras(String reproduccion, int idAve, String tamanio, String velocidad, String alimentacion) {
        super(idAve, tamanio, velocidad, alimentacion);
        this.reproduccion = reproduccion;
    }

    public String getReproduccion() {
        return reproduccion;
    }

    public void setReproduccion(String reproduccion) {
        this.reproduccion = reproduccion;
    }
    
    
    
    
    
    
}
