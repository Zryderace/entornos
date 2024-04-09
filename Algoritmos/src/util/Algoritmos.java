package util;

public abstract class Algoritmos {

	/**
	 * Devuelve el sumatorio del numero especificado, int
	 * 
	 * @param numero del que queremos calcular el sumatorio
	 * @return sumarotio del numero especificado
	 */
	public static int sumatorio(int numero) {
		
		int total = 1;
		
		for (int i = 2; i < numero+1; i++) {
			total += i;
		}
		return total;
	}
	
	/**Devuelve el factorial del numero especificado int
	 * 
	 * @param numero numero que queremos calcular el factorial
	 * @return el factorial del numero especificado
	 */
	public static int factorial(int numero) {
		int factorial = 2;
		
		for (int i = 3; i <= numero; i++) {
			factorial *= i;
		}
		
		return factorial;
	}
}
