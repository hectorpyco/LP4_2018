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
public class dTerrestre extends dVehiculos{
    private String kilometraje;
    
    public dTerrestre() {
        super ();      
    }
    
    public dTerrestre(String kilometraje, int idvehiculo, String matricula, String marca, String modelo) {
        super(idvehiculo, matricula, marca, modelo);
        this.kilometraje = kilometraje;
    }
    
    public String getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(String kilometraje) {
        this.kilometraje = kilometraje;
    }
      
}
