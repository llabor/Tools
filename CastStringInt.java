
public class CastStringInt {

	public static void main(String[] args) {
		
		int entero = 8;
		String texto = "12345";
		
		// Cast de entero a String
		String y = String.valueOf(entero);
		String numCadena= Integer.toString(entero);
		
		// Cast de String a entero
		int x = Integer.parseInt(texto);
				
		System.out.println(x);
		System.out.println(y + " " + numCadena);

	}

}
