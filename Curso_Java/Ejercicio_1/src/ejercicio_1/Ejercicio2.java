package ejercicio_1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
	
		Scanner  entrada = new Scanner(System.in);
		
		float salario, horasTrabajadas, mult, nombre;
		
		System.out.println("Digite su salario y horas trabajas, por favor");
	
		
		salario = entrada.nextFloat();
		horasTrabajadas = entrada.nextFloat();
	
		mult = salario * horasTrabajadas;
		
		System.out.println("El salario semanal es de : " + mult);
		
		
	}

}
