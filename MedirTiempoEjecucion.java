
public class MedirTiempoEjecucion {

	public static void main(String[] args) {
		  // guardar timestamp inicio
		  long start = System.currentTimeMillis();
		  
		  // hacer algo
		  for (int a=1; a<=1000000; a++)
		  {
		    System.out.println(a);
		  }
		  
		  // calcular tiempo transcurrido
		  long end = System.currentTimeMillis();
		  long res = end - start;
		  System.out.println("Milisegundos: " + (double) res);
		  System.out.println("Segundos: " + (double) (res/1000));
	}
}
