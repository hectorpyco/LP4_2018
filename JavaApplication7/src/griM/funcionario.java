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
public class funcionario extends director{
     String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public funcionario() {
    }
    public void nombrefuncionario() {
        nombre = "Alfredo Estigarribia";
        System.out.println("El nombre del funcionario es:" + nombre);
    }
}
