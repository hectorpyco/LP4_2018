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
public class locote extends verduras{

    public locote() {
        super();
    }
    public locote(String variedad, int peso){
        this.variedad = variedad;
        this.peso = peso;
        System.out.println("Este locote es de la variedad"+ this.variedad+"pesa:"+ this.peso+"kg");
    }
  String variedad;
  int peso;
}
