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
public class dAguila extends dCazadoras{
    private String habitat;

    public dAguila() {
        super ();
    }


    public dAguila(String habitat, String horariocaza, int idAve, String tamanio, String velocidad, String alimentacion) {
        super(horariocaza, idAve, tamanio, velocidad, alimentacion);
        this.habitat = habitat;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    
    
    
}
