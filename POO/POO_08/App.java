package app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args){
        int esc;
        boolean exit = false;
        Fatura f1 = new Fatura();
        f1.setNum(Integer.parseInt(JOptionPane.showInputDialog("Digite o número da fatura")));
        f1.setDescription(JOptionPane.showInputDialog("Dê uma descrição ao seu produto"));
        f1.setQtd(Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade do produto")));
        f1.setPrice(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do produto")));
        while (exit == false){
            esc = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma opção \n1 - Exibir o valor da fatura\n2 - Sair do programa"));
            switch (esc) {
                case 1:
                    f1.ExibirValorFatura();
                    break;
                case 2:
                    exit = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção Inválida");
                    break;
            }
        }
    }
}