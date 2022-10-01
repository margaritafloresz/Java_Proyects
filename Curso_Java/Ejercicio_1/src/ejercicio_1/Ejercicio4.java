/*
 La calificación final de un estudiante de Informática se calcula con base a las calificaciones de cuatro aspectos d esu rendimiento académico:
 participación, primer examen parcial, segundo examen parcial y examen final.
 Sabiendo que las calificaciones anteriores entran a la calificación final con ponderaciones del 
 10%, 25%, 25% y 40%, Hacer un programa que calcule e imprima las calificación final obtenida de un estudiante.
 * */

package ejercicio_1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		//Definir datos
		
		float participacion, primerExamen, segundoExamen, examenFinal, notaFinal;
		
		System.out.println("Digite la nota de participación");
		participacion= entrada.nextFloat();
		System.out.println("Digite la nota del primer examen parcial");
		primerExamen = entrada.nextFloat();
		System.out.println("Digite la nota del segundo examen parcial");
		segundoExamen = entrada.nextFloat();
		System.out.println("Digite la nota del examen finall");
		examenFinal = entrada.nextFloat();
		//Sacar los datos
		participacion *= 0.10f;
		primerExamen *= 0.25f;
		segundoExamen *= 0.25f;
		examenFinal *= 0.40f;
		//imprimir resultado 
		notaFinal = participacion + primerExamen+ segundoExamen + examenFinal;
		
		System.out.println("La nota final es : " + notaFinal);
	}

}
