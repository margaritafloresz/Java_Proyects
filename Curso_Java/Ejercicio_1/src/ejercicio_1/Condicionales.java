package ejercicio_1;

import javax.swing.JOptionPane;

public class Condicionales {

	public static void main(String[] args) {
			int numero, dato = 5;
			
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un número "));
			
			if (numero <= dato) {
				JOptionPane.showMessageDialog(null, "El número 5 o menor a 5");
			} else {
				JOptionPane.showMessageDialog(null, "El número es mayor a  5");
			}

	}

}
