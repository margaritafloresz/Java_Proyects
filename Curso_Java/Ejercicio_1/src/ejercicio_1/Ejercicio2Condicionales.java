package ejercicio_1;

import javax.swing.JOptionPane;

public class Ejercicio2Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char letra;
		
		letra = JOptionPane.showInputDialog("Digite una letra : ").charAt(0);
		
		//Characte.isUpperCase te ayuda a saber si la letra es mayuscula
		if(Character.isUpperCase(letra)) {
			JOptionPane.showMessageDialog(null, "Es una letra mayuscula");
		} else {
			JOptionPane.showMessageDialog(null, "Es una letra minuscula");
		}
	}

}
