package lote;
//Bibliotecas do Java

//import java.util.Scanner;

import javax.swing.JOptionPane;

/*
15.	Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa.
*/
public class Exerc_15{
    
    public static void main (String[] args){
        //Scanner ler = new Scanner (System.in); // Scanner é a leitura realizada pelo teclado
        //Declaração de Variaveis
       
        double cateto1;
        double cateto2;
        double hipotenusa;
        
        //Escrita em console System
        //System.out.println("Digite o 1 Angulo: ");
        //cateto1 = ler.nextFloat();
        //System.out.println("Digite o 2 Angulo: ");
        //cateto1 = ler.nextFloat();
        
        //Escrita Grafica JOptionPane
        cateto1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 1 Cateto: "));
        cateto2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o 2 Cateto: "));

        //Formula
        hipotenusa = Math.pow(cateto1,2) + Math.pow(cateto2,2);
        hipotenusa = Math.sqrt(hipotenusa);
        //System.out.println("Angulo 3: "+angulo3);
        JOptionPane.showMessageDialog(null, "Hipotenusa: "+hipotenusa);
    }
}