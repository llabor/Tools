/* 
Código ejemplo para depurar 
 */
package ejemplodebug;

public class EjemploDebug {

     public static void main(String[] args) {
        int numMax = 100;
        int numActual = 1;
        int incremento = 1;
        while (numActual <= numMax){
            System.out.println(numActual);
            numActual += incremento;
            incremento++;
        }
    }
    
}
