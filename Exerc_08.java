package lote;
//Bibliotecas do Java

//import java.util.Scanner;

import javax.swing.JOptionPane;

/*
8.	Receba o valor de um depósito em poupança. 
    Calcule e mostre o valor após 1 mês de aplicação sabendo que rende 1,3% a. m. 
*/
public class Exerc_08{
    

    public static void main (String[] args){
        //Scanner ler = new Scanner (System.in); // Scanner é a leitura realizada pelo teclado
        //Declaração de Variaveis
        double deposito;
        double valorAtual;
        double juros = 1.3;

        //Escrita em console System
        //System.out.println("Digite o Valor do Deposito: ");
        //deposito = ler.nextDouble);
        
        //Escrita Grafica JOptionPane
        deposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor do Deposito: "));
        valorAtual = ((deposito * juros) / 100) + deposito;
        JOptionPane.showMessageDialog(null, "Valor Apos 1 Mes: "+valorAtual);
        //System.out.println("Valor Apos 1 Mes: "+valorAtual);
    }
}