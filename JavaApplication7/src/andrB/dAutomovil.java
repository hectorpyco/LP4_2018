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
public class dAutomovil extends dTerrestre{
    private String color;

    public dAutomovil() {
        super();
    }

    public dAutomovil(String color, String kilometraje, int idvehiculo, String matricula, String marca, String modelo) {
        super(kilometraje, idvehiculo, matricula, marca, modelo);
        this.color = color;
    }
    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}