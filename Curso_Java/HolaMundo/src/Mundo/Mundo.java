package Mundo;

import javax.swing.JOptionPane;

public class Mundo {

	public static void main(String[] args) {

		String cadena;
		int entero;
		char letra;
		double decimal;

	
		cadena = JOptionPane.showInputDialog("Digite una cadea: ");
		entero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número entero: "));
		letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);
		decimal = Double.parseDouble(JOptionPane.showInputDialog("Digite un decimal"));
		
		
		JOptionPane.showMessageDialog(null, "La cadena es : " + cadena);
		JOptionPane.showMessageDialog(null, "El número entero es  : " + entero);
		JOptionPane.showMessageDialog(null, "El caracter es " + letra);
		JOptionPane.showMessageDialog(null, "El número decimal es  : " + decimal);
	}

}
