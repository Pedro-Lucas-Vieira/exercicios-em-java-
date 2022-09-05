package lote;
//Bibliotecas do Java

//import java.util.Scanner;

import javax.swing.JOptionPane;

/*
6.	Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos.
*/

public class Exerc_06{
    public static void main (String[] args){
        //Scanner ler = new Scanner (System.in); // Scanner é a leitura realizada pelo teclado
        //Declaração de Variaveis
        int X, Y, Z;

        //Escrita em console System
        //System.out.println("Digite o X");
        //X = ler.nextInt();
        //System.out.println("Digite o Y");
        //Y = ler.nextInt();
        
        //Escrita Grafica JOptionPane
        X = Integer.parseInt(JOptionPane.showInputDialog("Digite o X"));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o Y"));
        Z = X;
        X = Y;
        Y = Z;
        JOptionPane.showMessageDialog(null,"X: "+X+"\nY: "+Y);
        //System.out.println("X: "+X+"\nY: "+Y);
        
    }
        
}


    