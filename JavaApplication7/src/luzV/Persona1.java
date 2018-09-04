/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package luzV;

/**
 *
 * @author Melina
 */
public class Persona1 extends Persona {
    public Persona1(){
		super();
	}
	public Persona1(String nombre, int edad){
		this.nombre=nombre;
		this.edad= edad;
		System.out.println("Esta persona se llama "+ this.nombre +
				" tiene: "+ this.edad + "años");
	}
	
String nombre;
int edad;
}
