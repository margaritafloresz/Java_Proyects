/*
 Ejercicio 3: Guillermo tiene N dólares.
 Luis tiene la mitad de lo que posee Guillermo-
 Juan tiene la mitad de lo que poseen Luis y Guillermo juntos.
 Hacer un programa que calcule e imprima la cantidad de dinero que tienen entre los tres.
  */

package ejercicio_1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		
		float guillermo, luis, juan, total;
		
		System.out.println("Digita la cantidad de dinero que tiene Guillermo");
		
		guillermo = entrada.nextFloat();
		
		luis = guillermo/2; // Tiene la mitad de lo que pose guillermo
		juan = (guillermo + luis) / 2; 
		total = luis + guillermo + juan;
		
		System.out.println("La cantidad de dinero que tiene es :" + total);
		System.out.println("La cantidad de dinero que tiene Juan :" + juan);
		
	}

}
