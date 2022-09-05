package lote;
//Bibliotecas do Java

//import java.util.Scanner;

import javax.swing.JOptionPane;

/*
7.	Receba os valores do comprimento, largura e altura de um paralelepípedo. Calcule e mostre seu volume.
V = comprimento x largura x altura
*/
public class Exerc_07{
    
    public static void main (String[] args){
        //Scanner ler = new Scanner (System.in); // Scanner é a leitura realizada pelo teclado
        //Declaração de Variaveis
        float comprimento;
        float largura;
        float altura;
        float volume;
        
        //Escrita em console System
        //System.out.println("Digite o Comprimento");
        //comprimento = ler.nextFloat();
        //System.out.println("Digite a Largura");
        //largura = ler.nextFloat();
        //System.out.println("Digite a altura" );
        //altura = ler.nextFloat();
    
        //Escrita Grafica JOptionPane
        comprimento = Float.parseFloat(JOptionPane.showInputDialog("Digite o Comprimento"));
        largura     = Float.parseFloat(JOptionPane.showInputDialog("Digite a Largura"));
        altura      = Float.parseFloat(JOptionPane.showInputDialog("Digite a altura" ));
        
        //Formula
        volume = comprimento *largura * altura;
        JOptionPane.showMessageDialog(null, "Volume: "+volume);
    }
}