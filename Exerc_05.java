package lote;
//Biblioteca do Java

import javax.swing.JOptionPane;

/*
Apartir desse momento vou utilizar apenas o JOptionPane para exibir mensagens

5.	Receba os coeficientes A, B e C de uma equação do 2º grau (AX²+BX+C=0).
 Calcule e mostre as raízes reais (considerar que a equação possue2 raízes).
. 

*/
public class Exerc_05{
    

    public static void main (String[] args){
        
        //Declaração de Variaveis
        int A;
        int B;
        int C;
        double X1;
        double X2;
        double delta;
        String msg = "Digite o Valor de ";

        /*Antes de atribuir o valor a variavel tem que fazer a conversao
        usando parseInt a String é convertida para numero do tipo inteiro.EX(Double.parseDouble)
        */
        A = Integer.parseInt(JOptionPane.showInputDialog(msg+ "A: "));
        B = Integer.parseInt(JOptionPane.showInputDialog(msg+ "B: "));
        C = Integer.parseInt(JOptionPane.showInputDialog(msg+ "C: "));
        
        delta = (B*B)-4*A*C;

        X1 = ((-B) + (Math.sqrt(delta))) / 2 * A;//Math.sqrt - Função do java para retirar a a raiz quadrada de qualquer valor
        X2 = ((-B) - (Math.sqrt(delta))) / 2 * A;//Aqui usada para tirar a raiz de delta 

        JOptionPane.showMessageDialog(null, "X1: "+X1+"\nX2: "+X2, "Exercicio 05",1);
    }
}