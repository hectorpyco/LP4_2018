/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package griM;


public class alumno extends profesor{

    public alumno() {
    }
   
     public String getNombre() {
        return this.nombre;
    }

    void nombrealumno() {
        nombre = "Mario";
        System.out.println("El nombre del alumno es:" + nombre);
    }
}
