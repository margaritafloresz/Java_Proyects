package ejercicio_1;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		float nota1, nota2, nota3, suma;
		
		
		System.out.println("Digita tres calificaciones");
		//Guardar las tres notas
		
		nota1 = entrada.nextFloat();
		nota2 = entrada.nextFloat();
		nota3 = entrada.nextFloat();
		
		suma= nota1 + nota2+ nota3; //Se suman las tres notas
		
		System.out.println(" La suma total de las calificaciones es : " + suma);
	}

}
