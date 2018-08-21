/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package griM;

public class director {
     String nombre;
     public void nombredirector( ) {
        nombre = "Alfredo";
        System.out.println("El nombre del director es:"+nombre);
    }
      public String getNombre() {
        return this.nombre;
    }
}

