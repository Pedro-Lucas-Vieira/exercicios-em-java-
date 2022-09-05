package lote;
//Bibliotecas do Java

//import java.util.Scanner;

import javax.swing.JOptionPane;

/*
12.	Receba o ano de nascimento e o ano atual. 
Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
*/
public class Exerc_12{
    

    public static void main (String[] args){
        //Scanner ler = new Scanner (System.in); // Scanner é a leitura realizada pelo teclado
        //Declaração de Variaveis
        int dataAtual;
        int dataNasc;
        int idadeAtual;
        int novaIdade;

        //Escrita em console System
        //System.out.println("Digite a Data de Nascimento: ");
        //dataNasc = ler.nextInt();
        //System.out.println("Digite a Data Atual: ");
        //dataAtual = ler.nextInt();

        //Escrita Grafica JOptionPane
        dataNasc  = Integer.parseInt(JOptionPane.showInputDialog("Digite a Data de Nascimento: "));
        dataAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite a Data Atual: "));
        idadeAtual = dataAtual - dataNasc;
        novaIdade = idadeAtual + 17;
       
        JOptionPane.showMessageDialog(null,"Idade Atual: "+idadeAtual+"\nIdade Em 17 Anos: "+novaIdade);
        //System.out.println("Soma dos Quadrados: "+quadrado);
        
    }
}