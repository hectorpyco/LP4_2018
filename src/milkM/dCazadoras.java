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
public class dCazadoras extends dAves {
    private String horariocaza; 

    public dCazadoras() {
        super ();
    }

    public dCazadoras(String horariocaza, int idAve, String tamanio, String velocidad, String alimentacion) {
        super(idAve, tamanio, velocidad, alimentacion);
        this.horariocaza = horariocaza;
    }

    public String getHorariocaza() {
        return horariocaza;
    }

    public void setHorariocaza(String horariocaza) {
        this.horariocaza = horariocaza;
    }
    
    
}
