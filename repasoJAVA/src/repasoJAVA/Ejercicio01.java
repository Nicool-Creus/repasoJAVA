package repasoJAVA;

import javax.swing.JOptionPane;

public class Ejercicio01 {

	public static void main(String[] args) {
		
		var nota1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la primera nota: "));
		
		var nota2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la segunda nota: "));
		
		var nota3 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la tercera nota: "));
		
		var promedio = (nota1 + nota2 + nota3) / 3;
		
		var evaluacion = (promedio >= 350) ? "Aprobado" : "Reprobado";
		
		JOptionPane.showMessageDialog(null, "Nota definitiva: " + promedio);
		JOptionPane.showMessageDialog(null, "Estado: " + evaluacion);
		
	}

}
