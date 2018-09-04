/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package griM;

/**
 *
 * @author montania
 */
public class alumna extends profesor {

    public alumna() {
    }
   
     public String getNombre() {
        return this.nombre;
    }

    void nombrealumna() {
         nombre = "Gricelda";
         System.out.println("El nombre de la alumna es:" + nombre);
    }
}
