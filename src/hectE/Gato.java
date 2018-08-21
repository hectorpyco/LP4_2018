package hectE;

public class Gato extends Felinos {
	public Gato(){
		super();
	}
	public Gato(String nombre, int peso){
		this.nombre=nombre;
		this.peso= peso;
		System.out.println("Este gato se llama"+ this.nombre +
				" pesa: "+ this.peso + "kg");
	}
	
String nombre;
int peso;
}
