import java.util.Scanner;

/**Clase Numero 
 * donde realizamos 
 * diferentes ejercicios
 * para obtener unos resultados
 * @author Julio
 * @version 1.0
 * */
 
public class Numero {
	
	public static void main (String[] args) {
		//Abrimos el Scanner para recoger datos
		Scanner in = new Scanner (System.in);
		System.out.printf("%s%n","Introduce dos numeros enteros por favor");
		int numero1 = in.nextInt();
		int numero2 = in.nextInt();
		in.close();
		devolverNumeroMayor(numero1,numero2);
		mostrarLosDiezPrimerosMultiplosDeTres(numero1);
		
		
		if(numero1 < 0 || numero1 > 1000)
			System.out.printf("El numero %d introducido no es valido %n", numero1);
			
		if(numero2 < 0 || numero2 > 1000)
			System.out.printf("El numero %d introducido no es valido %n", numero2);

		
		
	}
	/**Método que devuele que numero
	 * es mayor pasandole como parametros 
	 * los numeros que lee por
	 * el Scanner
	 * @param numero1, de tipo int
	 * @param numero2, de tipo int
	 * */
	public static void devolverNumeroMayor(int numero1, int numero2) {
		if (numero1 > numero2)
			System.out.printf("El numero %d es mayor que el numero %d %n",numero1, numero2);
		else if (numero2 > numero1)
			System.out.printf("El numero %d es mayor que el numero %d %n",numero2, numero1);
		else{
			System.out.printf("Mostramos uno de los dos %d %n", numero1);//revisar si podria ponerlo aleatorio
		}
	
	}
	
	/**Método que devuelve 
	 * los 10 primeros múltiplos
	 * de tres
	 * @param numero1, de tipo int
	 * */
	public static void mostrarLosDiezPrimerosMultiplosDeTres(int numero1){
			
			for (int i = 1; i <= 10; i++){
				for(int j = 1; i <= 10; i++) {
					System.out.println((i * j * 3 * 10));
				}
				
			}
	}
	
		
	
}

