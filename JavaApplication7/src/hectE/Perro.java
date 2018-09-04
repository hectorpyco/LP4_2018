package hectE;

public class Perro extends Canidos {
	public Perro(){
		super();
	}
	public Perro(String nombre, int peso){
		this.nombre=nombre;
		this.peso= peso;
		System.out.println("Este perro se llama"+ this.nombre +
				" pesa: "+ this.peso + "kg");
	}
	
String nombre;
int peso;

}
