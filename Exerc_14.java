package lote;
//Bibliotecas do Java

//import java.util.Scanner;

import javax.swing.JOptionPane;

/*
14.	Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo
*/
public class Exerc_14{
    
    public static void main (String[] args){
        //Scanner ler = new Scanner (System.in); // Scanner é a leitura realizada pelo teclado
        //Declaração de Variaveis
       
        float angulo1;
        float angulo2;
        float angulo3;
        
        //Escrita em console System
        //System.out.println("Digite o 1 Angulo: ");
        //angulo1 = ler.nextFloat();
        //System.out.println("Digite o 2 Angulo: ");
        //angulo2 = ler.nextFloat();
        
        //Escrita Grafica JOptionPane
        angulo1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o 1 Angulo: "));
        angulo2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o 2 Angulo: "));

        //Formula
        angulo3 = 180 - (angulo1-angulo2);
        //System.out.println("Angulo 3: "+angulo3);
        JOptionPane.showMessageDialog(null, "Angulo 3: "+angulo3);
    }
}