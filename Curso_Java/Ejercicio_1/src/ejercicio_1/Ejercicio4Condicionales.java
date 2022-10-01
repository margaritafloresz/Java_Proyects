package ejercicio_1;

import javax.swing.JOptionPane;

public class Ejercicio4Condicionales {

	public static void main(String[] args) {
	
		int numero1, numero2, numero3;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
		numero3 = Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));

		
		if(numero1 > numero2 && numero2 > numero3) {
			JOptionPane.showMessageDialog(null, "Orden: " + numero1 + " - " + numero2 + " - " + numero3);
		} else if(numero3 > numero1 && numero1 > numero2 ) {
			JOptionPane.showMessageDialog(null, "Orden: " + numero3 + " - " + numero1 + " - " + numero2);
		} else if(numero2 > numero1 && numero1 > numero3 ) {
			JOptionPane.showMessageDialog(null, "Orden: " + numero2 + " - " + numero1 + " - " + numero3);
		} else if(numero2 > numero3 && numero3 > numero1) {
		JOptionPane.showMessageDialog(null, "Orden: " + numero2 + " - " + numero3 + " - " + numero1);
	}  else if(numero3 > numero2 && numero2 > numero1) {
		JOptionPane.showMessageDialog(null, "Orden: " + numero3 + " - " + numero2 + " - " + numero1);
	}
	else {
		JOptionPane.showMessageDialog(null, "Orden: " + numero1 + " - " + numero3 + " - " + numero2);
	}
		} 

}
