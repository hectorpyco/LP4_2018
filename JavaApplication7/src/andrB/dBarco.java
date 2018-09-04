/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package andrB;

/**
 *
 * @author Pc- Usuario
 */
public class dBarco extends dAcuatico{
    private String capacidad;

    public dBarco() {
        super();
    }

    public dBarco(String capacidad, String tiponavegacion, int idvehiculo, String matricula, String marca, String modelo) {
        super(tiponavegacion, idvehiculo, matricula, marca, modelo);
        this.capacidad = capacidad;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }
    
}
