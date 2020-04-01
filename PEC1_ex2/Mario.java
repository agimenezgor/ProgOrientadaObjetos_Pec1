import java.util.Scanner;


public class Mario {

	final static String LEFT = "left";
	final static String RIGHT = "right";
	
	public static void main(String[] args) {
		final String ERROR_MUST_BE_INTEGER ="[ERROR] You must write an integer number!!";
		final String ERROR_MUST_BE_VALID_DIRECTION ="[ERROR] You must write a valid direction: LEFT or RIGHT!!";
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Write a number: ");
		String numberInput = in.next();
		
		System.out.println("Select direction: ");
		
		String direction = in.next();
		
		if(!isValidDirection(direction)) {
			System.err.println(ERROR_MUST_BE_VALID_DIRECTION);
			System.exit(1);
		}
		
		try {
			int number = Integer.parseInt(numberInput);
			String result = upstair(number, direction);
			System.out.println(result);
		} catch (NumberFormatException e) {
			System.err.println(ERROR_MUST_BE_INTEGER);
			System.exit(1);
		}			    	
		
		in.close();
	}
	
	/**
	 * 
	 * @param direction palabra que indica la dirección en la que se genera la escalera (left o right)
	 * @return Valor booleano que indica si la dirección es válida.
	 */
	
	public static boolean isValidDirection(String direction) {
		// Convierto la cadena de caracteres en minuscula
		direction = direction.toLowerCase();
		
		// Comparo el valor de la cadena con los enumerados de dirección
		if(direction.equals(LEFT) || direction.equals(RIGHT)){
			// Si el valor es correcto, devulve true
			return true;
		}
		else{
			// Si no es correcto, devuelve false
			return false;
		}
	}
	
	/**
	 * 
	 * @param length Tamaño de la escalera de Mario, generada hacia la derecha.
	 * @return Genera la escalera de Mario hacia la derecha
	 */
	
    public static String upstairRight(int length) { 
	   // Declaro la cadena de caracteres que imprimirá la escalera
	   StringBuilder right = new StringBuilder();
	   right.append("*" + "\n");
	   
	   // Declaro las variables necesarias para las iteraciones de los ciclos for
	   // Declaro una variable que guarde cuantas posiciones debe de tener el escalón
	   int i, j, position = 1;
	   
	   // Itero tantas veces como tamaño tenga el valor de entrada
	   for(i = 1; i < length; i++){
		   // Itero tantas veces como tamaño necesite tener cada escalón
		   for(j = 0; j <= position; j++){
			  // Concateno los asteriscos necesarios
			  right.append("* ");
		   }
		   // Concateno salto de linea
		   right.append("\n");
		   
		   // Sumo una posición al escalón
		   position++;
	   }
	   
	   // Devuelvo la escalera
	   return right.toString();
    }
	
	/**
	 * 
	 * @param length Tamaño de la escalera de Mario, generada hacia la izquierda.
	 * @return Genera la escalera de Mario hacia la izquierda
	 */
	 
    public static String upstairLeft(int length) { 
		// Declaro la cadena de caracteres que imprimirá la escalera
	   StringBuilder left = new StringBuilder();
	   
		// Declaro las variables necesarias para las iteraciones de los ciclos for
	   // Declaro una variable que guarde cuantas espacios debe tener al principio
	   int i, j, k, e, spaces, asterisks;
	   spaces = length - 1;
	   asterisks = 2;
	   
	   // Concateno los espacios de la primera iteración
	   for(e = 0; e < spaces; e++){
		   left.append("  ");
	   }
	   
	   // Contateno el primer asterisco
	   left.append(" *\n");
	   
	   // Itero tantas veces como tamaño tenga el valor de entrada
	   for(i = 1; i < length; i++){
		   // Resto una posición a la cantidad de espacios a imprimir
		   spaces--;
		   
		   // Sumo una posición a la cantidad de asteriscos a imprimir
		   asterisks++;
		   
		   // Concateno los espacios iniciales
		   for(j = 0; j < spaces; j++){
			   left.append("  ");
		   }
		   
		   // Concateno los asteriscos necesarios
		   for(k = 1; k < asterisks; k++){
			   left.append(" *");
		   }
		   
		   // Concateno salto de linea
		   left.append("\n");
	   }
	   
	   // Devuelvo la escalera
	   return left.toString();
    }
	
	/**
	 * 
	 * @param length Tamaño de la escalera de Mario, generada hacia la derecha.
	 * @param direction Dirección en la que se generará la escalera (left o right)
	 * @return Genera la escalera de Mario hacia la derecha
	 */
	 
    public static String upstair(int length, String direction) {
		// Cadena de caracteres que imprime la escalera
		String stairs;
		
		// Paso el valor de la cadena de caracteres a minúscula
		direction = direction.toLowerCase();
		
		// Si la escalera tiene dirección derecha, llamo a la función upstairRight
		if(direction.equals(RIGHT)){
			stairs = upstairRight(length);
		}
		// Si la escalera tiene dirección izquierda, llamo a la función upstairLeft
		else {
			stairs = upstairLeft(length);
		}
		
		// Devuelve la escalera
		return stairs;
    }
	
}
