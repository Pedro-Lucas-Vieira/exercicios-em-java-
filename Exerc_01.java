package lote;
//bibliotecas do Java

//import java.util.Scanner;

import javax.swing.JOptionPane;

/*
1.	Coletar o valor do lado de um quadrado, calcular a sua area e apresentar o resultado.
Formula Matematica
Ýrea da Parede
20m x 2m = 40m². 
*/
public class Exerc_01{
    
    public static void main (String[] args){
        //Scanner ler = new Scanner (System.in); // Scanner é a leitura realizada pelo teclado
        //Declaração de Variaveis
        float lado1;
        float lado2;
        float area;

        //Escrita em console System
        //System.out.println("Digite o 1 Lado");
        //lado1 = ler.nextFloat();
        //System.out.println("Digite o 2 Lado");
        //lado2 = ler.nextFloat();

        //Escrita Grafica JOptionPane
        lado1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o 1 Lado"));
        lado2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o 2 Lado"));
        area =lado1 * lado2;
        JOptionPane.showMessageDialog(null, "AREA: "+area);
        //System.out.print("Area"+area);
    }
}