package lote;
//Bibliotecas Java
//import java.util.Scanner;
import javax.swing.JOptionPane;
/*
2.	Receba o salário de um funcionário e mostre o novo salário com reajuste de 15%.
*/

public class Exerc_02 {

	public static void main(String[] args) {
		//Scanner ler = new Scanner(System.in);
		double salario;
		double salarioNovo;
		//System.out.println("Digite o Salario");
        //salario = ler.nextDouble();	
        salario = Double.parseDouble(JOptionPane.showInputDialog("Salario Com Reajuste: "));
		salarioNovo = salario * 0.15 + salario;
		
		//System.out.println("Salario Com Reajuste "+salarioNovo);
		JOptionPane.showMessageDialog(null,"Salario Com Reajuste "+salarioNovo);
	}

}
