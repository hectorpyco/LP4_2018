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
public class Tarealp4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    director Superclase = new director();
        profesor clasehijo = new profesor();
        funcionario clasehija = new funcionario();
        alumno clasenieto = new alumno();
        alumna clasenieta = new alumna();

        Superclase.nombredirector();
        clasehijo.nombredocente();
        clasehija.nombrefuncionario();
        clasenieto.nombrealumno();
        clasenieta.nombrealumna();

}
}