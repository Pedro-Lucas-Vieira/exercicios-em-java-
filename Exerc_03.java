package lote;
//Bibliotecas do Java
//import java.util.Scanner;
import javax.swing.JOptionPane;

/*
3.	Receba a base e a altura de um triângulo. Calcule e mostre a sua área.
*/
public class Exerc_03 {

	public static void main(String[] args) {
		int base;
		int altura;
		double area;
		base   = Integer.parseInt(JOptionPane.showInputDialog("Digite a Base"));
		altura = Integer.parseInt(JOptionPane.showInputDialog("Digite a Altura"));
		area = base * altura;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
		JOptionPane.showMessageDialog(null,"A Area é: "+area);		
	}
}
