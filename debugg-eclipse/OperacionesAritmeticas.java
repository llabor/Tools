package operacionesaritmeticas;
import java.util.Scanner;
public class OperacionesAritmeticas {
    private Scanner teclado;
    private int valor1,valor2;
    
    public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Introduzca primer valor: ");
        valor1=teclado.nextInt();
        System.out.print("Introduzca segundo valor: ");
        valor2=teclado.nextInt();
    }
    
    public void sumar() {
        int suma;
        suma=valor1+valor2;
        System.out.println("La suma es:"+suma);
    }
    
    public void restar() {
        int resta;
        resta=valor1-valor2;
        System.out.println("La resta es:"+resta);
    }
    
    public void multiplicar() {
        int multiplicacion;
        multiplicacion=valor1*valor2;
        System.out.println("La multiplicación es:"+multiplicacion);
    }
    
    public void dividir() {
        float division;
        division = valor1/valor2;
        System.out.println("La división es:"+ division);
    }
    
    public static void main(String[] ar) {
        OperacionesAritmeticas opera;
        opera=new OperacionesAritmeticas();
        opera.inicializar();
        opera.sumar();
        opera.restar();
        opera.multiplicar();
        opera.dividir();
    }
}
