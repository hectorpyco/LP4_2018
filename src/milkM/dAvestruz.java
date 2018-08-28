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
public class dAvestruz extends dCorredoras{
    private String especie;

    public dAvestruz() {
        super ();
    }


    public dAvestruz(String especie, String reproduccion, int idAve, String tamanio, String velocidad, String alimentacion) {
        super(reproduccion, idAve, tamanio, velocidad, alimentacion);
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    
    
    
    
}
