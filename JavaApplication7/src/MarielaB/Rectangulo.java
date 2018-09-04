/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MarielaB;

/**
 *
 * @author usuario
 */
public class Rectangulo extends figura { //derivada de figura
    private double base;
    private double altura;
    
    public Rectangulo(double b, double a){
        super ("Rectangulo");
        base=b;
        altura=a;
    }
  
    public void setperimetro(){
          this.perimetro=(base*2)+(altura*2);
    }

	@Override
	public void setarea() {
		// TODO Auto-generated method stub
		this.area= base*altura;
	}
 
  }
    

