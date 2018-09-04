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
public class dAves {
    private int idAve;
    private String tamanio;
    private String velocidad;
    private String alimentacion;

    public dAves() {
    
    }

    public dAves(int idAve, String tamanio, String velocidad, String alimentacion) {
        this.idAve = idAve;
        this.tamanio = tamanio;
        this.velocidad = velocidad;
        this.alimentacion = alimentacion;
    }

    public int getIdAve() {
        return idAve;
    }

    public void setIdAve(int idAve) {
        this.idAve = idAve;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(String velocidad) {
        this.velocidad = velocidad;
    }

    public String getAlimentacion() {
        return alimentacion;
    }

    public void setAlimentacion(String alimentacion) {
        this.alimentacion = alimentacion;
    }
    
    
    
    
    
    
}
