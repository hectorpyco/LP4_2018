/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package griM;

public class profesor extends director{
    String nombre;

    public profesor() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void nombredocente() {
        nombre = "Hector Estigarribia";
        System.out.println("El nombre del docente es:" + nombre);
    }
}
