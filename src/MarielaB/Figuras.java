
package MarielaB;

/**
 *
 * @author usuario
 */
import java.util.Scanner;
public class Figuras {

  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        double wlado, walt, wbas;
        System.out.println("Lado del Cuadrado.....");
        wlado=entrada.nextDouble();
        System.out.println("Base del rectangulo");
        wbas=entrada.nextDouble();
        System.out.println("Altura del rectangulo");
        walt=entrada.nextDouble();
        Cuadrado objcuad= new Cuadrado (wlado);
        Rectangulo objrect= new Rectangulo (wbas, walt);
        objcuad.setarea();
        objcuad.setperimetro();
        objcuad.dibujar(wlado, wlado);
        objrect.setarea();
        objrect.setperimetro();
        objrect.dibujar(walt,wbas);
        
      
    }
    
}
