package lote;
//Bibliotecas do Java
//import java.util.Scanner;
import javax.swing.JOptionPane;

/*
4.	Receba a temperatura em graus Celsius. 
Calcule e mostre a sua temperatura convertida em fahrenheit F = (9*C+160) /5. 
*/
public class Exerc_04{
    
    public static void main (String[] args){
        //Scanner ler = new Scanner (System.in); // Scanner é a leitura realizada pelo teclado
        //Declaração de Variaveis
        double tempCel;
        double tempFah;
        String msg = "Digite a temperatura em Celcius";
        String msgResp = "A temperatura em Fahrenheit é: ";

        //Escrita em console System
        //System.out.println(msg);
        //tempCel = ler.nextInt();
        //System.out.println(msgResp+tempFah);

        //Escrita Grafica JOptionPane
        tempCel = Double.parseDouble(JOptionPane.showInputDialog(msg));
        tempFah = (9*tempCel+160)/5;
        JOptionPane.showMessageDialog(null, msgResp+tempFah, "Exercicio 03",1);
    }
}