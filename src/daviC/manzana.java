/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daviC;

/**
 *
 * @author david
 */
public class manzana extends frutas {

    public manzana() {
        super();
    }

    public manzana(String variedad, int peso) {
        this.variedad = variedad;
        this.peso = peso;
        System.out.println("Esta manzana es de la variedad"+ this.variedad+"pesa:"+ this.peso+"kg");
    }
    
    String variedad;
    int peso;
}
