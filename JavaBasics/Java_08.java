package brabo;

import javax.swing.JOptionPane;

public class Brabo {

    public static void main(String[] args) {
        float sal, vendas;
        double lucro=0;
        String nome;
        nome = JOptionPane.showInputDialog("Digite seu nome");
        sal = Float.parseFloat(JOptionPane.showInputDialog("Digite o seu salário"));
        vendas = Float.parseFloat(JOptionPane.showInputDialog("Digite suas vendas (em dinheiro)"));

        lucro = (vendas*0.15) + sal;
        JOptionPane.showMessageDialog(null, "Olá "+nome+" esse mês você ganhará "+lucro+" em vez de"+sal);
    }
}
