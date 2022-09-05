package lote;
//Bibliotecas do Java

//import java.util.Scanner;

import javax.swing.JOptionPane;

/*
9.	Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados. 

*/
public class Exerc_09{
    

    public static void main (String[] args){
        //Scanner ler = new Scanner (System.in); // Scanner é a leitura realizada pelo teclado
        //Declaração de Variaveis
        double quadrado;
        int numero1;
        int numero2;

        //Escrita em console System
        //System.out.println(("Digite o 1 Numero: "));
        //numero1 = ler.nextInt();
        //System.out.println(("Digite o 2 Numero: "));
        //numero2 = ler.nextInt();

        //Escrita Grafica JOptionPane
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1 Numero: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2 Numero: "));
        quadrado = (Math.pow(numero1,2) + 2 ) * numero1 * (Math.pow(numero2,2)+numero2);
       
        JOptionPane.showMessageDialog(null,"Soma dos Quadrados: "+quadrado);
        //System.out.println("Soma dos Quadrados: "+quadrado);
        
    }
}