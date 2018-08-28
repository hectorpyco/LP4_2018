
package MarielaB;

import org.omg.PortableServer.POAPackage.ServantAlreadyActive;

/**
 *
 * @author usuario
 */
public abstract class figura { // crear atributos
    protected String nombre;
    protected double area;
    protected double perimetro;
    
    public figura(String n){
        nombre=n;
    }
    public String getnombre (){
        return nombre;
    }
    public double getarea(){
        return area;
        
    }
    public abstract void setarea();
    public abstract void setperimetro();
    
    public double getperimetro(){
        return perimetro;
    }
    public void dibujar (double lado1, double lado2){
        System.out.println("Nombre:"+this.getnombre());
        System.out.println("Area"+this.getarea());
        System.out.println("Perimetro"+this.getperimetro());
        for(int i=0;i<lado1;i++){
            for(int j=0; j<lado2; j++)
                System.out.print("*");
            System.out.println();
        }
    }
    
}
