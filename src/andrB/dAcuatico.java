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
public class dAcuatico extends dVehiculos{
    private String tiponavegacion;

    public dAcuatico() {
        super();
    }

    public dAcuatico(String tiponavegacion, int idvehiculo, String matricula, String marca, String modelo) {
        super(idvehiculo, matricula, marca, modelo);
        this.tiponavegacion = tiponavegacion;
    }

    public String getTiponavegacion() {
        return tiponavegacion;
    }

    public void setTiponavegacion(String tiponavegacion) {
        this.tiponavegacion = tiponavegacion;
    }
    
}
