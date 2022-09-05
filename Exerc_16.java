package lote;
/*
 * Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora,
             o percentual de desconto e o número de descendentes.
             Calcule o salário que serão as horas trabalhadas x o valor por hora.
             Calcule o salário líquido (= Salário Bruto – desconto).
             A cada dependente será acrescido R$ 100 no Salário Líquido. 
             Exiba o salário a receber.          
 * Programador: 
 * Data: 13/02/19
 */


import javax.swing.JOptionPane;


public class Exerc_16 {
    
    public static void main(String[] args) {
        double nHoraTrab, nValorHora, nDesconto, nSalLiq, nSalBruto;
        int nDescendente;
        
        nHoraTrab = Double.parseDouble(JOptionPane.showInputDialog
        ("Informe a Quantidade de Horas Trabalhadas"));
        
         nValorHora = Double.parseDouble(JOptionPane.showInputDialog
        ("Informe o Valor da Hora"));
         
         nDescendente = Integer.parseInt(JOptionPane.showInputDialog
        ("Informe o N° de Dependentes"));
         
         nDesconto = Double.parseDouble(JOptionPane.showInputDialog
        ("Informe o Percentual de Desconto"));
        
         nSalBruto = (nHoraTrab * nValorHora);
         nSalLiq = nSalBruto - ((nSalBruto * nDesconto)/100);
         nSalLiq = nSalLiq + (nDescendente * 100);
        
        JOptionPane.showMessageDialog(null, 
                "\nA Quantidade de Horas Trabalhadas é: "+nHoraTrab+
                "\nO Valor da Hora Trabalhada: "+nValorHora+
                "\nO N° de Dependentes é: "+nDescendente+
                "\nO Desconto é de: "+nDesconto+
                "\nO Salario Bruto é de: "+nSalBruto+
                "\nO Salario Liquido é de: "+nSalLiq);
                
    }
}