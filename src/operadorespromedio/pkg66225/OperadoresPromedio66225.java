
package operadorespromedio.pkg66225;
import java.util.*;
/**
 *
 * @author USER
 */
public class OperadoresPromedio66225 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner (System.in);
       
       int valorA=20,valorB=15,valorC=10,valorD=5,valorE=50,suma,promedio;
        suma= valorA+valorB+valorC+valorD+valorE;
        promedio = suma/5;
        
        System.out.println("El promedio es: "+promedio);
    }
    
}
