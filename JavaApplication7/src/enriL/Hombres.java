package enriL;

public class Hombres extends Funcionario {

    public Hombres() {
        super();
    }

    public Hombres(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
        this.edad = edad;
        //this.edad = ;

        System.out.println("Su nombre es " + this.nombre);
        System.out.println("Su edad es " + this.edad);
        System.out.println("Su peso es " + this.peso);
    }

}
