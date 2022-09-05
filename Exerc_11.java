package lote;
//Bibliotecas do Java

//import java.util.Scanner;

import javax.swing.JOptionPane;

/*
11.	Receba o raio de uma circunferência. Calcule e mostre o comprimento da circunferência.
*/
public class Exerc_11{
    

    public static void main (String[] args){
        //Scanner ler = new Scanner (System.in); // Scanner é a leitura realizada pelo teclado
        //Declaração de Variaveis
       
        double raio;
        double circunferencia;
        double pi = 3.14;
        
        //Escrita em console System
        //System.out.println("Digite o Raio");
        //raio = ler.nextDouble();
        
        //Escrita Grafica JOptionPane
        raio = Float.parseFloat(JOptionPane.showInputDialog("Digite o Raio"));
        
        //Formula
        circunferencia = (2*pi*raio);
        
        //System.out.println("A Circunferencia é: "+circunferencia);
        JOptionPane.showMessageDialog(null, "A Circunferencia é: "+circunferencia);
    }
}