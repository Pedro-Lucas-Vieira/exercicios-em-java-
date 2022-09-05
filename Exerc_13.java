package lote;
//Bibliotecas do Java

//import java.util.Scanner;

import javax.swing.JOptionPane;

/*
13.	Receba a quantidade de alimento em quilos. 
Calcule e mostre quantos dias durará esse alimento sabendo que a pessoa consome 50g ao dia.
*/
public class Exerc_13{
    

    public static void main (String[] args){
        //Scanner ler = new Scanner (System.in); // Scanner é a leitura realizada pelo teclado
        //Declaração de Variaveis
       
        float kilo;
        float gramaDia = 50;
        int dia;
        
        //Escrita em console System
        //System.out.println( o 1 Numero");
        //kilo = ler.nextFloat();
        
        //Escrita Grafica JOptionPane
        kilo = Float.parseFloat(JOptionPane.showInputDialog("Digite a Quantidade em Kilos: "));

        //Formula
        dia = (int)(kilo/gramaDia);
        //System.out.println("Dias de Duracao: "+dia);
        JOptionPane.showMessageDialog(null, "Dias de Duracao: "+dia);
    }
}