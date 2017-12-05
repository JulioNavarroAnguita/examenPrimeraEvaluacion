import java.util.Scanner;

public class Cadena {
	
	public static void main (String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.printf("%s%n", "Introduce una cadena");
		String cadena = in.next().toLowerCase();
		in.close();
		System.out.printf("La cadena \"%s\" en mayuscula es: %s, y en minuscula es: %s" + 
				" y la concatenacion es: %s%n", cadena, cadena.toUpperCase(), cadena.toLowerCase(), cadena.toUpperCase() + cadena.toLowerCase());
		System.out.printf("%s%n","______________________________");
		//En windows da error las acentuadas
		int contador = 0;
		for (int i = 0; i < cadena.length(); i++){
			if( cadena.charAt(i) == 'a' ||
				cadena.charAt(i) == 'e' ||
				cadena.charAt(i) == 'i' ||
				cadena.charAt(i) == 'o' ||
				cadena.charAt(i) == 'u'){
					contador++;
				}
		}	
		System.out.printf("Numero de caracteres acentuados que tiene la cadena \"%s\" son: %d%n",cadena, contador);
		System.out.printf("%s%n","______________________________");
		terminaEnConsonante(cadena);
		empiezaPorVocal(cadena);
		System.out.printf("%s%n","______________________________");
		System.out.printf("Reemplazar la vocal 'o' por el numero '1' %s%n",cadena.replace('o','1'));
			System.out.printf("Reemplazar la vocal 'a' por el numero '2' %s%n",cadena.replace('a','2'));

	}		
	
	public static void terminaEnConsonante (String cadena){
		
			if( cadena.endsWith("a") ||
				cadena.endsWith("e") ||
				cadena.endsWith("i") ||
				cadena.endsWith("o") ||
				cadena.endsWith("u")){
					System.out.printf("La cadena \"%s\" %s%n",cadena, " Termina en vocal"); 
			}else
				System.out.printf("La cadena \"%s\" %s%n",cadena, " termina en consonante");
				
	}
	
	public static void empiezaPorVocal (String cadena){
		
			if( cadena.startsWith("a") ||
				cadena.startsWith("e") ||
				cadena.startsWith("i") ||
				cadena.startsWith("o") ||
				cadena.startsWith("u")){
					System.out.printf("La cadena \"%s\" %s%n",cadena, " empieza por vocal"); 
			}else
				System.out.printf("La cadena \"%s\" %s%n",cadena, " no empieza por vocal");
				
	}
		
}

