package lote;
//Bibliotecas do Java

//import java.util.Scanner;

import javax.swing.JOptionPane;

/*

10.	Receba 2 números reais. Calcule e mostre a diferença desses valores.
*/
public class Exerc_10{
    

    public static void main (String[] args){
        //Scanner ler = new Scanner (System.in); // Scanner é a leitura realizada pelo teclado
        //Declaração de Variaveis
       
        float numero1;
        float numero2;
        float diferenca;
        
        //Escrita em console System
        //System.out.println("Digite o 1 Numero");
        //numero1 = ler.nextFloat();
        //System.out.println("Digite o 2 Numero");
        //numero2 = ler.nextFloat();
        
       
        
        //Escrita Grafica JOptionPane
        numero1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o 1 Numero"));
        numero2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o 2 Numero"));
        
        //Formula
        if(numero1 > numero2){
            diferenca = numero1 - numero2;
        }else{
            diferenca = numero2 - numero1;
        }
        //System.out.println(""A Diferença é: "+diferenca);
        JOptionPane.showMessageDialog(null, "A Diferença é: "+diferenca);
    }
}